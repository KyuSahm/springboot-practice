package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;

@Mapper
public interface NoticeDao {
	@Select(" SELECT B.ID, B.TITLE, B.WRITER_ID, B.CONTENT, B.REGDATE, B.HIT, B.FILES, B.PUB "
			+ "  FROM (SELECT ROWNUM SEQ, A.* "
			+ "          FROM (SELECT * "
			+ "                  FROM NOTICE "
			+ "                 WHERE ${field} like '%${query}%' "
			+ "                 ORDER BY REGDATE DESC) A "
			+ "       ) B "
			+ " WHERE B.SEQ BETWEEN #{start} AND #{end}")
	@Results({
        @Result(property = "writerId", column = "WRITER_ID")
    })
	List<Notice> getList(int start, int end, String field, String query);
	Notice get(int id);
}
