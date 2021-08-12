package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	// class Request Mapping + method Request Mapping
	@RequestMapping("list")
	public ModelAndView list(Model model) {
		ModelAndView mv = new ModelAndView("customer.notice.list");
		mv.addObject("test", "Hello~");
		return mv;
	}
	
	// class Request Mapping + method Request Mapping
	@RequestMapping("detail")
	public ModelAndView detail() {
		ModelAndView mv = new ModelAndView("customer.notice.detail");
		return mv;
	}
}