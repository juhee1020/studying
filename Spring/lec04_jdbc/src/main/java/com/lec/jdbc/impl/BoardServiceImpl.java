package com.lec.jdbc.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.jdbc.dao.BoardDAO;
import com.lec.jdbc.service.BoardService;
import com.lec.jdbc.vo.BoardVO;
import com.lec.jdbc.vo.PageInfo;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;


	@Override
	public PageInfo getPageInfo(int p, int perPage) {
		return boardDAO.getPageInfo("board", p, perPage);
	}	

	@Override
	public List<BoardVO> getBoardList(int currentPage, int perPage) {
		return boardDAO.getBoardList(currentPage, perPage);
	}

	@Override
	public BoardVO selectBoard(int seq) {
		return boardDAO.selectBoard(seq);
	}
	
	@Override
	public BoardVO selectBoard_up_de(int seq) {
		return boardDAO.selectBoard_up_de(seq);
	}
	
	@Override
	public void insertBoard(BoardVO board) {
		boardDAO.insertBoard(board);
	}

	@Override
	public void deleteBoard(int seq) {
		boardDAO.deleteBoard(seq);
	}

	@Override
	public void updateBoard(BoardVO board) {
		boardDAO.updateBoard(board);
	}

}
