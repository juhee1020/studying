package member.service;

import java.sql.Connection;
import java.util.ArrayList;

import member.dao.MemberDAO;
import member.db.JDBCUtil;
import member.vo.MemberBean;

public class MemberListService {

	public int getListCount(String f, String q) {

		int listCount=0;

		Connection conn=JDBCUtil.getConnection();
		MemberDAO memberDAO=MemberDAO.getInstance();
		memberDAO.setConnection(conn);

		listCount=memberDAO.selectListCount(f,q);

		JDBCUtil.close(conn, null, null);

		return listCount;
	}


	public ArrayList<MemberBean> getMemberList(int p, int limit, String f, String q) {

		ArrayList<MemberBean> memberList=null;

		Connection conn=JDBCUtil.getConnection();
		MemberDAO memberDAO=MemberDAO.getInstance();
		memberDAO.setConnection(conn);

		memberList=memberDAO.selectMemberList(p, limit, f, q);

		JDBCUtil.close(conn, null, null);

		return memberList;
	}

}
