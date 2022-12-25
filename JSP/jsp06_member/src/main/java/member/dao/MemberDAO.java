package member.dao;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.DataSource;

import member.db.JDBCUtil;
import member.vo.MemberBean;

public class MemberDAO {

	// 싱글톤
	private MemberDAO() {}
	private static MemberDAO memberDAO;
	public static MemberDAO getInstance() {
		if(memberDAO==null) memberDAO=new MemberDAO();
		return memberDAO;
	}


	Connection conn=null;
	DataSource ds=null;


	//DB커넥션
	public void setConnection(Connection conn) {
		this.conn=conn;
	}


	// 회원수
	public int selectListCount(String f, String q) {
		int listCount=0;

		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select count(*) from board_member where "+f+" like ?";

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+q+"%");
			rs=pstmt.executeQuery();
			if(rs.next())listCount=rs.getInt(1);

		}catch(Exception e) {
			System.out.println("selectListCount 실패 - "+e.getMessage());
		}finally {
			JDBCUtil.close(null, pstmt, rs);
		}

		return listCount;
	}


	//회원 조회
	public ArrayList<MemberBean> selectMemberList(int p, int limit, String f, String q) {
		ArrayList<MemberBean> memberList=new ArrayList<>();

		MemberBean member=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from board_member where "+f+" like ? "
				+" order by member_id limit ?,"+limit;
		int startRow=(p-1)*limit;

		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+q+"%");
			pstmt.setInt(2, startRow);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				member=new MemberBean();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}

		}catch(Exception e) {
			System.out.println("selectMemberList 실패 - "+e.getMessage());
		}finally {
			JDBCUtil.close(null, pstmt, rs);
		}

		return memberList;
	}
	
}