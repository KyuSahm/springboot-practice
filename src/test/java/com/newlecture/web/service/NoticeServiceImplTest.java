package com.newlecture.web.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NoticeServiceImplTest {
	@Autowired
	private NoticeService service;
	
	@Test
	void test() {
		int cnt = service.getCount("title", "test", true);		
		System.out.println(cnt);
	}

}
