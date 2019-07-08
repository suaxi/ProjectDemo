package com.software.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doBuy")
public class BuyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl uS = new UserServiceImpl();
		HttpSession session = req.getSession();
		User user = (User)req.getSession().getAttribute("user");
		String userId = user.getId();
		String gameId = req.getParameter("gameId");
		String price = req.getParameter("price");
		System.out.println(userId);
		System.out.println(gameId);
		System.out.println(price);
		Record record = new Record(Integer.parseInt(userId), Integer.parseInt(gameId), Double.parseDouble(price));
		int reslutR = uS.buyGame(record);
		int reslutC = uS.addCount(gameId);
		if(reslutR>0&&reslutC>0) {
			resp.sendRedirect("indexSuccess.jsp");

		}else {
			resp.getWriter().write("¹ºÂòÊ§°Ü£¡");

		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
