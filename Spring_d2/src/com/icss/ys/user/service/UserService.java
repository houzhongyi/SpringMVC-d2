package com.icss.ys.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.icss.ys.user.dao.IDao;
import com.icss.ys.user.dao.MySqlDaoImpl;
@Service
public class UserService {
	//private MySqlDaoImpl dao = new MySqlDaoImpl();
	@Autowired
	@Qualifier(value="mySqlDaoImpl")
	private IDao dao ;
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	public boolean insert(){
		return dao.insert();
	}
}
