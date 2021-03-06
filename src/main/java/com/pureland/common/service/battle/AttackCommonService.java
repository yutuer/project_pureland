package com.pureland.common.service.battle;

import java.util.List;

import com.pureland.common.db.data.battle.Attack;
import com.pureland.common.error.CoreException;

public interface AttackCommonService {

	public Long addAttack(Attack attack) throws CoreException;
	
	public List<Attack> getAttacks(Long userRaceId) throws CoreException;
}
