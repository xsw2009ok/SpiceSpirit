package com.spicespirittest.page;

import java.util.logging.Logger;

import org.openqa.selenium.By;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;

public class CenterStock extends SpiceSpiritBase {

	Logger log = Logger.getLogger(CenterStock.class.getName());

	Login login = new Login();

	/**
	 * 初始化页面
	 */
	public void centerStockInit() {
		JDBCUtil.getDataBase("select goods_code from station_goods where standard_num = 1 and belong in(2,3)");
		waitForElementToLoad(Config.waittime, AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK);
	}

	/**
	 * 采购流程
	 */
	public void centerStockGApplication() {
		login.changeLoginUser(config.gongyinglian_username, config.gongyinglian_password);
		result = "";
		centerStockInit();
		click(AllWebElement.MAINPAGE_CENTERSTOCK_GPURCHARSE);
		click(AllWebElement.CENTERSTOCK_GPURCHARSE_CREATE);
		sleep();
		for (int i = 0; i < goodsCode.size(); i++) {
			try {
				click(AllWebElement.CENTERSTOCK_GPURCHARSE_CODE);
				input(AllWebElement.CENTERSTOCK_GPURCHARSE_CODE, goodsCode.get(i));
				click(AllWebElement.CENTERSTOCK_GPURCHARSE_SEARCHGOODS);
				sleep();
				click(AllWebElement.CENTERSTOCK_GPURCHARSE_SELECTGOODS);
				sleep();
				input(By.xpath("//tbody/tr[" + (i + 1) + "]/td[5]/input"), config.gapplicationnumber);
			} catch (Exception e) {

			}
		}
		click(AllWebElement.CENTERSTOCK_GPURCHARSE_DELIVERYTIME);
		click(AllWebElement.CENTERSTOCK_GPURCHARSE_DEFAULTTIME);
		click(AllWebElement.CENTERSTOCK_GPURCHARSE_CONFIRM);
		click(AllWebElement.CENTERSTOCK_GPURCHARSE_BUTTONCREATE);
		sleep();
		result = getText(By.xpath("//div[@id='show-message']/div[@class='tsupply-cc1 tsupply-cc2']/p"));
		click(AllWebElement.CENTERSTOCK_GPURCHARSE_MESSAGEBOX);
	}

}
