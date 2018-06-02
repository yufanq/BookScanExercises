package com.bse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.Idao.JurisdictionMapper;
import com.bse.entity.Jurisdiction;
import com.bse.service.JurisdictionService;
@Service("jurisdictionService")
public class JurisdictionServiceImpl implements JurisdictionService{

	@Autowired
	private JurisdictionMapper jm;
	@Override
	public boolean deleteByPrimaryKey(Integer jId) {
		// TODO Auto-generated method stub
		return jm.deleteByPrimaryKey(jId)==0?false:true;
	}

	@Override
	public boolean insertSelective(Jurisdiction record) {
		// TODO Auto-generated method stub
		return jm.insertSelective(record)==0?false:true;
	}

	@Override
	public Jurisdiction selectByPrimaryKey(Integer jId) {
		// TODO Auto-generated method stub
		return jm.selectByPrimaryKey(jId);
	}

	@Override
	public boolean updateByPrimaryKeySelective(Jurisdiction record) {
		// TODO Auto-generated method stub
		return jm.updateByPrimaryKeySelective(record)==0?false:true;
	}

	@Override
	public List<Jurisdiction> selectAll(int pageSize, int pageIndex) {
		// TODO Auto-generated method stub
		return jm.selectAll(pageSize,  (pageIndex-1)*pageSize);
	}

	@Override
	public int selectTotalCount() {
		// TODO Auto-generated method stub
		return jm.selectTotalCount();
	}

}
