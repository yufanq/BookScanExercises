package com.bse.Idao;

import com.bse.entity.Kldpoint;

public interface IKldpointDao {
    int deleteByPrimaryKey(Integer pId);

    int insert(Kldpoint record);

    int insertSelective(Kldpoint record);

    Kldpoint selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Kldpoint record);

    int updateByPrimaryKey(Kldpoint record);
}