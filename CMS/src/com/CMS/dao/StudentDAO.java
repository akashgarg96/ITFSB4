package com.CMS.dao;
import java.sql.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

import com.CMS.bean.Students;
import com.CMS.bean.User;
public class StudentDAO {
	
	public int insertStudentData(Students students)
	{
			Connection conn=DatabaseConnection.getDbConnection();
			String sql="insert into students values(?,?,?,?,?,?,?,?,?)";
			java.sql.Date sqlDate = new Date(students.getDob().getTime());
			PreparedStatement ps=null;
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, students.getsId());
				ps.setString(2, students.getsName());
				ps.setString(3, students.getGender());
				ps.setDate(4,sqlDate);
				
				ps.setString(5, students.getStream());
				ps.setString(6, students.getEmail());
				ps.setLong(7, students.getContact());
				
				ps.setString(8, students.getUsername());
				ps.setString(9, students.getPassword());
				return ps.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return 0;
	
	}
	
	
	public List<Students> getStudentDetails() 
	{
		Connection conn=DatabaseConnection.getDbConnection();
		List<Students> stdList=new ArrayList();
		String sql="select * from students";
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String gender=rs.getString(3);
				Date d=rs.getDate(4);
				String stream=rs.getString(5);
				String email=rs.getString(6);
				long con=rs.getLong(7);
				String user=rs.getString(8);
				String pass=rs.getString(9);
				Students std=new Students(id,name,gender,d,stream,email,con,user,pass);
				stdList.add(std);
						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return stdList;
		
		
	}
	
	public Students validateStudentFromDB(Students student) throws SQLException
	{
		Connection conn=DatabaseConnection.getDbConnection();
		Students std=null;
		String sql="select * from Students where username=? and password=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, student.getUsername());
		ps.setString(2, student.getPassword());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			 std=new Students(rs.getString(8),rs.getString(9));
			
		}
		return std;
		
	}
	
	/*public Student getStudentDetailsOnCondition(int stdid)
	{
		Connection conn=DatabaseConnection.getDbConnection();
		
		Student std=null;
		String sql="select * from student where studentid = " +stdid;
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				std=new Student(id,name,email);
				return std;
						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return std;
	}
	
	public static void main(String[] args) {
		
		DAO dao=new DAO();
		Student student=dao.getStudentDetailsOnCondition(32);
		System.out.println(student.getStudentId()+ " " +student.getStudentName()+ " " +student.getEmail());
	}
*/
}
