package com.bse.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bse.entity.Admin;
import com.bse.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rId);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Role record);
    
    List<Role> selectAll(@Param("pageSize") int pageSize,@Param("pageIndex") int pageIndex);

    int selectTotalCount();

}