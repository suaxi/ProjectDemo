package com.software.dao;

import java.sql.SQLException;

import com.software.entity.Brand;
import com.software.entity.Category;
import com.software.entity.Game;

public interface IAdminDao {

	/**
	 * 添加商品信息
	 * @return
	 * @throws SQLException 
	 */
	public int add(Game game) throws SQLException;
	
	/**
	 * 修改商品信息
	 * @param game
	 * @return
	 * @throws SQLException
	 */
	public int modifyInfo(Game game) throws SQLException;
	
	/**
	 * 管理员添加游戏厂商
	 * @param brand
	 * @return
	 * @throws SQLException
	 */
	public int addBrand(Brand brand) throws SQLException;
	
	/**
	 * 管理员添加游戏类型
	 * @param category
	 * @return
	 * @throws SQLException
	 */
	public int addCategory(Category category) throws SQLException;
}
