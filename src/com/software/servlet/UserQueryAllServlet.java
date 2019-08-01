package com.software.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.service.impl.QueryServiceImpl;

@WebServlet("/doQueryAll")
public class UserQueryAllServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//调用service层方法，用户查询所有游戏信息
		List<Map<String, Object>> list = qS.UserQueryAll();
		//设置属性的值
		req.getSession().setAttribute("list", list);
		//请求转发到游戏信息界面并显示查询出的信息
		req.getRequestDispatcher("indexAllGameEL.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
