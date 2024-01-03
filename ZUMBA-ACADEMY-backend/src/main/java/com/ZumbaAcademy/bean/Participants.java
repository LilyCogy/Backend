package com.ZumbaAcademy.bean;

public class Participants {
private int participant;
private int batchid;

public Participants() {
	super();
	// TODO Auto-generated constructor stub
}

public Participants(int participant, int batchid) {
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

public int addParticipants(Participants participant2) {
	// TODO Auto-generated method stub
	return 0;
}

}

