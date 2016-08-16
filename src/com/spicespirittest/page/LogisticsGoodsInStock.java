package com.spicespirittest.page;

import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.SpiceSpiritBase;

public class LogisticsGoodsInStock extends SpiceSpiritBase {

	public static String result = "";

	Login login = new Login();

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
		String num = "";
		login.changeLoginUser(Config.wuliu_username, Config.wuliu_password);
		sleep();
		logisticsInit();
		for (int k = 1; k < 100; k++) {
			try {
				selectByValue(AllWebElement.LOGISTICS_INGAPPLICAION_SELECTOR, "5");
				for (int i = 1; i < 100; i++) {
					try {
						sleep();
						click(AllWebElement.LOGISTICS_INGAPPLICATION_PAGE);
						input(By.xpath("//tbody/tr[" + i + "]/td[8]/input"), config.gapplicationnumber);
					} catch (Exception e) {
						e.printStackTrace();
						break;
					}
				}
				click(AllWebElement.LOGISTICS_INGAPPLICATION_SAVE);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		result = getText(AllWebElement.getTipsText);
	}

}
