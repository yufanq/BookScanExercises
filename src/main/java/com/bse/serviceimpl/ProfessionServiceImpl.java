package com.bse.serviceimpl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bse.Idao.IProfessionDao;
import com.bse.entity.Profession;
import com.bse.entity.ProfessionBook;
import com.bse.service.ProfessionService;
@Service  
@Transactional 
 
public class ProfessionServiceImpl implements ProfessionService {
	@Resource  
	private IProfessionDao pd;
	@Override
	public ArrayList<Profession> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Profession> ps=pd.selectAll();
		return ps;
	}

	@Override
	public void updateP(Profession p) {
		// TODO Auto-generated method stub
		pd.updateP(p);
	}

	@Override
	public void insertP(Profession p) {
		// TODO Auto-generated method stub
		pd.insertP(p);
	}

	@Override
	public void deleteP(int id) {
		// TODO Auto-generated method stub
		pd.deleteP(id);
	}

	@Override
	public void insertPB(ProfessionBook pb) {
		// TODO Auto-generated method stub
		pd.insertPB(pb);
	}

}
