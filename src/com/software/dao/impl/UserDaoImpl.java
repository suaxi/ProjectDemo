package com.software.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.software.dao.IUserDao;
import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;
import com.software.utils.JDBCUtils;



/** 
* @author 作者 : dyb
* @version 创建时间：2019年6月5日 上午10:44:49 
* 类说明 
*/
public class UserDaoImpl implements IUserDao{

	@Override
	public int addUser(User user) throws SQLException  {
		String sql = "insert into t_user values(seq_t_user.nextval,?,?,?,?,?,0)";
		int row = JDBCUtils.getQueryRunner().update(sql, user.getUsername(),user.getPassword(),user.getIdnumber(),user.getTel(),user.getEmail());
		return row;
	}

	@Override
	public User queryByUserName(String username) throws SQLException {
		String sql = "select * from t_user where username=?";
		User user = JDBCUtils.getQueryRunner().query(sql, new BeanHandler<>(User.class), username);
		return user;
	}

	
	@Override
	public User queryByUser(User user) throws SQLException {
		String sql = "select * from t_user where username=? and password=?";
		User result = JDBCUtils.getQueryRunner().query(sql, new BeanHandler<>(User.class) , user.getUsername(),user.getPassword());
		return result;
	}

	@Override
	public int resetPassord(User user) throws SQLException {
		String sql = "update t_user set password=? where username=? and id_number=?";
		int row=JDBCUtils.getQueryRunner().update(sql,user.getPassword(),user.getUsername(),user.getIdnumber());
		return row;
	}

	@Override
	public int buyGame(Record record) throws SQLException {
		String sql = "INSERT INTO T_RECORD VALUES(seq_t_record.nextval,?,?,SYSDATE,?)";
		int row = JDBCUtils.getQueryRunner().update(sql,record.getUserId(),record.getGameId(),record.getPrice());
		return row;
	}

	@Override
	public int addCount(String gameId) throws SQLException {
		String sql = "UPDATE T_GAME SET count=count+1 WHERE id=?";
		int row = JDBCUtils.getQueryRunner().update(sql,gameId);
		return row;
	}

	@Override
	public int addCart(Cart cart) throws SQLException {
		String sql = "INSERT INTO T_CART(ID,USER_ID,GAME_ID,PRICE,COUNT,STATUS) VALUES(seq_t_cart.nextval,?,?,?,1,0)";
		int row = JDBCUtils.getQueryRunner().update(sql,cart.getUser_id(),cart.getGame_id(),cart.getPrice());
		return row;
	}

	@Override
	public int changeCartStatus(int CartId) throws SQLException {
		String sql = "UPDATE T_CART SET STATUS=1 WHERE Id=?";
		int row = JDBCUtils.getQueryRunner().update(sql,CartId);
		return row;
	}

	@Override
	public int addGoodsCount(int CartId) throws SQLException {
		String sql = "UPDATE T_CART SET count=count+1 WHERE id=?";
		int row = JDBCUtils.getQueryRunner().update(sql,CartId);
		return row;
	}

	@Override
	public int subGoodsCount(int CartId) throws SQLException {
		String sql = "UPDATE T_CART SET count=count-1 WHERE id=?";
		int row = JDBCUtils.getQueryRunner().update(sql,CartId);
		return row;
	}

	@Override
	public int DeleteCart(int CartId) throws SQLException {
		String sql = "DELETE FROM T_CART WHERE STATUS=1 AND id=?";
		int row = JDBCUtils.getQueryRunner().update(sql,CartId);
		return row;
	}	
	
	
}
