package com.bse.Idao;

import com.bse.entity.PaperQuestion;

public interface IPaperQuestionDao {
    int deleteByPrimaryKey(Integer pqId);

    int insert(PaperQuestion record);

    int insertSelective(PaperQuestion record);

    PaperQuestion selectByPrimaryKey(Integer pqId);

    int updateByPrimaryKeySelective(PaperQuestion record);

    int updateByPrimaryKey(PaperQuestion record);
}