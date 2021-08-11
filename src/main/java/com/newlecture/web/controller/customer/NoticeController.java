package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	@RequestMapping("/customer/notice/list")
	public String list(Model model) {
		model.addAttribute("test", "Hello~");		
		// RequestMapping와 문자열이 동일("/customer/notice/")하므로, 생략 가능		
		return "list.jsp";
		//return "/customer/notice/list.jsp";
	}
	
	@RequestMapping("/customer/notice/detail")
	public String detail() {
		return "detail.jsp";
	}
}