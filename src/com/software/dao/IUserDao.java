package com.software.dao;

import java.sql.SQLException;

import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;



/** 
* @author 作者 : dyb
* @version 创建时间：2019年6月5日 上午10:40:01 
* 类说明 
*/
public interface IUserDao {
	/**
	 * 注册用户
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public int addUser(User user) throws SQLException;
	
	/**
	 * 注册查重
	 * @param username
	 * @return
	 * @throws SQLException 
	 */
	public User queryByUserName(String username) throws SQLException;
	
	
	/**
	 * 登陆
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public User queryByUser(User user) throws SQLException;
	
	/**
	 * 重置密码
	 * @param username
	 * @param idnumber
	 * @param password
	 * @return
	 * @throws SQLException 
	 */
	public int resetPassord(User user) throws SQLException;
	
	/**
	 * 购买游戏
	 * @param record
	 * @return
	 * @throws SQLException
	 */
	public int buyGame(Record record) throws SQLException;
	
	/**
	 * 添加数量
	 * @param gameId
	 * @return
	 * @throws SQLException
	 */
	public int addCount(String gameId) throws SQLException;
	
	/**
	 * 添加购物车
	 * @param cart
	 * @return
	 * @throws SQLException
	 */
	public int addCart(Cart cart) throws SQLException;
	
	/**
	 * 修改购物车中商品的类型为是否显示
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int changeCartStatus(int CartId) throws SQLException;
	
	/**
	 * 增加购物车中商品数量
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int addGoodsCount(int CartId) throws SQLException;
	
	/**
	 * 减少购物车中商品数量
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int subGoodsCount(int CartId) throws SQLException;
	
	/**
	 * 清空购物车
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public int DeleteCart(int CartId) throws SQLException;
	
}
