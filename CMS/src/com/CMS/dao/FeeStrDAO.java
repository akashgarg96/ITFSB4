package com.CMS.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.CMS.bean.FeeStr;

public class FeeStrDAO {

	public List<FeeStr> getFeeDetails() 
	{
		Connection conn=DatabaseConnection.getDbConnection();
		List<FeeStr> feeList=new ArrayList();
		String sql="select * from Fee_Str";
		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				String stream=rs.getString(1);
				double fee=rs.getDouble(2);
				FeeStr f=new FeeStr(stream,fee);
				feeList.add(f);
						
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return feeList;
		
	}	
}
