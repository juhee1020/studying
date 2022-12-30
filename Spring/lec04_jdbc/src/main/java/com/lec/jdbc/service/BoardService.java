package com.lec.jdbc.service;

import com.lec.jdbc.vo.*;
import java.util.*;

public interface BoardService {

	void insertBoard(BoardVO board);
	void updateBoard(BoardVO board);
	void deleteBoard(int seq);
	BoardVO selectBoard(int seq);
	BoardVO selectBoard_up_de(int seq);
	List<BoardVO> getBoardList(int currentPage, int perPage);
	PageInfo getPageInfo(int p, int perPage);
}