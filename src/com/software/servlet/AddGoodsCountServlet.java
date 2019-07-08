package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.service.impl.UserServiceImpl;
@WebServlet("/doAddGoodsCount")
public class AddGoodsCountServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserServiceImpl uS = new UserServiceImpl();
	String CartId = req.getParameter("CartId");
	uS.addGoodsCount(Integer.parseInt(CartId));
	req.getRequestDispatcher("doMyCart").forward(req, resp);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
