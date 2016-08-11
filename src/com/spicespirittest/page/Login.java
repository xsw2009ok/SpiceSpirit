package com.spicespirittest.page;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.SpiceSpiritBase;





public class Login extends SpiceSpiritBase {

	 /**
	  * 加载默认界面的元素
	  */
	public void checkLoginElement() {
		waitForElementToLoad(config.waittime,AllWebElement.LOGIN_CUSTOMER );
	}
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 */
	public void inputLoginElement(String username,String password){
		click(AllWebElement.LOGIN_CUSTOMER);
		input(AllWebElement.LOGIN_INPUT_USERNAME, username);
		input(AllWebElement.LOGIN_INPUT_PASSWORD, password);
		click(AllWebElement.LOGIN_BUTTON_LOGIN);
	}
	
	/**
	 * 检查用户登录
	 * @param name
	 */
	public void  checkLoginResult(String name){
		sleep();
		Assert.assertTrue(getPageSource().contains(name));
	}
	
	/**
	 * 改变登录用户
	 * @param username
	 * @param password
	 */
	public void changeLoginUser(String username,String password){
		click(AllWebElement.LOGOUT_BUTTON_LOGOUT);
		sleep();
		inputLoginElement(username, password);
	}
	
	
}
