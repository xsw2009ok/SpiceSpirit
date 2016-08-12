package com.spicespirittest.page;

import java.util.logging.Logger;

import javax.security.auth.login.CredentialException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;


public class Order extends SpiceSpiritBase {

	Logger log = Logger.getLogger(Order.class.getName());

	Login login = new Login();

	/**
	 * 加载首页的标签
	 */
	public void checkOrderElement() {
		login.changeLoginUser(config.kefu_username, config.kefu_password);
		waitForElementToLoad(config.waittime, AllWebElement.MAINPAGE_CUSTOMER);
		waitForElementToLoad(config.waittime, AllWebElement.MAINPAGE_ORDER);
	}

	/**
	 * 创建普通订单
	 */
	public void createOrderInit() {
		click(AllWebElement.MAINPAGE_CUSTOMER);
		click(AllWebElement.MAINPAGE_CUSTOMER_MEMBER);
		click(AllWebElement.MAINPAGE_CUSTOMER_MEMBER_INFO);
	}

	/**
	 * 创建普通订单
	 */

	public void createOrder() {
		createOrderInit();
		sleep();
		input(AllWebElement.ORDER_INFO_INPUT_PHONE, Config.order_phone);
		click(AllWebElement.ORDER_INFO_BUTTON_SEARCH);
		click(AllWebElement.ORDER_INFO_PHONE_SAVE);
		sleep();
		click(AllWebElement.ORDER_INFO_DESK_MORE);
		sleep();
		selectByValue(AllWebElement.ORDER_INFO_DESK_TYPE, "2");
		sleep();
		selectByValue(AllWebElement.ORDER_INFO_DESK_REASON, "3");
		click(AllWebElement.ORDER_INFO_DESK_SAVE);
		click(AllWebElement.ORDER_INFO_CREATEORDER_MORE);
		click(AllWebElement.ORDER_INFO_SEARCH_GOODS);
		sleep();
		input(AllWebElement.ORDER_INFO_SEARCH_GOODS, "MX");
		click(AllWebElement.ORDER_INFO_SELECT_GOODS);
		sleep();
		selectByText(AllWebElement.ORDER_INFO_SOURCE_CHANNEL, "电话");
		selectByText(AllWebElement.ORDER_INFO_AREA, "北京");
		click(AllWebElement.ORDER_INFO_START_TIME);
		click(AllWebElement.ORDER_INFO_START_TIME_DEFAULT);
		click(AllWebElement.ORDER_INFO_START_TIME_DONE);
		click(AllWebElement.ORDER_INFO_PAY_CASH);
		sleep();
		selectByValue(AllWebElement.ORDER_INFO_PAY_CHANNEL, "5");
		sleep();
		click(AllWebElement.ORDER_INFO_INVOICE);
		sleep();
		click(AllWebElement.ORDER_INFO_INVOICE_MORE);
		sleep();
		click(AllWebElement.ORDER_INFO_INVOICE_GEREN);
		click(AllWebElement.ORDER_INFO_SAVE_ORDER);
		sleep();
		// 重置以前的结果
		result = "";
		for (int i = 0; i < 3; i++) {
			result = getText(AllWebElement.ORDER_INFO_CREATEORDER_RESULT);
			if (result.equals("")) {
				sleep();
			} else {
				break;
			}
		}
	}

	/**
	 * 创建超区订单
	 */
	public void createRangeOrder() {

	}

	/**
	 * 创建缺货订单
	 */
	public void createNotStockOrder() {

	}

}
