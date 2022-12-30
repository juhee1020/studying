package com.lec.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lec.jdbc.service.BoardService;
import com.lec.jdbc.vo.*;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("boardList.do")
	public String boardList(BoardVO board, Model model,
			@RequestParam(defaultValue="1") int p,
			@RequestParam(defaultValue="10") int perPage) {

		PageInfo pageInfo=boardService.getPageInfo(p, perPage);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("boardList",boardService.getBoardList(p, perPage));
		return "board/board_list.jsp";
	}

	@RequestMapping(value="/selectBoard.do", method=RequestMethod.GET)
	public String selectBoard(@RequestParam int seq, Model model) {
		model.addAttribute("board", boardService.selectBoard(seq));
		return "board/board_detail.jsp?seq="+seq;
	}

	@RequestMapping(value="/deleteBoard.do", method=RequestMethod.GET)
	public String deleteBoard(@RequestParam int seq, Model model) {
		model.addAttribute("board", boardService.selectBoard_up_de(seq));
		return "board/board_delete.jsp";
	}
	
	@RequestMapping(value="/deleteBoard.do", method=RequestMethod.POST)
	public String deleteBoard(@RequestParam int seq) {
		boardService.deleteBoard(seq);
		return "redirect:boardList.do";
	}

	@RequestMapping(value="/updateBoard.do", method=RequestMethod.GET)
	public String updateBoard(@RequestParam int seq, Model model) {
		model.addAttribute("board", boardService.selectBoard_up_de(seq));
		return "board/board_update.jsp";
	}

	@RequestMapping(value="/updateBoard.do", method=RequestMethod.POST)
	public String updateBoard(BoardVO board) {
		boardService.updateBoard(board);
		return "redirect:boardList.do";
	}

	@RequestMapping("insertBoard.do")
	public String insertBoard(BoardVO board) {
		boardService.insertBoard(board);
		return "redirect:boardList.do";
	}

}