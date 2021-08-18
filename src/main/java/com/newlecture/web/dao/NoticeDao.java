package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newlecture.web.entity.Notice;

@Mapper
public interface NoticeDao {
	List<Notice> getList(int start, int end, String field, String query);
	int getCount(String field, String query);
	Notice get(int id);
	Notice getNext(int id);
	Notice getPrev(int id);
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
	int updatePubAll(int[] pubIds, int[] closeIds);
	int deleteAll(int[] ids);
	//int updatePubAll(int[] ids, boolean pub);
}