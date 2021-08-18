package com.newlecture.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		int page = 2;
		String field = "title";
		String query = "";
		boolean pub = true;
		
		List<Notice> list = service.getList(page, field, query, pub);
		model.addAttribute("list", list);
		return "admin.board.notice.list";	
	}
	
	@RequestMapping("detail")
	public String detail(Model model) {
		Notice notice = service.get(1);
		model.addAttribute("notice", notice);
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		return "admin.board.notice.reg";
	}
}