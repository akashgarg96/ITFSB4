package com.CMS.service;

import com.CMS.bean.User;

public class AccountantLoginService {

	public boolean isValidate(User u)
	{
		if(u.getuName().equals("accountant") && u.getuPass().equals("accountant"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
