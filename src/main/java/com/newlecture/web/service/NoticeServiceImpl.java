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
	public List<Notice> getList() {
		return getList(1, "title", "");
	}

	@Override
	public List<Notice> getList(String field, String query) {
		return getList(1, field, query);
	}
	
	@Override
	public List<Notice> getList(int page, String field, String query) {
		int start = 1 + (page - 1) * PAGE_SIZE;
		int end = 5 + (page - 1) * PAGE_SIZE;
		
		List<Notice> list = noticeDao.getList(start, end, field, query);
		return list;
	}

	@Override
	public int getCount() {
		return getCount("title", "");
	}

	@Override
	public int getCount(String field, String query) {
		return noticeDao.getCount(field, query);
	}

	@Override
	public Notice get(int id) {
		Notice notice = noticeDao.get(id);
		return notice;
	}	

	@Override
	public Notice getNext(int id) {
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		return noticeDao.getPrev(id);
	}

	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO Auto-generated method stub
		return noticeDao.updatePubAll(pubIds, closeIds);
	}

	@Override
	public int deleteAll(int[] ids) {
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		return noticeDao.insert(notice);
	}

}
