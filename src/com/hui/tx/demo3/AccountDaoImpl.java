package com.hui.tx.demo3;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	

	public void outMoney(String from, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money=money-"+money+" where name='"+from+"'";
		System.out.println(sql);
		this.getJdbcTemplate().update(sql);

	}

	public void inMoney(String to, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money=money+"+money+" where name='"+to+"'";
		System.out.println(sql);
		this.getJdbcTemplate().update(sql);
	}

}
