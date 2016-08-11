package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicespirittest.page.CenterOuStock;


public class CenterOuStockTest {

	@Test
	public void ceterOutStock() {
		CenterOuStock cos = new CenterOuStock();
		cos.centerOuStock();
		Assert.assertEquals("出库成功！", cos.result);
	}
}
