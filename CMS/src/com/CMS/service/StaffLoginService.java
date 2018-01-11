package com.CMS.service;

import java.sql.SQLException;

import com.CMS.bean.Staff;
import com.CMS.dao.StaffDAO;

public class StaffLoginService {

	public boolean validateStaff(Staff staff) throws SQLException
	{
		StaffDAO dao=new StaffDAO();
		Staff stfDBObj=dao.validateStaffFromDB(staff);
		if(stfDBObj!=null && staff!=null)
		{
			if(staff.getStaffUsername().equals(stfDBObj.getStaffUsername()) && staff.getStaffPassword().equals(stfDBObj.getStaffPassword()))
			{
				return true;
			}
		}
		return false;
		
	}
}
