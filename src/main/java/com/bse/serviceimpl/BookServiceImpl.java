package com.bse.serviceimpl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bse.Idao.IBookDao;
import com.bse.Idao.IProfessionDao;
import com.bse.entity.Book;
import com.bse.entity.Profession;
import com.bse.service.BookService;
import com.bse.service.ProfessionService;
@Service  
@Transactional 
 
public class BookServiceImpl implements BookService {
	@Resource  
	private IBookDao bd;

	@Override
	public ArrayList<Book> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Book> books=bd.selectAll();
		return books;
	}

	@Override
	public void updateB(Book b) {
		// TODO Auto-generated method stub
		bd.updateB(b);
	}

	@Override
	public void insertB(Book b) {
		// TODO Auto-generated method stub
		bd.insertB(b);
	}

	@Override
	public void deleteB(int id) {
		// TODO Auto-generated method stub
		bd.deleteB(id);
	}

	@Override
	public Book selectByPrimaryKey(Integer bId) {
		// TODO Auto-generated method stub
		return bd.selectByPrimaryKey(bId);
	}
	
}
