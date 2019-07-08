package com.software.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.software.dao.IQueryDao;
import com.software.entity.Cart;
import com.software.utils.JDBCUtils;

public class QueryDaoImpl implements IQueryDao {

	@Override
	public List<Map<String, Object>> UserQueryAll() throws SQLException {
		String sql = "SELECT g.id,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.STATUS=1";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> UserQueryAllByDesc() throws SQLException {
		String sql = "SELECT g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.STATUS=1\r\n" + "ORDER BY PRICE DESC";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> UserQueryAllByAsc() throws SQLException {
		String sql = "SELECT g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.STATUS=1\r\n" + "ORDER BY PRICE ASC";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> getUserRecode(String id) throws SQLException {
		String sql = "SELECT r.id,u.USERNAME as name1,g.NAME as name2,r.BUY_DATE,g.PRICE\r\n"
				+ "FROM T_RECORD r,T_GAME g,T_USER u\r\n" + "WHERE r.USER_ID=u.id AND r.GAME_ID=g.id AND USER_ID=?";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler(), id);
		return list;
	}

	@Override
	public List<Map<String, Object>> scanGame(String gameName) throws SQLException {
		String sql = "SELECT g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.STATUS=1 AND  g.name LIKE ?";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler(),
				"%" + gameName + "%");
		return list;
	}

	@Override
	public List<Map<String, Object>> AdminQueryAll() throws SQLException {
		String sql = "SELECT g.ID,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,DECODE(g.STATUS ,'0','未上架','1','正在售卖') as status,g.INFOR,g.COUNT\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n" + "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryByGameId(int gameId) throws SQLException {
		String sql = "SELECT g.ID,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,DECODE(g.STATUS ,'0','未上架','1','正在售卖') as status,g.INFOR,g.COUNT\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.ID=?";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler(), gameId);
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryUserGame(int userId) {

		return null;
	}

	@Override
	public List<Map<String, Object>> QueryCart(int userId) throws SQLException {
		String sql = "SELECT c.id,g.name as name,g.PRICE as price,c.COUNT as count\r\n" + "FROM T_CART c,T_GAME g\r\n"
				+ "WHERE c.GAME_ID=g.ID AND c.STATUS=0 AND c.USER_ID=?";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler(), userId);
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryByGameCategory1() throws SQLException {
		String sql = "SELECT g.ID,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.CATEGORY_ID=1 and g.status=1";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryByGameCategory2() throws SQLException {
		String sql = "SELECT g.ID,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.CATEGORY_ID=2 and g.status=1";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryByGameCategory3() throws SQLException {
		String sql = "SELECT g.ID,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.CATEGORY_ID=3 and g.status=1";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryByGameCategory4() throws SQLException {
		String sql = "SELECT g.ID,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND g.CATEGORY_ID=4 and g.status=1";
		List<Map<String, Object>> list = JDBCUtils.getQueryRunner().query(sql, new MapListHandler());
		return list;
	}

	@Override
	public Cart CheckGoodsCount(int CartId) throws SQLException {
		String sql = "SELECT COUNT FROM T_CART WHERE ID=?";
		Cart result = JDBCUtils.getQueryRunner().query(sql, new BeanHandler<>(Cart.class), CartId);
		return result;
	}

	@Override
	public Object GetTotalPrice(int UserId) throws SQLException {
		String sql = "SELECT SUM(total_price) FROM (SELECT price*COUNT as total_price FROM T_CART WHERE USER_ID=? AND STATUS=0)";
		Object result = JDBCUtils.getQueryRunner().query(sql, new ScalarHandler<>(), UserId);
		return result;
	}

	@Override
	public List<Cart> QueryGameIdPriceCount(int UserId) throws SQLException {
		String sql = "select id,game_id,price,count from t_cart where user_id=? ";
		List<Cart> list = JDBCUtils.getQueryRunner().query(sql, new BeanListHandler<>(Cart.class), UserId);
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryMyGame(int UserId) throws SQLException {
		String sql = "SELECT g.name as name,r.BUY_DATE as buy_date\r\n" + "FROM T_RECORD r,T_GAME g\r\n"
				+ "WHERE r.GAME_ID=g.ID AND r.USER_ID=?";
		List<Map<String, Object>> result = JDBCUtils.getQueryRunner().query(sql, new MapListHandler(), UserId);
		return result;
	}

	@Override
	public List<Map<String, Object>> GameInfo(int gameId) throws SQLException {
		String sql = "SELECT g.id,g.NAME as name1,b.NAME as name2,c.NAME as name3,g.PRICE,g.START_DATE,g.INFOR,p.PICTURE_URL\r\n"
				+ "FROM T_BRAND b,T_CATEGORY c,T_GAME g,T_PICTURE p\r\n"
				+ "WHERE g.BRAND_ID=b.ID AND g.CATEGORY_ID=c.ID AND p.GAME_ID=g.id AND g.STATUS=1 AND g.id=?";
		List<Map<String, Object>> result = JDBCUtils.getQueryRunner().query(sql, new MapListHandler(), gameId);
		return result;
	}

}
