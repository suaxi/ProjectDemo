package com.software.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.software.dao.impl.QueryDaoImpl;
import com.software.entity.Cart;
import com.software.service.IQueryService;

public class QueryServiceImpl implements IQueryService {
	QueryDaoImpl qd = new QueryDaoImpl();
	@Override
	public List<Map<String, Object>> UserQueryAll() {
		List<Map<String, Object>> list = null;
		try {
			list = qd.UserQueryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> UserQueryAllByDesc() {
		List<Map<String, Object>> list = null;
		try {
			list = qd.UserQueryAllByDesc();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> UserQueryAllByAsc() {
		List<Map<String, Object>> list = null;
		try {
			list = qd.UserQueryAllByAsc();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> getUserRecode(String id) {
		List<Map<String, Object>> list = null;
		try {
			list = qd.getUserRecode(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> scanGame(String gameName) {
		List<Map<String, Object>> list = null;
		try {
			list = qd.scanGame(gameName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> AdminQueryAll() {
		List<Map<String, Object>> list = null;
		try {
			list = qd.AdminQueryAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryByGameId(int gameId) {
		List<Map<String, Object>> list = null;
		try {
			list = qd.QueryByGameId(gameId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryCart(int userId) {
		List<Map<String, Object>> list = null;
		try {
			list = qd.QueryCart(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<Map<String, Object>> QueryByGameCategory1() {
		List<Map<String, Object>> list = null;
		try {
			list=qd.QueryByGameCategory1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Map<String, Object>> QueryByGameCategory2() {
		List<Map<String, Object>> list = null;
		try {
			list=qd.QueryByGameCategory2();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Map<String, Object>> QueryByGameCategory3() {
		List<Map<String, Object>> list = null;
		try {
			list=qd.QueryByGameCategory3();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<Map<String, Object>> QueryByGameCategory4() {
		List<Map<String, Object>> list = null;
		try {
			list=qd.QueryByGameCategory4();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Object GetTotalPrice(int UserId) {
		Object total_Price = 0;
		try {
			 total_Price = qd.GetTotalPrice(UserId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return total_Price;
	}

	@Override
	public List<Cart> QueryGameIdPriceCount(int UserId) {
		List<Cart> list=null;
		try {
			  list = qd.QueryGameIdPriceCount(UserId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Map<String, Object>> QueryMyGame(int UserId) {
		List<Map<String, Object>> result = null;
		try {
			result = qd.QueryMyGame(UserId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Map<String, Object>> GameInfo(int gameId) {
		List<Map<String, Object>> result = null;
		try {
			result = qd.GameInfo(gameId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}



}
