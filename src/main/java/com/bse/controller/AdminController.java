package com.bse.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bse.bean.Page;
import com.bse.entity.Admin;
import com.bse.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService as;
	@RequestMapping("/showAdmins")
	public String showAdmins(@RequestParam(value="pn",required=false,defaultValue="1") int pageIndex,Map <String,Object> map){
		Page page=new Page(pageIndex);
		page.setTotalCount(as.selectTotalCount());
		for (Admin a : as.selectAll(page.getPageSize(), page.getPageIndex())) {
			System.out.println(a.toString());
		}
		map.put("admins", as.selectAll(page.getPageSize(), page.getPageIndex()));
		map.put("page",page);
		return "adminmanager";
	}
	@RequestMapping(value="/addAdmin",method=RequestMethod.POST)
	public String addAdmin(Admin admin){
		System.out.println(admin.toString());
		if(as.insertSelective(admin)){
			return "redirect:/admin/showAdmins";
		}
		return "error";
		
	}
}
