package com.software.dao.impl;

import java.sql.SQLException;
import com.software.dao.IAdminDao;
import com.software.entity.Brand;
import com.software.entity.Category;
import com.software.entity.Game;
import com.software.utils.JDBCUtils;

public class AdminDaoImpl implements IAdminDao{

	@Override
	public int add(Game game) throws SQLException {
		String sql = "insert into t_game values(seq_t_game.nextval,?,?,?,?,?,?,?,0)";
		int row=JDBCUtils.getQueryRunner().update(sql,game.getName(),game.getBrand(),game.getCategory(),game.getPrice(),game.getStart_date(),game.getStatus(),game.getInfo());
		return row;
	}

	@Override
	public int modifyInfo(Game game) throws SQLException {
		String sql = "update t_game set name=?,brand_id=?,category_id=?,price=?,start_date=?,status=?,infor=?,count=? where id=?";
		int row = JDBCUtils.getQueryRunner().update(sql,game.getName(),game.getBrand_id(),game.getCategory_id(),game.getPrice(),game.getStart_date(),game.getStatus(),game.getInfo(),game.getCount(),game.getId());
		return row;
	}

	@Override
	public int addBrand(Brand brand) throws SQLException {
		String sql="insert into t_brand values(seq_t_brand.nextval,?)";
		int row = JDBCUtils.getQueryRunner().update(sql, brand.getName());
		return row;
	}

	@Override
	public int addCategory(Category category) throws SQLException {
		String sql="insert into t_category values(seq_t_category.nextval,?)";
		int row = JDBCUtils.getQueryRunner().update(sql,category.getName() );
		return row;
	}

}
