package com.ZumbaAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.ZumbaAcademy.resource.DbResource;

public class Participants {

	public int addParticipants(Participants participant) {
		try {
		Connection con = DbResource.getDbConnection();	
		PreparedStatement pstmt = con.prepareStatement("insert into participants values(?,?,?,?,?)");
		pstmt.setInt(1, participant.getParticipant());
		pstmt.setInt(5, participant.getBatchid());
		return pstmt.executeUpdate();
		} catch (Exception e) {
				System.err.println(e);
				return 0;
		}
	}
}
