package com.galaxy.kite.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class LoginAuthorityController {
	
	
	@RequestMapping("/login.do")
	public ModelAndView showLoginPage(){
		return new ModelAndView("login");
	}
	

	@RequestMapping("/admin.do")
	public ModelAndView showAdminPage(){
		return new ModelAndView("login");
	}
	

	@RequestMapping("/common.do")
	public ModelAndView showCommonPage(){
		return new ModelAndView("login");
	}
}
