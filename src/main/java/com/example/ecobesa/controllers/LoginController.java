package com.example.ecobesa.controllers;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {
	
	
	 @RequestMapping(value = { "/principal" }, method = RequestMethod.GET) 
	    public String principal(HttpServletRequest request) { 
	    
	    	return "principal"; 
	    	
	    }
}
