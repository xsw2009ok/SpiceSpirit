package com.spicespirittest.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.page.Order;

public class OrderTest {

	public static String sql = "select amount from station_stock " + "where station_id = 51 " + "and goods_code = 'MX'";

	@Test
	public void orderTest() {
		Order order = new Order();
		System.out.println("下单前库存数量为：->" + JDBCUtil.getDataBase(sql));
		order.checkOrderElement();
		order.createOrder();
		System.out.println("下单后库存数量为： ->" + JDBCUtil.getDataBase(sql));
		Assert.assertEquals("成功", order.result);

	}

}
