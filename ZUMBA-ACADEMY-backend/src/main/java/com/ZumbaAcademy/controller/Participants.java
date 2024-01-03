package com.ZumbaAcademy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ZumbaAcademy.bean.Batch;
import com.ZumbaAcademy.bean.Participant;



/**
 * Servlet implementation class ParticipantController
 */
@WebServlet("/ParticipantController")
public class Participants extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Participants() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		BatchService bs = new BatchService();
		List<Batch> listOfBatch = bs.allBatchDetails();
		HttpSession hs =request.getSession();
		hs.setAttribute("batchInfo", listOfBatch);
		response.sendRedirect("addParticipants.jsp");
	}

	com.ZumbaAcademy.controller.Participant ps = new com.ZumbaAcademy.controller.Participant();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String operation = request.getParameter("operation");
		if(operation.equals("add")) {
			int participantid = Integer.parseInt(request.getParameter("participantid"));
			String pname = request.getParameter("pname");
			int batchd = Integer.parseInt(request.getParameter("batchid"));
			Participants pp = new Participants();
					pp.setParticipant(participantid);				
					pp.setBatchid(batchd);
					String result = ps.storeParticipatns(pp);
					pw.println(result);
					RequestDispatcher rd = request.getRequestDispatcher("addParticipants.jsp");
					response.setContentType("text/html");
					rd.include(request, response);
		}
	}

	private void setBatchid(int batchd) {
		// TODO Auto-generated method stub
		
	}

	private void setParticipant(int participantid) {
		// TODO Auto-generated method stub
		
	}

}
