package member.controller;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.action.*;
import member.vo.*;

@WebServlet("*.mem")
public class MemberController extends HttpServlet{

	Action action=null;
	ActionForward forward=null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doProcess(req, res);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doProcess(req, res);
	}


	private void doProcess(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");

		String p=req.getParameter("p");
		String f=req.getParameter("f");
		String q=req.getParameter("q");

		String requestURI=req.getRequestURI();
		String contextPath=req.getContextPath();
		String command=requestURI.substring(contextPath.length());



		if(command.equals("/memberList.mem")) {
			action=new MemberListAction();
			try{
				forward = action.execute(req, res);
				}catch(Exception e){e.printStackTrace();}
		}

		
		else if(command.equals("/memberJoinForm.mem")) {
			forward = new ActionForward();
			forward.setPath("/member/member_join.jsp?p="+p+"&f="+f+"&q="+q);
		}


		else if(command.equals("/memberJoin.mem")) {
			action=new MemberJoinAction();
			try{
				forward = action.execute(req, res);
				}catch(Exception e){e.printStackTrace();}
		}


		else if(command.equals("/memberDeleteForm.mem")) {
			forward=new ActionForward();
			forward.setPath("/member/member_delete.jsp?p="+p+"&f="+f+"&q="+q);
		}


		else if(command.equals("/memberDelete.mem")) {
			action=new MemberDeleteAction();
			try{
				forward = action.execute(req, res);
				}catch(Exception e){e.printStackTrace();}
		}



		if(forward!=null) {
			if(forward.isRedirect()) {
				res.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher dispatcher=req.getRequestDispatcher(forward.getPath());
				dispatcher.forward(req, res);
			}
		}

	}//doProcess
}