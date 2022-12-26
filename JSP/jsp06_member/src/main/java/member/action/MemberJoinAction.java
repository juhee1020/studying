package member.action;

import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberJoinService;
import member.vo.*;

public class MemberJoinAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		
		ActionForward forward=null;
		MemberBean member=null;

		String p=req.getParameter("p");
		String f=req.getParameter("f");
		String q=URLEncoder.encode(req.getParameter("q"),"UTF-8");
		
		try {
			member=new MemberBean();
			member.setMember_id(req.getParameter("member_id"));
			member.setMember_pw(req.getParameter("member_pw"));
			member.setMember_name(req.getParameter("member_name"));
			member.setMember_gender(req.getParameter("member_gender"));
			member.setMember_age(Integer.parseInt(req.getParameter("member_age")));
			member.setMember_email(req.getParameter("member_email"));
			
			MemberJoinService memberJoinService=new MemberJoinService();
			boolean isJoinSuccess=memberJoinService.registerMember(member);
			
			if(isJoinSuccess) {
				forward=new ActionForward();
				forward.setRedirect(true);
				forward.setPath("memberList.mem?p="+p+"&f="+f+"&q="+q);
			}else {
				res.setContentType("text/html; charset=UTF-8" );
				PrintWriter out = res.getWriter();
				out.println("<script>");
				out.println("   alert('회원 등록이 실패했습니다!!')");
				out.println("   history.back();");
				out.println("</script>");				
			}

		}catch(Exception e) {
			System.out.println("actionforward 실패 - "+e.getMessage());
		}

		return forward;
	}

}