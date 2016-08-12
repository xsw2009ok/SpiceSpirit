package com.spicespirittest.page;

import com.spicespirittest.common.AllWebElement;
import com.spicespirittest.common.Config;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.common.SpiceSpiritBase;

public class CenterLogisticsGAppList  extends SpiceSpiritBase{
	
	
	
	public void centerLogisticsGAppList(){
		Login login = new Login();
		result = "";
		login.changeLoginUser(Config.gongyinglian_username, Config.gongyinglian_password);
		centerStockInit();
		click(AllWebElement.CENTERSTOCK_GAPPLICATION_LIST);
		for(int i =0 ; i<1000;i++){
			try{
				click(AllWebElement.CENTERSTOCK_GAPPLICATION_CHECK);
				sleep();
				click(AllWebElement.CENTERSTOCK_GAPPLICATION_SUBMIT);
				result = getText(AllWebElement.CENTERSTOCK_GAPPLICATION_CLOSE);
				click(AllWebElement.CENTERSTOCK_GAPPLICATION_CLOSE);
			}catch(Exception e){
				break;
			}
		}
		
	}
	
	/**
	 * 初始化页面
	 */
	public void centerStockInit() {
		waitForElementToLoad(Config.waittime, AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK);
		click(AllWebElement.MAINPAGE_CENTERSTOCK_GAPPLICATION);
	}
	
}
