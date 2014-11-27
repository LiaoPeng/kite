package com.galaxy.kite.controller.home;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javassist.expr.NewArray;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.kite.model.ResultModel;
import com.galaxy.kite.model.user.Person;
import com.galaxy.kite.service.home.api.ILoginService;

@Controller
@RequestMapping("/knight")
public class LoginController {
	
	@Autowired
	@Qualifier("localeResolver")
	private LocaleResolver localeResolver;


	@RequestMapping(value = "/showHomePage.do", method = RequestMethod.GET)
	public ModelAndView showHomePage() {

		ModelMap modelMap = new ModelMap();
		modelMap.put("countOfUser", 1);

		return new ModelAndView("home/home", modelMap);
	}

	@RequestMapping(value = "/testServlet.do")
	@ResponseBody
	public String testServelet(HttpServletRequest request,
			HttpServletResponse response, HttpServletRequest request2) {

		request.getHeaderNames();
		
		request.getHeader("accept");
		request.getSession();
		return "{'name':'Jack'}";
	}

	@RequestMapping(value = "/about.do", method = RequestMethod.GET)
	public ModelAndView showAbout(String target, String username, HttpServletRequest request) {


		ModelMap modelMap = new ModelMap();
		target = StringUtils.isEmpty(target) ? "service" : target;
		modelMap.put("target", target + ".jsp");

		return new ModelAndView("/about", modelMap);
	}

	@RequestMapping("/setI18Lng.do")
	@ResponseBody
	public Object setI18MessageResolver(String lng,HttpServletRequest request, HttpServletResponse response) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "javk");
		map.put("age", "23");
		Person person = new Person();
		person.setAddress("11");
		
		return new String("jack");
	}
}
