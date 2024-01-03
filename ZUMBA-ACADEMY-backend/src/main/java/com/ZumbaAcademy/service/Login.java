package com.ZumbaAcademy.service;


import com.ZumbaAcademy.bean.Login;
import com.ZumbaAcademy.dao.LoginDao;

public class LoginService {
	LoginDao ld = new LoginDao();
	
	public String signIn(Login login) {
			if(ld.signIn(login)) {
					if(login.getTypeofuser().equals("admin")) {
						return "Admin login successfully";
					}else {
						return "Customer login successfully";
					}
			}else {
				return "Failure try once again";
			}
	}
	
	public String signUp(Login login) {
		if(login.getTypeofuser().equals("admin")) {
			return "you can't create admin account";
		}else if(ld.signUp(login)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
}