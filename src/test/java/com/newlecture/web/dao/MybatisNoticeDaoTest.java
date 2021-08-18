package com.newlecture.web.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.newlecture.web.entity.Notice;

@SpringBootTest
class MybatisNoticeDaoTest {
	@Autowired
	private NoticeDao noticeDao;
	
	@Test
	void test() {
		List<Notice> list = noticeDao.getList(1, 5, null, null, true);
		
		System.out.println(list.get(0));
	}
}
