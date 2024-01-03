package com.ZumbaAcademy.service;

import com.ZumbaAcademy.controller.Participant;

public class Participants {

	Participant pd = new Participant();
	
	public String storeParticipatns(Participant participant) {
		if(pd.addParticipants(participant)>0) {
			return "Participants details added successfully";
		}else {
			return "Participant details didn't add";
		}
	}
}
