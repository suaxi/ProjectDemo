package com.software.service;

import java.util.List;
import java.util.Map;

import com.software.entity.Cart;

public interface IQueryService {
	/**
	 * 查询商品信息
	 * @return
	 */
	public List<Map<String, Object>> UserQueryAll();
	
	/**
	 * 按价格降序查询商品信息
	 * @return
	 */
	public List<Map<String, Object>> UserQueryAllByDesc();
	
	/**
	 * 按价格升序查询商品信息
	 * @return
	 */
	public List<Map<String, Object>> UserQueryAllByAsc();
	
	/**
	 * 根据id查询用户订单信息
	 * @param id
	 * @return
	 */
	public List<Map<String, Object>> getUserRecode(String id);
	
	/**
	 * 查询所有游戏信息
	 * @param gameName
	 * @return
	 */
	public List<Map<String, Object>> scanGame(String gameName);
	
	/**
	 * 管理员查询所有游戏信息
	 * @return
	 */
	public List<Map<String, Object>> AdminQueryAll();
	
	/**
	 * 根据id查询游戏信息
	 * @param gameId
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameId(int gameId);
	
	/**
	 * 购物车
	 * @param userId
	 * @return
	 */
	public List<Map<String, Object>> QueryCart(int userId);
	
	/**
	 * 按动作类型查询
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory1();
	
	/**
	 * 按角色类型查询
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory2();
	
	/**
	 * 按策略类型查询
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory3();
	
	/**
	 * 按大型多人在线类型查询
	 * @return
	 */
	public List<Map<String, Object>> QueryByGameCategory4();
	
	/**
	 * 查询购物车中的商品总价
	 * @param UserId
	 * @return
	 */
	public Object GetTotalPrice(int UserId);
	
	/**
	 * 查询游戏价格
	 * @param UserId
	 * @return
	 */
	public List<Cart> QueryGameIdPriceCount(int UserId);
	
	/**
	 * 用户查询游戏库
	 * @param UserId
	 * @return
	 */
	public List<Map<String, Object>> QueryMyGame(int UserId);
	
	/**
	 * 查询游戏信息
	 * @param gameId
	 * @return
	 */
	public List<Map<String, Object>> GameInfo(int gameId);
}
