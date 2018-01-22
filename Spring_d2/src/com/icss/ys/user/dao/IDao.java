package com.icss.ys.user.dao;

import org.springframework.stereotype.Repository;

import com.icss.ys.user.po.User;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
@Repository
public interface IDao {
	
	public abstract boolean insert();
	
	public abstract User queryByUsername();

}
