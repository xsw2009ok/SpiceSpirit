package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicespirittest.page.CenterOuStock;


public class CenterOuStockTest {

	@Test
	public void centerOutStock() {
		CenterOuStock cos = new CenterOuStock();
		cos.centerOuStock();
//		Assert.assertEquals("打印出库单！", cos.result);
	}
}
