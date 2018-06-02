package com.bse.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bse.entity.Jurisdiction;

public interface JurisdictionService {

	boolean deleteByPrimaryKey(Integer jId);

    boolean insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jId);

    boolean updateByPrimaryKeySelective(Jurisdiction record);

    List<Jurisdiction> selectAll(@Param("pageSize") int pageSize,@Param("pageIndex") int pageIndex);

    int selectTotalCount();
}
