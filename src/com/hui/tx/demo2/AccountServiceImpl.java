package com.hui.tx.demo2;


/**
 * 转账业务层实现类
 * @author huihui
 *
 */
public class AccountServiceImpl implements AccountService {

	//注入DAO
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
 


	/**
	 * from 转出账户
	 * to  转入账户
	 * monty 数目
	 */
	public void transfer(final String from, final String to, final Double money) {
		
		
		accountDao.outMoney(from, money);
		int d = 1/0;
		accountDao.inMoney(to, money);
		
	}

}
