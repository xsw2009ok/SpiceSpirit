package com.spicespirittest.testcase;

import org.apache.log4j.lf5.viewer.categoryexplorer.CategoryExplorerLogRecordFilter;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.page.CenterLogisticsGAppList;

public class CenterLogisticsGAppListTest {
	
	@Test
	public void CenterLogisticsGAppListTest(){
		CenterLogisticsGAppList clgal = new CenterLogisticsGAppList();
		clgal.centerLogisticsGAppList();	
//		Assert.assertEquals("确定", clgal.result);
	}
}
