package com.bse.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bse.bean.Page;
import com.bse.entity.Role;
import com.bse.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService rs;
	
	@RequestMapping("/showRoles")
	public String showRoles(@RequestParam(value="pn",required=false,defaultValue="1") int pageIndex,Map <String,Object> map){
		Page page=new Page(pageIndex);
		page.setTotalCount(rs.selectTotalCount());
		
		map.put("roles", rs.selectAll(page.getPageSize(), page.getPageIndex()));
		map.put("page",page);
		return "rolemanager";
	}
	@RequestMapping(value="/addRole",method=RequestMethod.POST)
	public String addAdmin(Role role){
		System.out.println(role.toString());
		if(rs.insertSelective(role)){
			return "redirect:/admin/showAdmins";
		}
		return "error";
		
	}
}
