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
@WebServlet("/doQueryByGameId")
public class QueryByGameIdServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//获取页面提交的参数
		String gameId = req.getParameter("id");
		//调用service层方法，通过获取的游戏id查询游戏详细信息存入list表中
		List<Map<String, Object>> list = qS.QueryByGameId(Integer.parseInt(gameId));
		req.getSession().setAttribute("game", list);
		//请求转发到管理员修改游戏信息界面
		req.getRequestDispatcher("AdminModifyGameInfo.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
