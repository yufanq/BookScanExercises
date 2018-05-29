package com.bse.Idao;

import java.util.ArrayList;

import com.bse.entity.Profession;
import com.bse.entity.ProfessionBook;

public interface IProfessionDao {
    int deleteByPrimaryKey(Integer pId);
 
    int insert(Profession record);

    int insertSelective(Profession record);

    Profession selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Profession record);

    int updateByPrimaryKey(Profession record);
    
    public ArrayList<Profession> selectAll();
    public void updateP(Profession p);
    public void insertP(Profession p);
    public void deleteP(int id);
    //为专业添加图书
    public void insertPB(ProfessionBook pb);
}