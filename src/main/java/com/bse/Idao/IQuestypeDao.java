package com.bse.Idao;

import com.bse.entity.Questype;

public interface IQuestypeDao {
    int deleteByPrimaryKey(Integer tId);

    int insert(Questype record);

    int insertSelective(Questype record);

    Questype selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Questype record);

    int updateByPrimaryKey(Questype record);
}