package com.example.ecobesa.controllers;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class LoginController {
	
	
	 @GetMapping({"/login","/"})
	    public String login(@RequestParam(value="error",required=false) String error,
	    		Model model,Principal principal,RedirectAttributes flash){
	    	
	    	if(principal!=null){
	    		
	    		return "redirect:/principal";
	    	}
	    	
	    	if(error!=null) {
	    		model.addAttribute("error","Error , Usuario o Contraseña incorrecto");
	    		
	    	}
	    	
	        return "login";
	    }
	
	
	 @RequestMapping(value = { "/principal" }, method = RequestMethod.GET) 
	    public String principal(HttpServletRequest request) { 
	    
	    	return "principal"; 
	    }
}
