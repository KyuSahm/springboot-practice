package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	// class Request Mapping + method Request Mapping
	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("test", "Hello~");		
		return "customer/notice/list";
	}
	
	// class Request Mapping + method Request Mapping
	@RequestMapping("detail")
	public String detail() {
		return "customer/notice/detail";
	}
}