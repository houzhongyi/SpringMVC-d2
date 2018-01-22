package com.icss.ys.user.dao;

import org.springframework.stereotype.Repository;

import com.icss.ys.user.po.User;
@Repository
public class OracleDaoImpl implements IDao{

	@Override
	public boolean insert() {
		//增加了一条数据
		
		return true;//成功增加
	}

	@Override
	public User queryByUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}
