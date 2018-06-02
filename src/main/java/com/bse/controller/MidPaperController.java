/**
 * 
 */
package com.bse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bse.entity.Paper;
import com.bse.service.PaperService;

/**
*  <p>Title: MidPaperController</p>
*  <p>Description: </p>
*  <p>Company: </p>
*  @author BOY
*  @date 2018年5月30日 上午11:34:59
*/
@Controller
@RequestMapping("/midPaper")
public class MidPaperController {
	@Autowired
	private PaperService paperService;
	
	private static final String paperType="期中"; 
	
	private static int pageSize=5;
	
	@RequestMapping("/selectAllPapersByPage")
	public ModelAndView selectAllPapers(String page){
		ModelAndView modelAndView=new ModelAndView();
		//获得总条数
		List<Paper> selectAllPapers = paperService.selectAllPapersByName(paperType);
		int totalRecord=selectAllPapers.size();
		
		modelAndView.addObject("totalRecord", totalRecord );
		
		//总页数
		int totalPape;
		if(totalRecord%pageSize==0){
			totalPape=totalRecord/pageSize;
		}else{
			totalPape=totalRecord/pageSize+1;		
		}
		modelAndView.addObject("totalPape",totalPape);
		
		//页面初始时page没有值
		if(page==null)
			page="1";
		//查询开始行，并行分页查询
		int startRow=(Integer.parseInt(page)-1)*pageSize;
		selectAllPapers=paperService.selectAllPapersByNameAndPage(paperType, startRow, pageSize);
	

		modelAndView.addObject("midPapers", selectAllPapers);
		modelAndView.addObject("page", page);
		modelAndView.setViewName("themedtermpapermanager");
		
		return modelAndView;
		
	}
	/**
	 * 更新试卷名字
	 * @param pId
	 * @param paperName
	 * @return
	 */
	@RequestMapping("/updatePaper")
	public String  updatePaper(Integer pId,String paperName){
		//更新试卷名字
		paperService.updatePaperById(paperName, pId);
		
		
		//重定向查询试卷
		return "redirect:selectAllPapersByPage.do";
		
	}
	@RequestMapping("/deletePaper")
	public String deletePaper(Integer pId){
		//根据试卷id删除试卷
		paperService.deletePaperById(pId);

		
		//重定向查询试卷
				return "redirect:selectAllPapersByPage.do";
	}

}
