package com.hui.tx.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
     
	@Resource(name="accountService")
	private AccountService accountService;
	
	
	@Test
	public void demo1() {
		accountService.transfer("ҵ��Ա1", "ҵ��Ա2", 500d);
	}
}
 