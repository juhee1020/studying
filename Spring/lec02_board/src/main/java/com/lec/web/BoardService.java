package com.lec.web;

import java.util.List;

public interface BoardService {

	int insertBoard(BoardVO vo);
	int deleteBoard(int vo); // (BoardVO vo);
	int updateBoard(BoardVO vo);
	BoardVO getBoard(int vo); // (BoardVO vo);
	List<BoardVO> getBoardList(BoardVO vo);
	
}