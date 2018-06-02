package com.bse.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bse.entity.Jurisdiction;

public interface JurisdictionMapper {
    int deleteByPrimaryKey(Integer jId);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jId);

    int updateByPrimaryKeySelective(Jurisdiction record);

    List<Jurisdiction> selectAll(@Param("pageSize") int pageSize,@Param("pageIndex") int pageIndex);

    int selectTotalCount();
}