package com.bse.service;

import java.util.ArrayList;

import com.bse.entity.Book;
import com.bse.entity.Profession;

public interface BookService {
         public ArrayList<Book> selectAll();
         public void updateB(Book b);
         public void insertB(Book b);
         public void deleteB(int id);
         Book selectByPrimaryKey(Integer bId);
}
