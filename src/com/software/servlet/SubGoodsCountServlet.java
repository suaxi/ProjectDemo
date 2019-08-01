package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.service.impl.UserServiceImpl;
@WebServlet("/doSubGoodsCount")
public class SubGoodsCountServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserServiceImpl uS = new UserServiceImpl();
	//获取购物车实体类里的id信息
	String CartId = req.getParameter("CartId");
	//调用service层方法根据购物车里当前选中商品的id，增加购物车里商品的数量
	uS.subGoodsCount(Integer.parseInt(CartId));
	//请求转发
	req.getRequestDispatcher("doMyCart").forward(req, resp);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
