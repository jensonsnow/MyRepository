package com.hui.tx.demo2;


/**
 * ת��ҵ���ʵ����
 * @author huihui
 *
 */
public class AccountServiceImpl implements AccountService {

	//ע��DAO
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
 


	/**
	 * from ת���˻�
	 * to  ת���˻�
	 * monty ��Ŀ
	 */
	public void transfer(final String from, final String to, final Double money) {
		
		
		accountDao.outMoney(from, money);
		int d = 1/0;
		accountDao.inMoney(to, money);
		
	}

}
