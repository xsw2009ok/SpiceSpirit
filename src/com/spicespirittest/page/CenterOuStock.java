package com.spicespirittest.page;

import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;

public class CenterOuStock extends SpiceSpiritBase {

	public void centerOuStock() {
		/**
		 * 出库操作
		 */
		result = "";
		centerStockInit();
		click(AllWebElement.MAINPAGE_CENTERSTOCK_OUSTOCK);
		for (int k = 1; k < 1000; k++) {
			try {
				click(AllWebElement.CENTERSTOCK_OUSTOCK_WAITOUT);
				sleep();
				click(By.xpath("//table/tbody/tr[1]/td/a"));
				sleep();

				for (int i = 1; i < 200; i++) {
					try {
						sleep();
						click(By.xpath("//tbody/tr[" + i + "]/td[6]/input"));
						sleep();
						click(AllWebElement.CENTERSTOCK_OUSTOCK_DEFAULTTIME);
						sleep();
						click(AllWebElement.CENTERSTOCK_OUSTOCK_BUTTONCONFIRM);
					} catch (Exception e) {
						log.info("没有要处理的出库批次了");
						click(AllWebElement.CENTERSTOCK_OUSTOCK_BUTTONOUT);
						result = getText(By.id("close-back"));
						click(AllWebElement.CENTERSTOCK_OUSTOCK_IMGCONFIRM);
					}
				}
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
	}

}
