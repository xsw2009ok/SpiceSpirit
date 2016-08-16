package com.spicespirittest.page;

import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;


public class CenterInStock extends SpiceSpiritBase{

	Login login = new Login();
	/**
	 * 初始化页面
	 */
	public void centerStockInit() {
		login.changeLoginUser(Config.gongyinglian_username, Config.gongyinglian_password);
		waitForElementToLoad(Config.waittime, AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK);
	}

	/**
	 * 入库操作
	 */
	public void centerInStock() {
		result = "";
		centerStockInit();
		click(AllWebElement.MAINPAGE_CENTERSTOCK_INSTOCK);
		for (int i = 1; i < 100; i++) {
			try {
				sleep();
				click(AllWebElement.CENTERSTOCK_INSTOCK_CONFIRMED);
				click(AllWebElement.CENTERSTOCK_INSTOCK_INSTOCK);
				for (int k = 1; k < 100; k++) {
					try {
						sleep();
						click(By.xpath("//tbody/tr[" + k + "]/td[4]/input"));
						click(AllWebElement.CENTERSTOCK_INSTOCK_DEFAULTTIME);
						click(AllWebElement.CENTERSTOCK_INSTOCK_CONFIRM);
						click(AllWebElement.CENTERSTOCK_INSTOCK_BUTTONCONFIRM);
					} catch (Exception e) {
						log.info("没有需要填写的批次了.");					
						break;
					}
				}
				sleep();
				result = getText(AllWebElement.GET_MESSAGE_TEXT);
				click(AllWebElement.CENTERSTOCK_INSTOCK_CLOSEMESSAGE);
				sleep(1);
				
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}

	}
}
