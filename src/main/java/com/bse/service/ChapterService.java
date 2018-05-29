package com.bse.service;

import java.util.ArrayList;

import com.bse.entity.Chapter;
import com.bse.entity.Profession;

public interface ChapterService {
         public ArrayList<Chapter> selectAll();
         public void updateC(Chapter c);
         public void insertC(Chapter c);
         public void deleteC(int id);
         public int selectPBid(int bid);
         Chapter selectByPrimaryKey(Integer cId);
}
