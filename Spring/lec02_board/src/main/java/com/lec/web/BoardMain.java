package com.lec.web;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
/*
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("boardContext.xml");
		System.out.println("-----\n");
		BoardService boardService =  (BoardService) factory.getBean("boardService");
		// return하는게 Object객체이기 때문에 BoardService로 형변환 시켜주는것.

		BoardVO board=new BoardVO();

		board.setTitle("임시제목");
		board.setWriter("임시작성자");
		board.setContent("임시내용---------------------------------");

		boardService.insertBoard(board);

		List<BoardVO> boardList = boardService.getBoardList(board);
		for(BoardVO bd:boardList) {
			System.out.println(bd.toString());
		}
*/		

		mainBoardMenu();

	}




	public static void mainBoardMenu() {
		while(true) {
			int menuNo=mainMenuUI();
			switch(menuNo){
			case 0: System.out.println("프로그램종료"); System.exit(0);break;
			case 1: insertBoard_(); break;
			case 2: deleteBoard_(); break;
			case 3: updateBoard_(); break;
			case 4: getBoardList(); break;
			case 5: getBoard_();
			}
		}
	}



	public static void insertBoard_() {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("boardContext.xml");
		BoardService boardService =  (BoardService) factory.getBean("boardService");
		BoardVO board=new BoardVO();
		board.setTitle(JOptionPane.showInputDialog("글제목을 입력하시오."));
		board.setWriter(JOptionPane.showInputDialog("작성자 입력"));
		board.setContent(JOptionPane.showInputDialog("글내용 입력"));
		int abc=boardService.insertBoard(board);

		if(abc>0) {System.out.println("입력성공");}
		else System.out.println("입력실패");
		
		factory.close();
	}



	public static void deleteBoard_() {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("boardContext.xml");
		BoardService boardService =  (BoardService) factory.getBean("boardService");
		int seq=Integer.parseInt(JOptionPane.showInputDialog("글번호 입력"));
		int abc=boardService.deleteBoard(seq);

		if(abc>0) {System.out.println("삭제성공");}
		else System.out.println("삭제실패");
		
		factory.close();
	}



	public static void updateBoard_() {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("boardContext.xml");
		BoardService boardService =  (BoardService) factory.getBean("boardService");
		BoardVO board=new BoardVO();
		board.setSeq(Integer.parseInt(JOptionPane.showInputDialog("글번호 입력")));
		board.setTitle(JOptionPane.showInputDialog("수정할 제목 입력"));
		board.setContent(JOptionPane.showInputDialog("수정할 내용 입력"));
		int db=boardService.updateBoard(board);
		if(db>0) {
			System.out.println("수정성공");
		}else System.out.println("수정실패");

		factory.close();
	}



	public static void getBoardList() {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("boardContext.xml");
		BoardService boardService =  (BoardService) factory.getBean("boardService");

		BoardVO board=new BoardVO();
		board.getTitle();
		board.getWriter();
		board.getContent();
		List<BoardVO> boardList = boardService.getBoardList(board);
		for(BoardVO bd:boardList) {
			System.out.println(bd.toString());
		}
		factory.close();
	}



	public static void getBoard_() {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("boardContext.xml");
		BoardService boardService =  (BoardService) factory.getBean("boardService");
		BoardVO board=new BoardVO();
		int seq=Integer.parseInt(JOptionPane.showInputDialog("글번호 입력"));
		board=boardService.getBoard(seq);
		System.out.println(board.toString());
		
		factory.close();
	}




	public static int mainMenuUI() {
		//System.out.println("게시판프로그램 V"+this.ver);
		String menuNo=
				JOptionPane.showInputDialog(
						"===== 게시판프로그램 V =====\n\n"+
						"1. 글쓰기\n"+
						"2. 글삭제\n"+
						"3. 글수정\n"+
						"4. 리스트보기\n"+
						"5. 게시글보기\n"+
						"0. 종료\n"+
						"처리할 작업번호를 입력하시오."
				);
			if((menuNo==null)||(menuNo.equals(""))) {return 0;}
			else {return Integer.parseInt(menuNo);}
	}

}