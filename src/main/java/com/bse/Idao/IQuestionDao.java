package com.bse.Idao;

import com.bse.entity.Question;

public interface IQuestionDao {
    int deleteByPrimaryKey(Integer qId);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer qId);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}