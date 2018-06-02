package com.bse.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping(value = "/login"    )
    public String showLoginForm(HttpServletRequest req, Model model) {
        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        System.out.println("----------");
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            
        	error = "用户/密码错误";
        }else if(exceptionClassName != null) {
            error = "其他错误" + exceptionClassName;
        }
        model.addAttribute("error", error);
        return "login";
    }


}
