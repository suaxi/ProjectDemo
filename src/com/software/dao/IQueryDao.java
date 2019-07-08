package com.software.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.software.entity.Cart;

public interface IQueryDao {
	
	/**
	 * 查询商品信息
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> UserQueryAll() throws SQLException;
	
	/**
	 * 查询商品信息（降序）
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> UserQueryAllByDesc() throws SQLException;
	
	/**
	 * 查询商品信息（升序）
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> UserQueryAllByAsc() throws SQLException;
	
	/**
	 * 根据id查询用户订单信息
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> getUserRecode(String id) throws SQLException;
	
	/**
	 * 查询所有游戏信息
	 * @param gameName
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> scanGame(String gameName) throws SQLException;
	
	/**
	 * 管理员查询所有游戏信息
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> AdminQueryAll() throws SQLException;
	
	/**
	 * 根据id查询游戏信息
	 * @param gameId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameId(int gameId) throws SQLException;
	
	/**
	 * 用户查询游戏信息
	 * @param userId
	 * @return
	 */
	public List<Map<String, Object>> QueryUserGame(int userId);
	
	/**
	 * 购物车
	 * @param userId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryCart(int userId) throws SQLException;
	
	/**
	 * 按动作类型查询
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory1() throws SQLException;
	
	/**
	 * 按角色类型查询
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory2() throws SQLException;
	
	/**
	 * 按策略类型查询
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory3() throws SQLException;
	
	/**
	 * 按大型多人在线类型查询
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryByGameCategory4() throws SQLException;
	
	/**
	 * 查询商品数量
	 * @param CartId
	 * @return
	 * @throws SQLException
	 */
	public Cart CheckGoodsCount(int CartId) throws SQLException;
	
	/**
	 * 查询购物车中的商品总价
	 * @param UserId
	 * @return
	 * @throws SQLException
	 */
	public Object GetTotalPrice(int UserId) throws SQLException;
	
	/**
	 * 查询游戏价格
	 * @param UserId
	 * @return
	 * @throws SQLException
	 */
	public List<Cart> QueryGameIdPriceCount(int UserId) throws SQLException;
	
	/**
	 * 用户查询游戏库
	 * @param UserId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> QueryMyGame(int UserId) throws SQLException;
	
	/**
	 * 查询游戏信息
	 * @param gameId
	 * @return
	 * @throws SQLException
	 */
	public List<Map<String, Object>> GameInfo(int gameId) throws SQLException;
}
