package com.bse.Idao;

import com.bse.entity.Paper;

public interface IPaperDao {
    int deleteByPrimaryKey(Integer pId);

    int insert(Paper record);

    int insertSelective(Paper record);

    Paper selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}