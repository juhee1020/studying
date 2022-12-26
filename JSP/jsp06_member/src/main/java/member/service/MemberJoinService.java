package member.service;

import java.sql.Connection;

import member.dao.MemberDAO;
import member.db.JDBCUtil;
import member.vo.MemberBean;

public class MemberJoinService {

	public boolean registerMember(MemberBean member) {

		boolean isJoinSuccess=false;
		
		Connection conn=JDBCUtil.getConnection();
		MemberDAO memberDAO=MemberDAO.getInstance();
		memberDAO.setConnection(conn);

		int joinCount=memberDAO.joinMember(member);

		if(joinCount>0) {
			JDBCUtil.commit(conn);
			JDBCUtil.close(conn, null, null);
			isJoinSuccess=true;
		}else {JDBCUtil.rollback(conn);}

		return isJoinSuccess;
	}
}