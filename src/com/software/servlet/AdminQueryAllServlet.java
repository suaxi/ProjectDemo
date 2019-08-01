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
@WebServlet("/doAdminQueryAll")
public class AdminQueryAllServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//调用service层方法，管理员查询所有游戏信息
		List<Map<String, Object>> list = qS.AdminQueryAll();
		req.getSession().setAttribute("list", list);
		//请求转发到管理员界面
		req.getRequestDispatcher("AdminEL.jsp").forward(req, resp);	//页面跳转
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
