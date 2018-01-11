package com.CMS.service;

import com.CMS.bean.User;

public class AdminLoginService {
	
	public boolean isValidate(User u)
	{
		if(u.getuName().equals("admin") && u.getuPass().equals("admin"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
