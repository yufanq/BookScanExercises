package com.bse.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bse.Idao.AdminMapper;
import com.bse.entity.Admin;
import com.bse.service.AdminService;
@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper am;
	@Autowired
	private PasswordHelper passwordHelper;
	@Override
	public boolean deleteByPrimaryKey(Integer aId) {
		// TODO Auto-generated method stub
		return am.deleteByPrimaryKey(aId)==0?false:true;
	}

	@Override
	public boolean insertSelective(Admin record) {
		// TODO Auto-generated method stub
		if(record.getaPassword()!=null){
			passwordHelper.encryptPassword(record);
		}
		return am.insertSelective(record)==0?false:true;
	}

	@Override
	public boolean updateByPrimaryKeySelective(Admin record) {
		// TODO Auto-generated method stub
		if(record.getaPassword()!=null){
			passwordHelper.encryptPassword(record);
		}
		return am.updateByPrimaryKeySelective(record)==0?false:true;
	}

	@Override
	public List<Admin> selectAll(int pageSize, int pageIndex) {
		// TODO Auto-generated method stub
		return am.selectAll(pageSize, (pageIndex-1)*pageSize);
	}

	@Override
	public int selectTotalCount() {
		// TODO Auto-generated method stub
		return am.selectTotalCount();
	}

	@Override
	public Admin selectPermissionsAll(String username) {
		// TODO Auto-generated method stub
		return am.selectPermissionsAll(username);
	}

}
