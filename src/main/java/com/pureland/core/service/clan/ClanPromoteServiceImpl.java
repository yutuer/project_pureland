package com.pureland.core.service.clan;

import com.google.common.collect.Lists;
import com.pureland.common.db.data.clan.Clan;
import com.pureland.common.db.data.clan.ClanMember;
import com.pureland.common.enums.clan.ClanPositionServerEnum;
import com.pureland.common.error.CoreException;
import com.pureland.common.service.bean.clan.ClanBean;
import com.pureland.common.service.helper.ClanHelper;
import com.pureland.common.service.impl.ClanCommonServiceImpl;

import java.util.List;

/**
 * Created by Administrator on 2015/3/14.
 */
public class ClanPromoteServiceImpl extends ClanCommonServiceImpl implements ClanLogicService {

    @Override
    public List<Clan> clanLogic(ClanBean clanBean) throws CoreException {
        Long userRaceId = clanBean.getClanBaseBean().getUserRaceId();
        //获取玩家公会
        ClanMember clanMemberSelf = super.getClanMemberInfo(userRaceId);
        Long operaId = clanBean.getOperaId();
        ClanMember clanMemberOper = super.getClanMemberInfo(operaId);

        //判断属于同一个公会
        if (clanMemberSelf.getClanId() == null || clanMemberOper.getClanId() == null || clanMemberSelf.getClanId().longValue() != clanMemberOper.getClanId().longValue()) {
            throw new CoreException("不属于同一个公会,不能操作");
        }

        //判断权限
        if (clanMemberSelf.getClanPosition() >= clanMemberOper.getClanPosition()) {
            throw new CoreException("不能操作比自己职位高的或者相等的成员");
        }

        //根据要提升到的职位判断人数
        ClanPositionServerEnum movePostion = ClanPositionServerEnum.values()[clanMemberOper.getClanPosition() - 1];
        int num = super.getNumsByPostion(clanMemberSelf.getClanId(), movePostion.ordinal());
        if (movePostion == ClanPositionServerEnum.Vice_ChairMan) {
            if (num == ClanHelper.Vicechairmannum) {
                throw new CoreException("副会长人数已满");
            }
        } else if (movePostion == ClanPositionServerEnum.Officer) {
            if (num == ClanHelper.OfficerNum) {
                throw new CoreException("官员人数已满");
            }
        }

        clanMemberOper.setClanPosition(movePostion.ordinal());
        super.updateClanMember(clanMemberOper);

        List<Clan> ret = Lists.newArrayList();
        Clan clan = new Clan();
        ret.add(clan);
        clan.getClanMemberList().add(clanMemberOper);
        return ret;
    }
}
