package com.lec.board.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.board.action.Action;
import com.lec.board.action.BoardWriteAction;
import com.lec.board.vo.ActionFoward;





@WebServlet("*.bo")
public class BoardController extends HttpServlet{
	
	Action action=null;
	ActionFoward foward=null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//super.doGet(req, res);
		doProcess(req,res);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//super.doPost(req, res);
		doProcess(req,res);
	}


	private void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String p=req.getParameter("p");
		String q=req.getParameter("q");
		String f=req.getParameter("f");

		String requestURI=req.getRequestURI();
		String contextPath=req.getContextPath();
		String command=requestURI.substring(contextPath.length());
/*
		System.out.println(requestURI+"\n"+contextPath+"\n"+command);
		▼ 아래가 syso해서 콘솔에 뜬거.
						게시판목록보기						게시판글쓰기
		requestURI : /jsp06_board/boardWriteForm.bo   or   /jsp06_board/boardList.bo
		contextPath : /jsp06_board
		command : /boardList.bo   or   /boardWriteForm.bo
*/
		if(command.equals("/boardWriteForm.bo")) {
			//"/board/board_write.jsp" 로 이동시키고 싶다면
			foward=new ActionFoward();
			foward.setPath("/board/board_write.jsp?p="+p+"&f="+f+"&q="+q);

		}else if(command.equals("/boardWrite.bo")) {
			action=new BoardWriteAction();
			try {
				action.execute(req, res);
			}catch(Exception e) {e.printStackTrace();}
						
		}else if(command.equals("/boardList.bo")) {
		}
		
		if(foward!=null) {
			if(foward.isRedirect()) {
				res.sendRedirect(foward.getPath());
			}else {
				RequestDispatcher dispatchar=req.getRequestDispatcher(foward.getPath());
				dispatchar.forward(req, res);
			}
		}
	}
}