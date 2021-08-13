package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.web.controller.entity.Notice;
import com.newlecture.web.dao.NoticeDao;

public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> getList() {
		List<Notice> list = noticeDao.getList();
		return list;
	}

	@Override
	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}

}
