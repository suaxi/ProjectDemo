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
@WebServlet("/doGameInfo")
public class GameInfoServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	QueryServiceImpl qS = new QueryServiceImpl();
	//获取页面提交的参数
	String gameId = req.getParameter("gameId");
	//调用service层方法通过获取的游戏id来查询游戏信息存入list表中
	List<Map<String, Object>> list = qS.GameInfo(Integer.parseInt(gameId));
	//设置对象属性
	req.getSession().setAttribute("list", list);
	//转发请求到游戏信息显示界面
	req.getRequestDispatcher("indexGameInfoEL.jsp").forward(req, resp);	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
