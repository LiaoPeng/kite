package com.galaxy.kite.controller.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.kite.service.home.api.IUserInfoService;


@Controller
@RequestMapping("/home")
public class LoginController {
	
	@Autowired
	@Qualifier("userInfoService")
	private IUserInfoService userInfoService;
	
	@RequestMapping(value="/showHomePage.do",method=RequestMethod.GET)
	public ModelAndView showHomePage() {
		
		int countOfUser = userInfoService.getCountOfUsers();
		
		ModelMap modelMap = new ModelMap();
		modelMap.put("countOfUser", countOfUser);

		return new ModelAndView("home/home",modelMap);
	}

}
