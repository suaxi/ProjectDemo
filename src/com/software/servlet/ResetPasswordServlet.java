package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;


@WebServlet("/doReset")
public class ResetPasswordServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl us = new UserServiceImpl();
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String id_number = req.getParameter("idnumber");
		User user = new User(username, password, id_number);
		int result = us.resetPassword(user);
	    PrintWriter writer = resp.getWriter();
		if(result>0) {
			writer.write("1");
		}else {
			writer.write("2");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
