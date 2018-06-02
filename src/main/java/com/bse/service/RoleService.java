package com.bse.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bse.entity.Role;

public interface RoleService {

	boolean deleteByPrimaryKey(Integer rId);

    boolean insertSelective(Role record);

    Role selectByPrimaryKey(Integer rId);

    boolean updateByPrimaryKeySelective(Role record);
    
    List<Role> selectAll(@Param("pageSize") int pageSize,@Param("pageIndex") int pageIndex);

    int selectTotalCount();
}
