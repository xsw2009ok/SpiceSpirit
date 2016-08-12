package com.spicespirittest.page;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;

public class CenterLogisticsGAppAffirmList extends SpiceSpiritBase{

	/**
	 * 初始化页面
	 */
	public void centerStockInit() {
		JDBCUtil.getDataBase("select goods_code from centre_stock");
		waitForElementToLoad(Config.waittime, AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK_GAPPLICATION);
	}
	
	
	public void centerLogisticsGAppAffirmList(){
		Login login = new Login();
		login.changeLoginUser(config.gongyinglian_username, config.gongyinglian_password);
		centerStockInit();
		result = "";
		click(AllWebElement.CENTERSTOCK_GAPPLICATION_COLLECT);
		sleep();
		result = getText(AllWebElement.CENTERSTOCK_GAPPLICATION_COLLECTCLOSE);
		click(AllWebElement.CENTERSTOCK_GAPPLICATION_COLLECTCLOSE);
	}
}
