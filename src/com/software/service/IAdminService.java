package com.software.service;

import com.software.entity.Brand;
import com.software.entity.Category;
import com.software.entity.Game;

public interface IAdminService {
	/**
	 * 管理员添加商品信息
	 * @param game
	 * @return
	 */
	public int add(Game game);
	
	/**
	 * 管理员修改商品信息
	 * @param game
	 * @return
	 */
	public int modifyInfo(Game game);
	
	/**
	 * 管理员添加游戏厂商
	 * @param brand
	 * @return
	 */
	public int addBrand(Brand brand);
	
	/**
	 * 管理员添加游戏类型
	 * @param category
	 * @return
	 */
	public int addCategory(Category category);
}
