package com.spicespirittest.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.SpiceSpiritBase;

public class LogisticsGoodsInStock extends SpiceSpiritBase {

	Logger log = Logger.getLogger(LogisticsGoodsInStock.class.getName());

	public static String result = "";

	/**
	 * 初始化页面
	 */
	public void logisticsInit() {
		click(AllWebElement.MAINPAGE_LOGISTICS);
		click(AllWebElement.MAINPAGE_LOGISTICS_GOODSAPPLICATION);
		click(AllWebElement.LOGISTICS_GOODSAPPLICATION_LIST);
		sleep();
	}

	/**
	 * 申购商品入库
	 */
	public void goodsInStock() {
		Login login = new Login();
		login.changeLoginUser(Config.wuliu_username, Config.wuliu_password);
		sleep();
		logisticsInit();
		for (int i = 1; i < 100; i++) {
			try {
				sleep();
				selectByValue(AllWebElement.LOGISTICS_INGAPPLICAION_SELECTOR, "5");
				click(AllWebElement.LOGISTICS_INGAPPLICATION_PAGE);
				sleep();
				input(AllWebElement.LOGISTICS_INGAPPLICATION_COUNT, getText(By.xpath("//tbody/tr[1]/td[7]/input")));
				click(AllWebElement.LOGISTICS_INGAPPLICATION_SAVE);
				sleep();
				
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		result = getText(AllWebElement.getTipsText);
	}

}
