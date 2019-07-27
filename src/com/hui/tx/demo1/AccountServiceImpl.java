package com.hui.tx.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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

	//ע������ģ��
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}



	/**
	 * from ת���˻�
	 * to  ת���˻�
	 * monty ��Ŀ
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
