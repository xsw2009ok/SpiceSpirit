package com.spicespirittest.testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.CenterInStock;

public class CenterInStockTest {

	@Test
	public void centerInStockTest(){
		CenterInStock cis = new CenterInStock();
		
		cis.centerInStock();

//		Assert.assertEquals("入库成功！", cis.result);
	}
}
