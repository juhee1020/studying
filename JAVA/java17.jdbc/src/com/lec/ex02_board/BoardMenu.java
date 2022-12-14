package com.lec.ex02_board;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BoardMenu {

	private double ver;

	public BoardMenu(double ver) {
		this.ver=ver;
	}

	public void mainBoardMenu() {
		BoardDAOImpl bddao=BoardFactory.getInstance();
		while(true) {
			int menuNo=mainMenuUI();
			switch(menuNo){
			case 0: System.out.println("프로그램종료"); System.exit(0);break;
			case 1: makeBoard(bddao); break;
			case 2: listBoard(bddao); break;
			case 3: contentView(bddao); break;
			case 4: updateBoard(bddao); break;
			case 5: deleteBoard(bddao); break;
			case 6: findBySubject(bddao); break;
			case 7: findByWriter(bddao);
			}
		}
	}
	
	
	// 1. case 1:
	public void makeBoard(BoardDAOImpl bddao) {
		bddao.createBoard();
	}
	// 2. case 2:
	public /*ArrayList<BoardVO>*/void listBoard(BoardDAOImpl bddao) {
		ArrayList<BoardVO> bds = bddao.listBoard();
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("=========================================");
		for(BoardVO db:bds) {
			System.out.println(db.toString());
		}
		System.out.println("\n------------------출력종료\n");
	}
	// 3. case:3
	public void contentView(BoardDAOImpl bddao) {
		String bno=JOptionPane.showInputDialog("조회할 글 번호를 입력하시오.");
		if(bno==null) return;
		if(bno=="") return;
		else {
			BoardVO bd = bddao.viewBoard(Integer.parseInt(bno));
			System.out.println("글제목 : "+bd.getSubject());
			System.out.println("작성자 : "+bd.getWriter());
			System.out.println("글내용 : "+bd.getContent()+"\n\n");
		}
	}
	// 4. case4:
	public void updateBoard(BoardDAOImpl bddao) {
		String bno=JOptionPane.showInputDialog("수정할 글 번호를 입력하시오.");
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			bddao.updateBoard(Integer.parseInt(bno));
		}
	}
	// 5. case5:
	public void deleteBoard(BoardDAOImpl bddao) {
		String bno=JOptionPane.showInputDialog("삭제할 글 번호를 입력하시오.");
		if(bno==null) return;
		if(bno.equals("")) {
			return;
		} else {
			bddao.deleteBoard(Integer.parseInt(bno));
		}
	}
	// 6. case 6:
	public void findBySubject(BoardDAOImpl bddao) {
		String title=JOptionPane.showInputDialog("제목 입력.");
		
		if(title==null) return;
		if(title.equals("")) {
			return;
		} else {
			ArrayList<BoardVO> bds = bddao.findBySubjectBoard(title);
			System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
			System.out.println("=========================================");
			for(BoardVO db:bds) {
				System.out.println(db.toString());
			}
			System.out.println("\n------------------출력종료\n");
		}
	}
	// 7. case 7:
	public void findByWriter(BoardDAOImpl bddao) {
		String writer=JOptionPane.showInputDialog("글쓴이 입력.");
		if(writer==null) return;
		if(writer.equals("")) {
			return;
		} else {
			ArrayList<BoardVO> bds = bddao.findByWriterBoard(writer);
			System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
			System.out.println("=========================================");
			for(BoardVO db:bds) {
				System.out.println(db.toString());
			}
			System.out.println("\n------------------출력종료\n");
		}
	}
	
	
	
	public int mainMenuUI() {
		//System.out.println("게시판프로그램 V"+this.ver);
		String menuNo=
				JOptionPane.showInputDialog(
						"===== 게시판프로그램 V"+this.ver+" =====\n\n"+
						"1. 새로운 글쓰기\n"+
						"2. 전체글 목록 조회\n"+
						"3. 본문글 보기\n"+
						"4. 본문글 수정\n"+
						"5. 본문글 삭제\n"+
						"6. 제목으로 게시글 조회\n"+
						"7. 작성자로 게시글 조회\n"+
						"0. 종료\n"+
						"처리할 작업번호를 입력하시오."
				);
			if((menuNo==null)||(menuNo.equals(""))) {return 0;}
			else {return Integer.parseInt(menuNo);}
		}
}
