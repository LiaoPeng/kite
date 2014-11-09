package com.galaxy.kite.controller.home;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.startup.HomesUserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
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
	public ModelAndView showAbout(String target) {
		
	
		ModelMap modelMap = new ModelMap();
		target = StringUtils.isEmpty(target) ? "service" : target;
			
		
		modelMap.put("target", target +".jsp");
		
		return new ModelAndView("/about",modelMap);
	}
}
