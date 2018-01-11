package com.CMS.service;

import java.sql.SQLException;

import com.CMS.bean.Students;
import com.CMS.dao.StudentDAO;


public class StudentLoginService {
	
	public boolean validateStudent(Students student) throws SQLException
	{
		StudentDAO dao=new StudentDAO();
		Students stdDBObj=dao.validateStudentFromDB(student);
		if(stdDBObj!=null && student!=null)
		{
			if(student.getUsername().equals(stdDBObj.getUsername()) && student.getPassword().equals(stdDBObj.getPassword()))
			{
				return true;
			}
		}
		return false;
		
	}

}
