package com.spicespirittest.testcase;


import org.testng.annotations.Test;

import com.spicespirittest.common.Config;
import com.spicespirittest.page.Login;

public class LoginTest {
	
	
	
	@Test
	public void loginTest(){
		Login login = new Login();
		login.openBrowser();
		login.checkLoginElement();
		if(Config.logintype.equals("kefu")){
			login.inputLoginElement(Config.kefu_username,Config.kefu_password);
			login.checkLoginResult(Config.kefu_result);
		}else if (Config.logintype.equals("wuliu")){
			login.inputLoginElement(Config.wuliu_username,Config.wuliu_password);
			login.checkLoginResult(Config.wuliu_result);
		}else if (Config.logintype.equals("zhongxinkufang")){
			login.inputLoginElement(Config.gongyinglian_username,Config.gongyinglian_password);
			login.checkLoginResult(Config.gongyinglian_result);
		}
	}
	
}
