package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entity.Notice;

public interface NoticeDao {
	List<Notice> getList(int start, int end, String field, String query, boolean pub);
	int getCount(String field, String query, boolean pub);
	Notice get(int id);
	Notice getNext(int id);
	Notice getPrev(int id);
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);	
	int deleteAll(int[] ids);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	int updatePubAll(int[] ids, boolean pub);
}