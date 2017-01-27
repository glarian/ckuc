package com.haksunkim.ckuc.webapp.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AboutController {
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public ModelAndView about(ModelAndView modelAndView) {
		modelAndView.setViewName("about");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/service",method=RequestMethod.GET)
	public ModelAndView service(ModelAndView modelAndView) {
		modelAndView.setViewName("service");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/contact",method=RequestMethod.GET)
	public ModelAndView contact(ModelAndView modelAndView) {
		modelAndView.setViewName("contact");
		
		return modelAndView;
	}
}
