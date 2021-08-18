package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;

@Repository
public class MybatisNoticeDao implements NoticeDao {
	@Autowired
	private SqlSession sqlSession; // MyBatis 라이브러리에서 IoC 컨테이너에 담아준다. 우리는 꺼내서 쓰면 됨.
	
	@Override
	public List<Notice> getList(int start, int end, String field, String query, boolean pub) {
		NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);		
		return noticeDao.getList(start, end, field, query, pub);
	}

	@Override
	public int getCount(String field, String query) {
		NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);		
		return noticeDao.getCount(field, query);
	}

	@Override
	public Notice get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePubAll(int[] ids, boolean pub) {
		// TODO Auto-generated method stub
		return 0;
	}

}
