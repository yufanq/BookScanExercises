package com.bse.Idao;

import java.util.ArrayList;

import com.bse.entity.Book;

public interface IBookDao {
    int deleteByPrimaryKey(Integer bId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    public ArrayList<Book> selectAll();
    public void updateB(Book b);
    public void insertB(Book b);
    public void deleteB(int id);
}