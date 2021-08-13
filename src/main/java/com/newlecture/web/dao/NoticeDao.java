package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.controller.entity.Notice;

public interface NoticeDao {

	List<Notice> getList();

	Notice get(int id);
}
