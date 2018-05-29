package com.bse.Idao;

import com.bse.entity.Jurisdiction;

public interface IJurisdictionDao {
    int deleteByPrimaryKey(Integer jId);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jId);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}