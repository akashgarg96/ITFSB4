package com.CMS.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static Connection getDbConnection()
	{
		final String URL="jdbc:oracle:thin:@localhost:1521:xe";
		final String USER="hr";
		final String PASSWORD="hr";
		Connection conn=null;
		
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.commit();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return conn;
		
	}

}
