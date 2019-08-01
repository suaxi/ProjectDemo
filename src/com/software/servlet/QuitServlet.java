package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/doQuit")
public class QuitServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//退出登录
		HttpSession session = req.getSession();
		/*session.setMaxInactiveInterval(-1);*/
		//销毁session，清空当前用户的属性
		session.removeAttribute("user");
		//重定向到主界面
		resp.sendRedirect("index.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
