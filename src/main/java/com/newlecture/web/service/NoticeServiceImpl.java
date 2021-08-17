package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {
	private final static int PAGE_SIZE = 5;
	
	@Autowired
	private NoticeDao noticeDao;
	
	
	@Override
	public List<Notice> getList(int page, String field, String query) {
		int start = 1 + (page - 1) * PAGE_SIZE;
		int end = 5 + (page - 1) * PAGE_SIZE;
		
		List<Notice> list = noticeDao.getList(start, end, field, query);
		return list;
	}

	@Override
	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}

}
