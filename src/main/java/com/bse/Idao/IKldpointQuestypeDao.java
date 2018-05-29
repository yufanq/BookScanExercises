package com.bse.Idao;

import com.bse.entity.KldpointQuestype;

public interface IKldpointQuestypeDao {
    int deleteByPrimaryKey(Integer ptId);

    int insert(KldpointQuestype record);

    int insertSelective(KldpointQuestype record);

    KldpointQuestype selectByPrimaryKey(Integer ptId);

    int updateByPrimaryKeySelective(KldpointQuestype record);

    int updateByPrimaryKey(KldpointQuestype record);
}