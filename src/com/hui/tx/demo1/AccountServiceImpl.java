package com.hui.tx.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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

	//注入事务模板
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}



	/**
	 * from 转出账户
	 * to  转入账户
	 * monty 数目
	 */
	public void transfer(final String from, final String to, final Double money) {
		
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				// TODO Auto-generated method stub
				accountDao.outMoney(from, money);
				int d = 1/0;
				accountDao.inMoney(to, money);
			}
		});
		
	}

}
