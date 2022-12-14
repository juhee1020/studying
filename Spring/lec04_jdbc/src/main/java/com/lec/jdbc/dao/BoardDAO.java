package com.lec.jdbc.dao;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lec.jdbc.impl.BoardRowMapper;
import com.lec.jdbc.impl.UserRowMapper;
import com.lec.jdbc.vo.*;

@Repository("boardDAO")
public class BoardDAO {

	private JdbcTemplate jdbcTemplate;

	public BoardDAO() {
		AbstractApplicationContext container=new GenericXmlApplicationContext("applicationContext.xml");
		this.jdbcTemplate=(JdbcTemplate)container.getBean("jdbcTemplate");
	}

	public PageInfo getPageInfo(String tableName, int currentPage, int perPage) {
		
		PageInfo pageInfo = new PageInfo();
		String sql = "select count(*) from " + tableName;
		
		int totalCount = 0;
		int totalPages = 0;
		int startPage = 0;
		int endPage = 0;

		totalCount=jdbcTemplate.queryForInt(sql);

		if(totalCount>0) {
			totalPages = (int)(totalCount / perPage) + ((totalCount % perPage == 0) ? 0 : 1);
			startPage = (int)(currentPage / perPage) * perPage + 1 + ((currentPage % perPage == 0) ? -perPage : 0);
			
			endPage = (totalPages-startPage<9) ? startPage+(totalPages%perPage)-1 : startPage+perPage-1;
			if(startPage==totalPages)endPage=totalPages;
		}
				
		pageInfo.setTotalCount(totalCount);
		pageInfo.setTotalPages(totalPages);
		pageInfo.setCurrentPage(currentPage);
		pageInfo.setStartPage(startPage);
		pageInfo.setEndPage(endPage);
			
		return pageInfo;
	}


	
	public List<BoardVO> getBoardList(int currentPage, int perPage){
		String sql="select * from board WHERE (SELECT @ROWNUM:=0)=0 order by seq desc limit ?,?";
		Object[] args= {(currentPage-1)*perPage, perPage}; 
		// 이거 걍 {currentPage, perPage}면 첫번째 글이 안나옴 (첫번째꺼는 인덱스가 0이라서 그런듯?)
		return jdbcTemplate.query(sql, args, new BoardRowMapper());
	}



	public BoardVO selectBoard(int seq) {
		String sql1="update board set cnt=cnt+1 where seq="+seq;
		jdbcTemplate.update(sql1);
		String sql="select * from board where seq="+seq;
		//BoardVO boardVO=(BoardVO)jdbcTemplate.queryForObject(sql, new BoardRowMapper());
		return (BoardVO)jdbcTemplate.queryForObject(sql, new BoardRowMapper());
	}
	
	public BoardVO selectBoard_up_de(int seq) {
		String sql="select * from board where seq="+seq;
		return (BoardVO)jdbcTemplate.queryForObject(sql, new BoardRowMapper());
	}



	public void insertBoard(BoardVO board) {
		String sql="insert into board(title, writer, content) values(?,?,?)";
		jdbcTemplate.update(sql, board.getTitle(), board.getWriter(), board.getContent());
	}



	public void deleteBoard(int seq) {
		String sql="delete from board where seq="+seq;
		jdbcTemplate.update(sql);
	}



	public void updateBoard(BoardVO board) {
		String sql="update board set title=?, writer=?, content=? where seq=?";
		jdbcTemplate.update(sql, board.getTitle(), board.getWriter(), board.getContent(), board.getSeq());
	}
}