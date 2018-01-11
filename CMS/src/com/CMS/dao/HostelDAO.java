package com.CMS.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.CMS.bean.Hostel;
import com.CMS.bean.Staff;

public class HostelDAO {
	
	public int insertHostelData(Hostel h)
	{
			Connection conn=DatabaseConnection.getDbConnection();
			String sql="insert into hostel values(?,?,?)";
			PreparedStatement ps=null;
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, h.getRoomNo());
				ps.setString(2, h.getSeaterType());
				ps.setString(3, h.getRoomType());
				
				return ps.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return 0;
	
	}
	public List<Hostel> getHostelDetails() 
	{
		Connection conn=DatabaseConnection.getDbConnection();
		List<Hostel> roomList=new ArrayList();
		String sql="select * from hostel";
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String type=rs.getString(2);
				String roomtype=rs.getString(3);
				Hostel h=new Hostel(id,type,roomtype);
				roomList.add(h);
						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return roomList;
		
		
	}

}
