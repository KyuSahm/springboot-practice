package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("home.index");
		mv.addObject("data", "Hello Spring Boot");
				
		return mv;
	}
	
	@RequestMapping("help")
	public ModelAndView help() {
		ModelAndView mv = new ModelAndView("home.help");
		mv.addObject("data", "I can help you");
				
		return mv;
	}
}