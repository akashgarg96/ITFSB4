package com.CMS.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.CMS.bean.Staff;



public class StaffDAO {

	public int insertStaffData(Staff staff)
		{
				Connection conn=DatabaseConnection.getDbConnection();
				String sql="insert into staff values(?,?,?,?,?,?)";
				PreparedStatement ps=null;
				try {
					ps = conn.prepareStatement(sql);
					ps.setInt(1, staff.getStaffId());
					ps.setString(2, staff.getStaffName());
					ps.setDouble(3, staff.getSalary());
					ps.setString(4,staff.getStaffUsername());
					ps.setString(5, staff.getStaffPassword());
					ps.setString(6, staff.getDeptName());
				
					return ps.executeUpdate();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				
				return 0;
		
		}	
	
	public List<Staff> getStaffDetails() 
	{
		Connection conn=DatabaseConnection.getDbConnection();
		List<Staff> staffList=new ArrayList();
		String sql="select * from staff";
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				
				double salary=rs.getDouble(3);
				String user=rs.getString(4);
				String pass=rs.getString(5);
				String dname=rs.getString(6);
				Staff staff=new Staff(id,name,salary,user,pass,dname);
				staffList.add(staff);
						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return staffList;
		
		
	}
	
	public Staff validateStaffFromDB(Staff staff) throws SQLException
	{
		Connection conn=DatabaseConnection.getDbConnection();
		Staff stf=null;
		String sql="select * from Staff where username=? and password=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, staff.getStaffUsername());
		ps.setString(2, staff.getStaffPassword());
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			 stf=new Staff(rs.getString(4),rs.getString(5));
			
		}
		return stf;
		
	}
}