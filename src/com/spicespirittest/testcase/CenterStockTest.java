package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.CenterStock;

public class CenterStockTest {

	@Test
	public void centerStockTest() {
		CenterStock cs = new CenterStock();
		// 采购商品
		cs.centerStockGApplication();
		Assert.assertEquals("采购单创建成功!", cs.result);

	}

}
