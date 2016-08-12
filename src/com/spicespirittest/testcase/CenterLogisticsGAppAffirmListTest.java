package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.CenterLogisticsGAppAffirmList;

public class CenterLogisticsGAppAffirmListTest {

	@Test
	public void centerLogisticsGAppAffirmListTest(){
		CenterLogisticsGAppAffirmList clfaal = new CenterLogisticsGAppAffirmList();
		clfaal.centerLogisticsGAppAffirmList();
		Assert.assertEquals("确定", clfaal.result);
	}
	
}
