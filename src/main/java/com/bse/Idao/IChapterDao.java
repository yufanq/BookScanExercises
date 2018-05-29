package com.bse.Idao;

import java.util.ArrayList;

import com.bse.entity.Chapter;

public interface IChapterDao {
    int deleteByPrimaryKey(Integer cId);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);
    public ArrayList<Chapter> selectAll();
    public void updateC(Chapter c);
    public void insertC(Chapter c);
    public void deleteC(int id);
    //通过图书id获取专业图书id
    public int selectPBid(int bid);
}