package com.hs.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("second");
		out.print("<h2>Response before Dispatching</h2>");
		//rd.forward(req, res);
		rd.include(req, res);
		out.print("<h2>Response after Dispatching</h2>");
		
	}

}
