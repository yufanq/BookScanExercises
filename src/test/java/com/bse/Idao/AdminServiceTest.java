package com.bse.Idao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bse.entity.Admin;
import com.bse.service.AdminService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/Spring-Mybatis.xml")
public class AdminServiceTest {
	@Autowired
	private AdminService adminService;
	
	@Test
	public void testDeleteByPrimaryKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertSelective() {
		Admin a = new Admin();
		a.setaAccount("admin6");
		a.setaPassword("admin6");
		adminService.insertSelective(a);
		System.out.println(a);
		
	}

	@Test
	public void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectTotalCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectPermissionsAll() {
		fail("Not yet implemented");
	}

}
