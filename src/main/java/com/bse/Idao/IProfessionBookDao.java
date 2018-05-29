package com.bse.Idao;

import com.bse.entity.ProfessionBook;

public interface IProfessionBookDao {
    int deleteByPrimaryKey(Integer pbId);

    int insert(ProfessionBook record);

    int insertSelective(ProfessionBook record);

    ProfessionBook selectByPrimaryKey(Integer pbId);

    int updateByPrimaryKeySelective(ProfessionBook record);

    int updateByPrimaryKey(ProfessionBook record);
}