package com.ZumbaAcademy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ZumbaAcademy.bean.Batch;

/**
 * Servlet implementation class BatchController
 * @param <BatchService>
 */
@WebServlet("/BatchController")
public class BatchController<BatchService> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	BatchService bs = new BatchService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String operation = request.getParameter("operation");
		if(operation.equals("add")) {
				Batch batch = new Batch();
			String time = request.getParameter("time");
			
			batch.setBatchid(batchId);
			batch.setTime(time);
			String result = bs.storeBatch(batch);
			pw.println(result);
			RequestDispatcher rd = request.getRequestDispatcher("addBatch.jsp");
			response.setContentType("text/html");
			
		}
	}

	
	
}
