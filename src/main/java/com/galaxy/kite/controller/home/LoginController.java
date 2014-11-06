package com.galaxy.kite.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.kite.service.home.api.ILoginService;
import com.galaxy.kite.service.home.api.IUserInfoService;


@Controller
@RequestMapping("/knight")
public class LoginController {
	
	@Autowired
	@Qualifier("userInfoService")
	private IUserInfoService userInfoService;
	

	@Autowired
	private ILoginService loginService;


	
	@RequestMapping(value="/showHomePage.do",method=RequestMethod.GET)
	public ModelAndView showHomePage() {
		
		
		ModelMap modelMap = new ModelMap();
		modelMap.put("countOfUser",1);
		
		return new ModelAndView("/homepage",modelMap);
	}

	
	@RequestMapping(value="/about.do",method=RequestMethod.GET)
	public ModelAndView showAbout() {
		
		
		ModelMap modelMap = new ModelMap();
		modelMap.put("countOfUser",1);
		
		return new ModelAndView("/about",modelMap);
	}
}
