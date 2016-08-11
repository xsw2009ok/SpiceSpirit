package com.spicespirittest.page;

import org.testng.Assert;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.SpiceSpiritBase;

public class LogisticsCreateTodayData extends SpiceSpiritBase {
	
	Login login = new Login();
	/**
	 * 生成当天的盘点数据
	 */
	public void createTodayData(){
		//进入数据生成完毕
		login.changeLoginUser(config.wuliu_username, config.wuliu_password);
		sleep();
		click(AllWebElement.MAINPAGE_LOGISTICS);
		click(AllWebElement.MAINPAGE_LOGISTICS_DATA);
		click(AllWebElement.LOGISTICS_DATA_TODAY);
		sleep();
		click(AllWebElement.LOGISTICS_DATA_BUTTON);
		sleep();
		result = getText(AllWebElement.getTipsText);
		
	}
}
