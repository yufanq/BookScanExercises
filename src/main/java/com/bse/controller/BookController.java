package com.bse.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bse.entity.Book;
import com.bse.entity.Profession;
import com.bse.service.BookService;
import com.bse.service.ProfessionService;

@Controller  
@RequestMapping("/book") 
public class BookController {
	@Autowired  
    private BookService bs; 
	@RequestMapping("/getAllBook")  
    public String getAllBook(HttpServletRequest request,Model model){  
       ArrayList<Book> books=bs.selectAll();
        model.addAttribute("books", books);   
        return "booksmanager";  
    }  
	@RequestMapping("/deleteB")  
    public String deleteB(HttpServletRequest request,Model model,int id){  
           bs.deleteB(id);  
        return "redirect:/book/getAllBook";  
    }  
    @RequestMapping("/insertB")  
    public String insertB(HttpServletRequest request,Model model,String bname){  
        Book b=new Book();
        b.setbName(bname);
        bs.insertB(b);
        return "redirect:/book/getAllBook";  
    } 
    @RequestMapping("/updateB")  
    public String updateB(HttpServletRequest request,Model model,String bname,int bid){  
        Book b=new Book();
        b.setbId(bid);
        b.setbName(bname);
        bs.insertB(b);
        return "redirect:/BOOK/getAllBook";  
    } 
    @RequestMapping("/selectB")  
    public String selectB(HttpServletRequest request,Model model,int bid){  
        Book book=bs.selectByPrimaryKey(bid);
        model.addAttribute("book", book);   
        return "redirect:/book/updateB";  
    } 
}
