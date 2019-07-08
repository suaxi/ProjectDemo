package com.software.service.impl;

import java.sql.SQLException;

import com.software.dao.impl.QueryDaoImpl;
import com.software.dao.impl.UserDaoImpl;
import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.IUserService;


/** 
* @author 作者 : dyb
* @version 创建时间：2019年6月5日 上午11:12:14 
* 类说明 
*/
public class UserServiceImpl implements IUserService{
	UserDaoImpl ud = new UserDaoImpl();
	@Override
	public int register(User user) {
		int addUser =0;
		try {
			//查重	
			User result = ud.queryByUserName(user.getUsername());
			if(result!=null) {
				return -2;
			}			
			 addUser = ud.addUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addUser;
	}

	@Override
	public User login(User user) {
		User result = null;
		try {
			 result = ud.queryByUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int resetPassword(User user) {
		int row = 0;
		try {
			row = new UserDaoImpl().resetPassord(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int cheack(User user) {
		User result=null;
		try {
			result=ud.queryByUserName(user.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result!=null) {
			//重名返回-1
			return -1;
		}else {
			return 1;
		}
		
	}

	@Override
	public int buyGame(Record record) {
			int row = 0;
		try {
			row = ud.buyGame(record);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int addCount(String gameId) {
		int row = 0;
		try {
			row = ud.addCount(gameId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int addCart(Cart cart) {
		int row = 0;
		try {
			row = ud.addCart(cart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int changeCartStatus(int CartId) {
		int row = 0;
		try {
			row = ud.changeCartStatus(CartId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int addGoodsCount(int CartId) {
		int row = 0;
		try {
			row = ud.addGoodsCount(CartId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int subGoodsCount(int CartId) {
		
		int row = 0;
		try {
		Cart result = new QueryDaoImpl().CheckGoodsCount(CartId);
			if(result.getCount()>0) {
				row = ud.subGoodsCount(CartId);
			}else {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public int DeleteCart(int CartId) {
		int row = 0;
		try {
			row = ud.DeleteCart(CartId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

}
