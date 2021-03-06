package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;

@Repository
public class MybatisNoticeDao implements NoticeDao {
	private NoticeDao mapper;	
	
	@Autowired
	public MybatisNoticeDao(SqlSession sqlSession) { // Constructor injection		
		mapper = sqlSession.getMapper(NoticeDao.class);
	}

	@Override
	public List<Notice> getList(int start, int end, String field, String query, boolean pub) {
		return mapper.getList(start, end, field, query, pub);
	}

	@Override
	public int getCount(String field, String query, boolean pub) {
		return mapper.getCount(field, query, pub);
	}

	@Override
	public Notice get(int id) {
		return mapper.get(id);
	}

	@Override
	public Notice getNext(int id) {
		return mapper.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		return mapper.getPrev(id);
	}

	@Override
	public int update(Notice notice) {
		return mapper.update(notice);
	}

	@Override
	public int insert(Notice notice) {
		return mapper.insert(notice);
	}

	@Override
	public int delete(int id) {
		return mapper.delete(id);
	}

	@Override
	public int deleteAll(int[] ids) {
		return mapper.deleteAll(ids);
	}

	@Override
	public int updatePubAll(int[] ids, boolean pub) {
		return mapper.updatePubAll(ids, pub);
	}

}
