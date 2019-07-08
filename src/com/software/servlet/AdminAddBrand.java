package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.Brand;
import com.software.service.impl.AdminServiceImpl;

/** 
* @author 作者 : 007
* @version 创建时间：2019年6月25日 下午4:00:17 
* 类说明 
*/
@WebServlet("/doAddBrand")
public class AdminAddBrand extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminServiceImpl ad = new AdminServiceImpl();
		String brand = req.getParameter("brand");
		Brand brand2 = new Brand(brand);
		int result = ad.addBrand(brand2);
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
