package com.newlecture.web.dao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import com.newlecture.web.entity.Notice;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
class NoticeDaoTest {
	@Autowired
	private NoticeDao noticeDao;
	
	@Test
	void test() {
		List<Notice> list = noticeDao.getList(1, 5, null, null, true);
		
		System.out.println(list.get(0));
	}

}
