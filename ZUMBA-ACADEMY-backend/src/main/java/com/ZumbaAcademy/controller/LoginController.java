package com.ZumbaAcademy.controller;

import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;

import com.ZumbaAcademy.bean.Login;
import com.ZumbaAcademy.bean.Participants;
import com.ZumbaAcademy.service.LoginService;

import javax.ws.rs.core.MediaType;

@Path("login")
public class LoginController{
LoginService ls = new LoginService();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("signin")
	public String signln(Login login) {
		
		return ls.signIn(login);
	}
}


public class LoginController {
private int participant;
private int batchid;

public LoginController() {
	super();
	// TODO Auto-generated constructor stub
}

public LoginController(int participant, int batchid) {
	super();
	this.participant = participant;
	this.batchid = batchid;
}

public int getParticipant() {
	return participant;
}
public void setParticipant(int participant) {
	this.participant = participant;
}


public int getBatchid() {
	return batchid;
}
public void setBatchid(int batchid) {
	this.batchid = batchid;
}

public String storeParticipatns(Participants pp) {
	// TODO Auto-generated method stub
	return null;
}

public int addParticipants(LoginController participant2) {
	// TODO Auto-generated method stub
	return 0;
}

}
