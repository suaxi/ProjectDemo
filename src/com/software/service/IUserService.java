package com.software.service;

import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;

/**
 * @author 作者 : dyb
 * @version 创建时间：2019年6月5日 上午11:09:09 类说明
 */
public interface IUserService {

	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public int register(User user);

	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	public User login(User user);

	/**
	 * 重置密码
	 * @param user
	 * @return
	 */
	public int resetPassword(User user);

	/**
	 * 查重
	 * @param user
	 * @return
	 */
	public int cheack(User user);

	/**
	 * 购买游戏
	 * @param record
	 * @return
	 */
	public int buyGame(Record record);

	/**
	 * 添加数量
	 * @param gameId
	 * @return
	 */
	public int addCount(String gameId);

	/**
	 * 添加购物车
	 * @param cart
	 * @return
	 */
	public int addCart(Cart cart);

	/**
	 * 修改购物车中商品的类型为是否显示
	 * @param CartId
	 * @return
	 */
	public int changeCartStatus(int CartId);

	/**
	 * 增加购物车中商品数量
	 * @param CartId
	 * @return
	 */
	public int addGoodsCount(int CartId);

	/**
	 * 减少购物车中商品数量
	 * @param CartId
	 * @return
	 */
	public int subGoodsCount(int CartId);

	/**
	 * 清空购物车
	 * @param CartId
	 * @return
	 */
	public int DeleteCart(int CartId);
	

}
