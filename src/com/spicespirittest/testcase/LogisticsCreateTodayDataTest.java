package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.LogisticsCreateTodayData;

public class LogisticsCreateTodayDataTest {
	
	@Test
	public void logisticsCreateTodayDataTest(){
		LogisticsCreateTodayData lctdt = new LogisticsCreateTodayData();
		lctdt.createTodayData();
		Assert.assertEquals("今日数据生成完毕", lctdt.result);
System.out.println(lctdt.result);
	}
}
