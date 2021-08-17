package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;

public interface NoticeService {

	// 페이지를 요청할 때
	List<Notice> getViewList();

	// 검색을 요청할 때
	List<Notice> getViewList(String field, String query);

	// 페이지를 요청할 때
	List<Notice> getList(int page, String field, String query);

	// 페이지 넘김 컨트롤
	int getCount();

	// 페이지 넘김 컨트롤
	int getCount(String field, String query);

	// 자세한 페이지 요청할 때
	Notice get(int id);

	Notice getNext(int id);

	Notice getPrev(int id);

	// 일괄 공개를 요청할 때
	int updatePubAll(int[] pubIds, int[] closeIds);

	// 일괄 삭제를 요청할 때
	int deleteAll(int[] ids);

	// 수정 페이지를 요청할 때
	int update(Notice notice);

	int delete(int id);

	int insert(Notice notice);
}
