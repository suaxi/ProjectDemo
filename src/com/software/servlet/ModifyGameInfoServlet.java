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
@WebServlet("/doModifyGameInfo")
public class ModifyGameInfoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminServiceImpl aS = new AdminServiceImpl();
		//获取当前页面提交的参数
		String id = req.getParameter("id");
		String name = req.getParameter("gamename");
		String brand_id = req.getParameter("brand_id");
		String category_id = req.getParameter("category_id");
		String price = req.getParameter("price");
		String start_date = req.getParameter("start_date");
		String status = req.getParameter("status");
		String info = req.getParameter("infor");
		String count = req.getParameter("count");
		//把参数封装到对象中
		Game game = new Game(Integer.parseInt(id), name, Integer.parseInt(brand_id), Integer.parseInt(category_id), Double.parseDouble(price), start_date, Integer.parseInt(status), info, Integer.parseInt(count));
		//调用service层方法修改游戏信息
		int result = aS.modifyInfo(game);
		//根据返回值判断是否修改成功
		PrintWriter writer = resp.getWriter();
		if(result>0) {//修改成功
			writer.write("1");
		}else {//修改失败
			writer.write("2");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
