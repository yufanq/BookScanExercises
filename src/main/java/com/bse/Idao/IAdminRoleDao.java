package com.bse.Idao;

import com.bse.entity.AdminRole;

public interface IAdminRoleDao {
    int deleteByPrimaryKey(Integer arId);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    AdminRole selectByPrimaryKey(Integer arId);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);
}