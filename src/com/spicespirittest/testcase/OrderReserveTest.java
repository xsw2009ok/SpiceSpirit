package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.OrderReserve;



public class OrderReserveTest {

	@Test
	public void  orderReserveTest(){
		OrderReserve or = new OrderReserve();
		or.createReserveOrder();
		Assert.assertEquals("成功", or.result);
		
	}
}
