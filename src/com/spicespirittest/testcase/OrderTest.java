package com.spicespirittest.testcase;

import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spicespirittest.common.JDBCUtil;
import com.spicespirittest.page.Order;


public class OrderTest {
	public static Logger log = Logger.getLogger(OrderTest.class.getName());
	public static String sql = "select amount from station_stock " + "where station_id = 51 " + "and goods_code = 'MX'";

	@Test
	public void orderTest() {
		Order order = new Order();

		log.info("下单前的库存量为" + JDBCUtil.getDataBase(sql));
		order.checkOrderElement();
		order.createOrder();
		log.info("下单后的库存量为" + JDBCUtil.getDataBase(sql));
		Assert.assertEquals("成功", order.result);

	}

}
