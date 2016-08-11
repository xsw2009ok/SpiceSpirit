package com.spicespirittest.page;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.SpiceSpiritBase;

public class Logout extends SpiceSpiritBase {
	
	
	public void logoutPage(){
		log.info("点击退出按钮");
		click(AllWebElement.LOGOUT_BUTTON_LOGOUT);
		sleep();
		result = "";
		result = getUrl();
	}
	
}
