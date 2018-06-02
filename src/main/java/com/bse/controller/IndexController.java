package com.bse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;

@Controller
public class IndexController {

  
    @RequestMapping("/")
    public String index(Model model) {
      System.out.println("经过");
        return "index";
    }

}
