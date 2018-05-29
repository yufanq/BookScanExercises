package com.bse.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bse.entity.Book;
import com.bse.entity.Profession;
import com.bse.entity.ProfessionBook;
import com.bse.service.BookService;
import com.bse.service.ProfessionService;

@Controller  
@RequestMapping("/profession") 
public class ProfessionController {
	@Autowired  
	private BookService bs; 
	@Autowired
    private ProfessionService ps; 
	@RequestMapping("/getAllProfession")  
    public String getAllProfession(HttpServletRequest request,Model model){  
		ArrayList<Book> books=bs.selectAll();
        model.addAttribute("books", books);   
       ArrayList<Profession> professions=ps.selectAll();
        model.addAttribute("professions", professions);   
        return "majormanager";  
    }  
	@RequestMapping("/deleteP")  
    public String deleteP(HttpServletRequest request,Model model,int id){  
           ps.deleteP(id);  
        return "redirect:/profession/getAllProfession";  
    }  
	@RequestMapping("/insertPB")  
    public String insertPb(HttpServletRequest request,Model model,int pid,int[]bid){
		 ProfessionBook pb=new ProfessionBook();
		 pb.setpId(pid);
           for (int id:bid){
        	  pb.setbId(id);
        	  ps.insertPB(pb);
           }
        return "redirect:/profession/getAllProfession";  
    }  
}
