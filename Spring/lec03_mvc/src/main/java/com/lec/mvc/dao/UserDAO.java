package com.lec.mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lec.mvc.db.JDBCUtility;
import com.lec.mvc.vo.*;

@Repository("userDAO")
public class UserDAO {

	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;

	UserVO user=null;



	public PageInfo getPageInfo(String tableName, int currentPage, int perPage) {
		PageInfo pageInfo=new PageInfo();

		String sql="select count(*) from "+tableName;

		int totalCount=0; int totalPage=0; int startPage=0; int endPage=0;

		try {
			conn=JDBCUtility.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();

			if(rs.next()) {
				totalCount=rs.getInt(1);
			}
		}catch(Exception e) {
			System.out.println("DB 접 실패 - "+e.getMessage());
		}finally{
			JDBCUtility.close(conn, pstmt, rs);
		}

		if(totalCount>0) {
			totalPage = (int)(totalCount / perPage) + ((totalCount % perPage == 0) ? 0 : 1);
			startPage = (int)(currentPage / perPage) * perPage + 1 + ((currentPage % perPage == 0) ? -perPage : 0);
			endPage = (startPage >= totalPage) ? totalPage : startPage + perPage - 1;
		}

		pageInfo.setTotalCount(totalCount);
		pageInfo.setTotalPage(totalPage);
		pageInfo.setCurrentPage(currentPage);
		pageInfo.setStartPage(startPage);
		pageInfo.setEndPage(endPage);

		return pageInfo;
	}

	public UserVO getUser(String id) {

		user=null;
		String sql="select * from user where id=?";

		try {
			conn=JDBCUtility.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				user=new UserVO();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			JDBCUtility.close(conn, pstmt, rs);
		}
		return user;
	}


	public List<UserVO> getUserList(int currentPage, int perPage) {
		UserVO userVO=null;
		List<UserVO> userList=new ArrayList();
		String sql="select * from user limit ?,?";

		try {
			conn=JDBCUtility.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, (currentPage-1)*perPage);
			pstmt.setInt(2, perPage);
			rs=pstmt.executeQuery();

			while(rs.next()) {
				userVO=new UserVO();
				userVO.setId(rs.getString("id"));
				userVO.setName(rs.getString("name"));
				userVO.setPassword(rs.getString("password"));
				userVO.setRole(rs.getString("role"));
				userList.add(userVO);
			}
		}catch(Exception e) {
			System.out.println("db 접 실패 "+e.getMessage());
		}finally {
			JDBCUtility.close(conn, pstmt, rs);
		}
		return userList;
	}


	public int insertUser(UserVO user2) {

		String sql="insert into user(id, password, name, role) values(?,?,?,?)";
		String role=(user2.getRole()!=null)?"ADMIN":"USER";
		int insertCount=0;

		try {
			conn=JDBCUtility.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user2.getId());
			pstmt.setString(2, user2.getPassword());
			pstmt.setString(3, user2.getName());
			pstmt.setString(4, role);
			insertCount=pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			JDBCUtility.close(conn, pstmt, null);
		}
		return insertCount;
	}


	public int deleteUser(String id) {
		String sql="delete from user where id=?";
		int deleteCount=0;
		
		try {
			conn=JDBCUtility.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			deleteCount=pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally{
			JDBCUtility.close(conn, pstmt, null);
		}
		return deleteCount;
	}

	public int updateUser(UserVO user) {
		String sql="update user set name=?, password=?, role=? where id=?";
		int updateCount=0;
		
		try {
			conn=JDBCUtility.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, (user.getRole()!=null)?"ADMIN":"USER");
			pstmt.setString(4, user.getId());
			updateCount=pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("updateUser 실패 - "+e.getMessage());
		}finally {
			JDBCUtility.close(conn, pstmt, rs);
		}
		return updateCount;
	}
}