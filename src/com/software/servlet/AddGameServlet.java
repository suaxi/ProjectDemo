package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.Game;
import com.software.service.impl.AdminServiceImpl;
@WebServlet("/doAdminAdd")
public class AddGameServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminServiceImpl ad = new AdminServiceImpl();
		String name = req.getParameter("gamename");
		String brand = req.getParameter("brand");
		String category = req.getParameter("category");
		String price = req.getParameter("price");
		String start_date = req.getParameter("startdate");
		String status = req.getParameter("status");
		String info = req.getParameter("info");
		Game game = new Game(name, brand, category, Double.parseDouble(price), start_date, Integer.parseInt(status), info);
		int result=ad.add(game);
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
