package member.action;

import java.util.ArrayList; 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import member.service.MemberListService;
import member.vo.*;

public class MemberListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		ArrayList<MemberBean> memberList=new ArrayList<>();

		int page=1; int limit=10;

		// http://localhost:8088/jsp06_member/memberList.mem?p=1&f=member_name&q=
		int p=page; String f=""; String q="";

		if(req.getParameter("p")!=null)p=Integer.parseInt(req.getParameter("p"));
		if(req.getParameter("f")!=null) {f=req.getParameter("f");}else {f="member_name";}
		if(req.getParameter("q")!= null) q = req.getParameter("q");

		MemberListService memberListService=new MemberListService();

		int listCount=memberListService.getListCount(f,q);
		memberList=memberListService.getMemberList(p,limit,f,q);

		
	// 페이지처리
		// 총페이지수 
		int totalPage = (int)((double)listCount / limit + 0.95);

		// 현재페이지의 시작페이지(1, 11, 21.... -> 21 22 ... 30)
		int startPage = (((int)((double)p / 10 + 0.9)) -1) * 10 + 1;

		// 현재페이지의 마지막페이지수
		int endPage = startPage + 10 - 1;
		if(endPage > totalPage) endPage = totalPage;

		PageInfo pageInfo=new PageInfo();
		pageInfo.setListCount(listCount);
		pageInfo.setPage(p);
		pageInfo.setStartPage(startPage);
		pageInfo.setEndPage(endPage);
		pageInfo.setTotalPage(totalPage);


		req.setAttribute("pageInfo", pageInfo);
		req.setAttribute("memberList", memberList);


		ActionForward forward=new ActionForward();
		forward.setPath("/member/member_list.jsp?p="+p+"&f="+f+"&q="+q);


		return forward;
	}

}
