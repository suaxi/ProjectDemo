package com.software.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.User;
import com.software.service.impl.QueryServiceImpl;
@WebServlet("/doMyCart")
public class MyCartServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	QueryServiceImpl qS = new QueryServiceImpl();
	HttpSession session = req.getSession();
	User user = (User)req.getSession().getAttribute("user");
	String userId = user.getId();
	List<Map<String, Object>> list = qS.QueryCart(Integer.parseInt(userId));
	req.getSession().setAttribute("list", list);
	req.getRequestDispatcher("indexMyCartEL.jsp").forward(req, resp);
	Object totalPrice = qS.GetTotalPrice(Integer.parseInt(userId));
	System.out.println(totalPrice);
	resp.getWriter().write("¹²¼Æ"+totalPrice);
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
