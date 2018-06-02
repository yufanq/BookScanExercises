package com.bse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.Idao.RoleMapper;
import com.bse.entity.Role;
import com.bse.service.RoleService;
@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleMapper rm;
	@Override
	public boolean deleteByPrimaryKey(Integer rId) {
		// TODO Auto-generated method stub
		return rm.deleteByPrimaryKey(rId)==0?false:true;
	}

	@Override
	public boolean insertSelective(Role record) {
		// TODO Auto-generated method stub
		return rm.insertSelective(record)==0?false:true;
	}

	@Override
	public Role selectByPrimaryKey(Integer rId) {
		// TODO Auto-generated method stub
		return rm.selectByPrimaryKey(rId);
	}

	@Override
	public boolean updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return rm.updateByPrimaryKeySelective(record)==0?false:true;
	}

	@Override
	public List<Role> selectAll(int pageSize, int pageIndex) {
		// TODO Auto-generated method stub
		return rm.selectAll(pageSize,  (pageIndex-1)*pageSize);
	}

	@Override
	public int selectTotalCount() {
		// TODO Auto-generated method stub
		return rm.selectTotalCount();
	}

}
