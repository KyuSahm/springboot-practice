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
	public List<Notice> getList(boolean pub) {
		return getList(1, "title", "", pub);
	}

	@Override
	public List<Notice> getList(String field, String query, boolean pub) {
		return getList(1, field, query, pub);
	}
	
	@Override
	public List<Notice> getList(int page, String field, String query, boolean pub) {
		int start = 1 + (page - 1) * PAGE_SIZE;
		int end = 5 + (page - 1) * PAGE_SIZE;
		
		List<Notice> list = noticeDao.getList(start, end, field, query, pub);
		return list;
	}

	@Override
	public int getCount() {
		return getCount("title", "", true);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		return noticeDao.getCount(field, query, pub);
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
	
	@Override
	public int updatePubAll(int[] pubIds, int[] closeIds) {
		// TODO: transaction control
		int pubCnt = noticeDao.updatePubAll(pubIds, true);
		int closeCnt = noticeDao.updatePubAll(pubIds, false);
		return pubCnt + closeCnt;
	}

	@Override
	public int deleteAll(int[] ids) {
		return noticeDao.deleteAll(ids);
	}
}
