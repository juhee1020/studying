package com.lec.jdbc.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.lec.jdbc.vo.BoardVO;

public class BoardRowMapper implements RowMapper{
	
	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardVO board=new BoardVO();
		board.setCnt(rs.getInt("cnt"));
		board.setContent(rs.getString("content"));
		board.setRegdate(rs.getDate("regdate"));
		board.setSeq(rs.getInt("seq"));
		board.setTitle(rs.getString("title"));
		board.setWriter(rs.getString("writer"));
		return board;
	}
}