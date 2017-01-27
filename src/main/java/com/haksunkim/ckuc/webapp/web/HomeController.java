package com.haksunkim.ckuc.webapp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	private static final String VIEW_HOME = "home";
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_HOME);
		
		return modelAndView;
	}
}
