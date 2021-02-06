package com.example.ecobesa.controllers;

import java.net.MalformedURLException;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ecobesa.service.IEmpresaService;
import com.example.ecobesa.service.IUploadFileService;
import com.example.ecobesa.service.IUserService;

@Controller
public class LoginController {
	
	
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IEmpresaService empresaService;
	
	@GetMapping(value="/uploads/{filename:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String filename){
		
		Resource recurso= null;
		
		try {
			recurso = uploadFileService.load(filename);
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok()
			.header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\""+recurso.getFilename()+"\"")
			.body(recurso);
	}


	@GetMapping({ "/login", "/" })
	public String login(@RequestParam(value = "error", required = false) String error, Model model, Principal principal,
			RedirectAttributes flash) {
		Long id=(long) 1;
		
		model.addAttribute("pantallaInicio", empresaService.findById(id).getPantallaInicio());
		model.addAttribute("empresaLogo", empresaService.findById(id).getFoto());
		if (principal != null) {

			return "redirect:/principal";
		}

		if (error != null) {
			model.addAttribute("error", "Error , Usuario o Contraseña incorrecto");

		}

		return "login";
	}

	@RequestMapping(value = { "/principal" }, method = RequestMethod.GET)
	public ModelAndView overViewPage(HttpServletRequest request,HttpSession session) {
		Long id=(long) 1;
		session.setAttribute("RazonSocial", empresaService.findById(id).getFoto());
		
		ModelAndView model = new ModelAndView(); 
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
    	UserDetails userDetail = (UserDetails) auth.getPrincipal(); 
    	com.example.ecobesa.entity.User u = userService.findByUsuario(userDetail.getUsername()); 
    	request.getSession().setAttribute("userId", u.getId()); 
    	
    	return model;
	}
}
