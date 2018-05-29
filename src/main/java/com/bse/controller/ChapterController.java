package com.bse.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bse.entity.Book;
import com.bse.entity.Chapter;
import com.bse.entity.Profession;
import com.bse.service.BookService;
import com.bse.service.ChapterService;
import com.bse.service.ProfessionService;

@Controller  
@RequestMapping("/chapter") 
public class ChapterController {
	@Autowired  
    private ChapterService cs; 
	@Autowired  
    private BookService bs; 
	@RequestMapping("/getAllChapter")  
    public String getAllChapter(HttpServletRequest request,Model model){  
		ArrayList<Book> books=bs.selectAll();
        model.addAttribute("books", books);   
       ArrayList<Chapter> chapters=cs.selectAll();
        model.addAttribute("chapters", chapters);   
        return "sectionmanager";  
    }  
	@RequestMapping("/deleteC")  
    public String deleteC(HttpServletRequest request,Model model,int id){  
           cs.deleteC(id);  
        return "redirect:/chapter/getAllChapter";  
    }  
	@RequestMapping("/insertC")  
    public String insertC(HttpServletRequest request,Model model,int bid,int number,String cname){  
           Chapter c=new Chapter(); 
           c.setcName(cname);
           c.setbId(bid);
           c.setcNumber(number);
           cs.insertC(c);
        return "redirect:/chapter/getAllChapter";  
    }
	@RequestMapping("/updateC")  
    public String updateC(HttpServletRequest request,Model model,int cid,int number,String cname){  
           Chapter c=new Chapter(); 
           c.setcName(cname);
           c.setcNumber(number);
           cs.insertC(c);
        return "redirect:/chapter/getAllChapter";  
    }
	@RequestMapping("/selectC")  
    public String selectC(HttpServletRequest request,Model model,int id){  
           Chapter chapter=cs.selectByPrimaryKey(id);
           model.addAttribute("chapter", chapter);   
        return "redirect:/chapter/updateC";  
    }
}
