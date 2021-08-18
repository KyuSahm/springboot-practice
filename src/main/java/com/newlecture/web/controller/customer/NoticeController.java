package com.newlecture.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	@Autowired
	private NoticeService service;
	
	// class Request Mapping + method Request Mapping
	@RequestMapping("list")
	public String list(Model model) {
		int page = 2;
		String field = "title";
		String query = "";
		boolean pub = true;
		
		List<Notice> list = service.getList(page, field, query, pub);
		model.addAttribute("list", list);
		return "customer.notice.list";
	}
	
	// class Request Mapping + method Request Mapping
	@RequestMapping("detail")
	public String detail(Model model) {
		Notice notice = service.get(0);
		model.addAttribute("notice", notice);
		return "customer.notice.detail";
	}
}