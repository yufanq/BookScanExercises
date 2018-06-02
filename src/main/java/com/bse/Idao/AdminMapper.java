package com.bse.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bse.entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer aId);

    int insertSelective(Admin record);

    Admin selectPermissionsAll(String aAccount);

    int updateByPrimaryKeySelective(Admin record);
    
    List<Admin> selectAll(@Param("pageSize") int pageSize,@Param("pageIndex") int pageIndex);

    int selectTotalCount();
    
}