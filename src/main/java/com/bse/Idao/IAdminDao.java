package com.bse.Idao;

import com.bse.entity.Admin;

public interface IAdminDao {
	int deleteByPrimaryKey(Integer aId);

	int insert(Admin record);

	int insertSelective(Admin record);

	Admin selectByPrimaryKey(Integer aId);

	int updateByPrimaryKeySelective(Admin record);

	int updateByPrimaryKey(Admin record);
}