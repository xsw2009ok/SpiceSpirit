package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.common.Config;
import com.spicespirittest.page.Logout;

public class LogoutTest {
	
	@Test
	public void logoutTest(){

		Logout lo = new Logout();
		lo.logoutPage();
		Assert.assertEquals(Config.testurl, lo.result);
		lo.closeBrowser();
	}
}
