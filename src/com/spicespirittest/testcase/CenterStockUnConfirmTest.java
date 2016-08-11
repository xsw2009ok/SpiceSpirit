package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.CenterStockUnConfirm;

public class CenterStockUnConfirmTest {

	@Test
	public void centerStockUnConfirm() {
		CenterStockUnConfirm csuc = new CenterStockUnConfirm();
		csuc.centerStockUnConfirm();
		Assert.assertEquals("确认成功！", csuc.result);
	}
}
