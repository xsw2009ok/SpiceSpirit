package com.spicespirittest.testcase;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.LogisticsGoodsApplication;

public class LogisticsGoodsApplicationTest {

	Logger log = Logger.getLogger(LogisticsGoodsApplicationTest.class.getName());

	@Test
	public void logisticsGoodsApplicationTest() {
		LogisticsGoodsApplication logis = new LogisticsGoodsApplication();
		logis.logisticsGoodsApplication();
	}
}
