package member.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.db.JDBCUtil;
import member.service.MemberDeleteService;
import member.vo.ActionForward;

public class MemberDeleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String member_id=req.getParameter("member_id");
		String p = req.getParameter("p");
		String f = req.getParameter("f");
		String q = req.getParameter("q");
		
		boolean isDeleteSuccess=false;
		boolean rightMember=false;
		ActionForward forward=null;
		MemberDeleteService memberDeleteService=new MemberDeleteService();

		rightMember=memberDeleteService.isRightMember(member_id, req.getParameter("member_pw"));
		
		if(rightMember) {
			isDeleteSuccess=memberDeleteService.deleteMember(member_id);
			
			if(isDeleteSuccess) {
				forward=new ActionForward();
				forward.setRedirect(true);
				forward.setPath("memberList.mem?p="+p+"&f="+f+"&q="+q);
			}else {
				res.setContentType("text/html; charset=UTF-8" );
				PrintWriter out = res.getWriter();
				out.println("<script>");
				out.println("   alert('회원 삭제 실패')");
				out.println("   history.back();");
				out.println("</script>");				
			}
		}else {
			res.setContentType("text/html; charset=UTF-8" );
			PrintWriter out = res.getWriter();
			out.println("<script>");
			out.println("   alert('회원삭제권한없음')");
			out.println("   history.back();");
			out.println("</script>");				
		}

		return forward;
	}
}
