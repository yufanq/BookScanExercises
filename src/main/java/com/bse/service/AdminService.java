package com.bse.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.bse.entity.Admin;

public interface AdminService {
	
	boolean deleteByPrimaryKey(Integer aId);

	boolean insertSelective(Admin record);

    boolean updateByPrimaryKeySelective(Admin record);
    
    List<Admin> selectAll(@Param("pageSize") int pageSize,@Param("pageIndex") int pageIndex);

    int selectTotalCount();
    
    Admin selectPermissionsAll(String username);
}
