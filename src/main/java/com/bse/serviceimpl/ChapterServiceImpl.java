package com.bse.serviceimpl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bse.Idao.IChapterDao;
import com.bse.entity.Chapter;
import com.bse.service.ChapterService;
@Service  
@Transactional 
 
public class ChapterServiceImpl implements ChapterService {
	@Resource  
	private IChapterDao cd;

	@Override
	public ArrayList<Chapter> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Chapter> cs=cd.selectAll();
		return cs;
	}

	@Override
	public void updateC(Chapter c) {
		// TODO Auto-generated method stub
		cd.updateC(c);
	}

	@Override
	public void insertC(Chapter c) {
		// TODO Auto-generated method stub
		cd.insertC(c);
	}

	@Override
	public void deleteC(int id) {
		// TODO Auto-generated method stub
		cd.deleteC(id);
	}

	@Override
	public int selectPBid(int bid) {
		// TODO Auto-generated method stub
		return cd.selectPBid(bid);
	}

	@Override
	public Chapter selectByPrimaryKey(Integer cId) {
		// TODO Auto-generated method stub
		return cd.selectByPrimaryKey(cId);
	}

	
	
}
