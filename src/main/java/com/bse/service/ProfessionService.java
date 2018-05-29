package com.bse.service;

import java.util.ArrayList;

import com.bse.entity.Profession;
import com.bse.entity.ProfessionBook;

public interface ProfessionService {
         public ArrayList<Profession> selectAll();
         public void updateP(Profession p);
         public void insertP(Profession p);
         public void deleteP(int id);
         public void insertPB(ProfessionBook pb);
}
