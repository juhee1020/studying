package member.service;

import java.sql.Connection;

import member.dao.MemberDAO;
import member.db.JDBCUtil;

public class MemberDeleteService {

	public boolean deleteMember(String member_id) {
		boolean isDeleteSuccess=false;

		Connection conn=JDBCUtil.getConnection();
		MemberDAO boardDAO=MemberDAO.getInstance();
		isDeleteSuccess=boardDAO.isRightMember(member_id);
		JDBCUtil.close(conn, null, null);
		
		
		return isDeleteSuccess;
	}

	public boolean isRightMember(String member_id, String parameter) {
		boolean rightMember=false;

		return rightMember;
	}
}