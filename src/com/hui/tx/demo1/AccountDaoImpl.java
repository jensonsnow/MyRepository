package com.hui.tx.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	

	public void outMoney(String from, Double money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("update account set money=money-? where name=?",money,from);

	}

	public void inMoney(String to, Double money) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("update account set money=money+? where name=?",money,to);

	}

}
