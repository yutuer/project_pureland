package com.pureland.seria.service.building;

import com.pureland.common.db.statics.EntityModel;
import com.pureland.common.enums.BuildingServerStatus;
import com.pureland.common.error.CoreException;
import com.pureland.common.service.UserRaceCommonService;
import com.pureland.common.service.WorkerQueueCommonService;
import com.pureland.common.service.bean.BuildingUpgradeBean;
import com.pureland.common.service.bean.ResourceCostBean;
import com.pureland.common.service.impl.UserRaceCommonServiceImpl;
import com.pureland.common.service.impl.WorkerQueueCommonServiceImpl;
import com.pureland.common.util.SpringContextUtil;
import com.pureland.core.init.EntityModelHelper;
import com.pureland.seria.db.dao.BuildingDao;
import com.pureland.seria.db.seriaData.building.Building;

public class BuildUpgradeLogicCancel extends BuildUpgradeLogicSeria {
	private UserRaceCommonService userRaceCommonService = (UserRaceCommonService) SpringContextUtil.getBean(UserRaceCommonServiceImpl.class.getSimpleName());
	private WorkerQueueCommonService queueService = (WorkerQueueCommonService) SpringContextUtil.getBean(WorkerQueueCommonServiceImpl.class.getSimpleName());
	private BuildingDao buildingSeriaDAO = (BuildingDao) SpringContextUtil.getBean(BuildingDao.class.getSimpleName());

	@Override
	protected void upgradeBuilding0(BuildingUpgradeBean buildingUpgradeBean, Building building) throws CoreException {
		Long userRaceId = buildingUpgradeBean.getUserRaceId();
		Long sid = buildingUpgradeBean.getSid();
		long endTime = buildingUpgradeBean.getEndTime();
		String costType = buildingUpgradeBean.getCostType();

		BuildingServerStatus status = building.getStatus();
		if (!BuildingServerStatus.UPGRADE.getId().equals(status.getId())) {
			throw new CoreException("cancel upgradeBuilding status is illegal, sid = " + sid + ", status = " + status.getName());
		}
		// 验证是否在workqueue队列中
		if (!queueService.isInWorkerQueues(userRaceId, sid)) {
			throw new CoreException(String.format("不在工作队列中 ,sid:%d \n", sid));
		}

		Integer cid = building.getCid();
		EntityModel em = EntityModelHelper.ENTITIES.get(cid);
		int upgradeId = em.getUpgradeId();
		EntityModel entityModel = EntityModelHelper.ENTITIES.get(upgradeId);
		// 修改建筑状态
		building.setStatus(BuildingServerStatus.ON);
		buildingSeriaDAO.updateBuilding(building);
		// 返还一半的消耗
		userRaceCommonService.resourceAdd(new ResourceCostBean(userRaceId, costType, entityModel.getCostResourceCount() / 2));
		// 出队
		queueService.removeWorkerQuene(userRaceId, sid);
	}

}
