package com.bse.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bse.bean.Page;
import com.bse.entity.Jurisdiction;
import com.bse.entity.Role;
import com.bse.service.JurisdictionService;

@Controller
@RequestMapping("/jurisdiction")
public class JurisdictionController {
	
	@Autowired
	private JurisdictionService js;
	
	@RequestMapping("/showJurisdictions")
	
	public String showJurisdictions(@RequestParam(value="pn",required=false,defaultValue="1") int pageIndex,Map <String,Object> map){
		Page page=new Page(pageIndex);
		page.setTotalCount(js.selectTotalCount());
		
		map.put("jurisdictions", js.selectAll(page.getPageSize(), page.getPageIndex()));
		map.put("page",page);
		return "jurisdictionmanager";
	}
	
	@RequestMapping(value="/addJurisdiction",method=RequestMethod.POST)
	public String addAdmin(Jurisdiction jurisdiction){
		System.out.println(jurisdiction.toString());
		if(js.insertSelective(jurisdiction)){
			return "redirect:/admin/showAdmins";
		}
		return "error";
		
	}

}
