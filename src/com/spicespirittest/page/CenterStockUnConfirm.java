package com.spicespirittest.page;

import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;

public class CenterStockUnConfirm extends SpiceSpiritBase {
	/**
	 * 待确定订单
	 */
	public void centerStockUnConfirm() {

		centerStockInit();
		result = "";
		for (int i = 0; i < 200; i++) {
			try {
				click(AllWebElement.CENTERSTOCK_GPURCHARSE_UNCONFIRMED);
				sleep();
				click(AllWebElement.CENTERSTOCK_GPURCHARSE_DETAIL);
				sleep();
				click(AllWebElement.CENTERSTOCK_GPURCHARSE_AFFIRM);
				sleep();
				result = getText(AllWebElement.getTipsText);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}

	}

	/**
	 * 初始化页面
	 */
	public void centerStockInit() {
		Login login = new Login();
		login.changeLoginUser(config.gongyinglian_username, config.gongyinglian_password);
		waitForElementToLoad(Config.waittime, AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK_GPURCHARSE);
	}
	
}
