package com.spicespirittest.testcase;

import org.testng.Assert;

import com.spicespirittest.page.LogisticsGoodsInStock;

public class LogisticsGoodsInStockTest {
	
	
	public void logisticsGoodsInSotck(){
		
		LogisticsGoodsInStock lgist = new LogisticsGoodsInStock();
		
		lgist.goodsInStock();
		
		Assert.assertEquals("操作入库成功", lgist.result);
	}
  
}
