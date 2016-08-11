package com.spicespirittest.page;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.SpiceSpiritBase;

public class LogisticsGoodsApplication extends SpiceSpiritBase {

	Logger log = Logger.getLogger(LogisticsGoodsApplication.class.getName());
	public static String logisticsApplicationResult; 
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
	 * 循环写入申购商品的数量
	 */
	public void setGoodsApplicationNumber() {

		for (int i = 1; i < 100; i++) {
			try {
				By testElement = By.xpath("//tbody/tr[" + i + "]/td[4]/input");
				click(testElement);
				sleep();
				input(testElement, config.gapplicationnumber);
			} catch (Exception e) {
				log.info("添加到" + i + "次时失败");
				break;
			}
		}

	}
	
	/**
	 * 申购商品的主流程
	 */
	public void logisticsGoodsApplication() {
		login.changeLoginUser(config.wuliu_username, config.wuliu_password);
		logisticsInit();
		click(AllWebElement.LOGISTICS_GOODSAPPLICATION_CREATE);
		clear(AllWebElement.LOGISTICS_GOODSAPPLICATION_CREATEDATA);
		input(AllWebElement.LOGISTICS_GOODSAPPLICATION_CREATEDATA, SpiceSpiritBase.getDate());
		sleep(2);
		setGoodsApplicationNumber();
		click(AllWebElement.LOGISTICS_GOODSAPPLICATION_SAVE);
		result = "";
		for (int i = 0; i < 3; i++) {
			result = getText(AllWebElement.LOGISTICS_GOODSAPPLICATION_RESULT);
			if (result.equals("")) {
				sleep();
			} else {
				break;
			}
		}
	}
	


}
