package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.AdminDaoImpl;
import com.software.entity.Brand;
import com.software.entity.Category;
import com.software.entity.Game;
import com.software.service.IAdminService;

public class AdminServiceImpl implements IAdminService{
	AdminDaoImpl ad = new AdminDaoImpl();
	@Override
	public int add(Game game) {
		int addGame=0;
		try {
			addGame=ad.add(game);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addGame;
	}
	@Override
	public int modifyInfo(Game game) {
		int row = 0;
		try {
			row = ad.modifyInfo(game);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	@Override
	public int addBrand(Brand brand) {
		int row=0;
		try {
			 row= ad.addBrand(brand);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	@Override
	public int addCategory(Category category) {
		int row=0;
		try {
			row= ad.addCategory(category);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

}
