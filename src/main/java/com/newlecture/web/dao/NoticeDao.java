package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;

@Mapper
public interface NoticeDao {
	@Select("select * from notice")
	@Results({
        @Result(property = "writerId", column = "WRITER_ID")
    })
	List<Notice> getList();
	Notice get(int id);
}
