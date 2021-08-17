package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newlecture.web.entity.Notice;

@Mapper
public interface NoticeDao {
	List<Notice> getList(int start, int end, String field, String query);
	Notice get(int id);
	int update(Notice notice);
	int insert(Notice notice);
	int delete(int id);
}