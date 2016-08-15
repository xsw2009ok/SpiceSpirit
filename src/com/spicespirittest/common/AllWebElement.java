package com.spicespirittest.common;

import org.openqa.selenium.By;

public class AllWebElement {

	/** 用户名 */
	public static final By LOGIN_INPUT_USERNAME = By.id("nickname");
	/** 登录客服管理系统 */
	public static final By LOGIN_CUSTOMER = By.xpath("//div/ul/li[2]");
	/** 密码框 */
	public static final By LOGIN_INPUT_PASSWORD = By.id("password");
	/** 登录按钮 */
	public static final By LOGIN_BUTTON_LOGIN = By.id("login");

	/** 退出按钮 */
	public static final By LOGOUT_BUTTON_LOGOUT = By.xpath("//div/a[contains(text(),'退出')]");
	
	/** 获取所有弹出的Tips提示，用来判断是否成功 */
	public static By getTipsText = By.id("tips");

	public static By GET_MESSAGE_TEXT = By.xpath("//div/p[@id='message']");
	
	/** 客服管理系统 */
	public static By MAINPAGE_CUSTOMER = By.xpath("//div/ul/li/a[i[@class='i11']]");	
	/** 订单管理系统 */
	public static By MAINPAGE_ORDER = By.xpath("//div[@class='menu']/ul/li/a[i[@class='i55']]");
	/** 物流管理系统 */
	public static By MAINPAGE_LOGISTICS = By.xpath("//div/ul/li/a[i[@class='i22']]");
	/** 供应链管理系统 */
	public static By MAINPAGE_CENTERSTOCK = By.xpath("//div/ul/li/a[i[@class='i44']]");
	
	/** 客服管理系统-综合管理 */
	public static By MAINPAGE_CUSTOMER_MEMBER = By.xpath("//li/ul/li/a[contains(text(),'综合管理')]");
	
	/** 订单管理系统-来源管理 */
	public static By MAINPAGE_ORDER_SOURCE = By.xpath("//li/ul/li/a[contains(text(),'来源管理')]");
	/** 订单管理系统-第三方订单 */
	public static By MAINPAGE_ORDER_THRID = By.xpath("//li/ul/li/a[contains(text(),'第三方订单')]");
	/** 订单管理系统-订单查询 */
	public static By MAINPAGE_ORDER_SEARCH = By.xpath("//li/ul/li/a[contains(text(),'订单查询')]");

	/** 物流管理系统-订单派送*/
	public static By MAINPAGE_LOGISTICS_ORDER = By.xpath("//li/ul/li[1]/a[contains(text(),'订单派送')]");
	/** 物流管理系统-商品申购*/
	public static By MAINPAGE_LOGISTICS_GOODSAPPLICATION = By.xpath("//li/ul/li[2]/a[contains(text(),'商品申购')]");
	/** 物流管理系统-商品调拨*/
	public static By MAINPAGE_LOGISTICS_DB = By.xpath("//li/ul/li[3]/a[contains(text(),'商品调拨')]");
	/** 物流管理系统-库存盘点*/
	public static By MAINPAGE_LOGISTICS_COLLTAING = By.xpath("//li/ul/li[4]/a[contains(text(),'库存盘点')]");
	/** 物流管理系统-站点账目*/
	public static By MAINPAGE_LOGISTICS_RECONCILIATION = By.xpath("//li/ul/li[5]/a[contains(text(),'站点账目')]");
	/** 物流管理系统-生成数据 */
	public static By MAINPAGE_LOGISTICS_DATA = By.xpath("//li/ul/li[6]/a[contains(text(),'生成数据')]");
	
	/** 供应链管理系统-采购管理*/
	public static By MAINPAGE_CENTERSTOCK_GPURCHARSE = By.xpath("//ul/li/a[@class='li-aa3' and contains(text(),'采购管理')]");
	/** 供应链管理系统-申购管理*/
	public static By MAINPAGE_CENTERSTOCK_GAPPLICATION = By.xpath("//li/a[@class='li-aa3' and contains(text(),'申购管理')]");
	/** 供应链管理系统-入库*/
	public static By MAINPAGE_CENTERSTOCK_INSTOCK = By.xpath("//li/a[@class='li-aa3' and contains(text(),'入库')]");
	/** 供应链管理系统-出库*/
	public static By MAINPAGE_CENTERSTOCK_OUSTOCK = By.xpath("//li/a[@class='li-aa3' and contains(text(),'出库')]");
	/** 供应链管理系统-盘点*/
	public static By MAINPAGE_CENTERSTOCK_CENTERCHECK = By.xpath("//li/a[@class='li-aa3 change-bg']");
	
	/** 客服管理系统-综合管理-综合信息 */
	public static By MAINPAGE_CUSTOMER_MEMBER_INFO = By.id("customer_member_info");
	/** 客服管理系统-综合管理-生成发票 */
	public static By MAINPAGE_CUSTOMER_MEMBER_INVOICE = By.id("customer_invoice_invoice");
	/** 客服管理系统-综合管理-发票导出 */
	public static By MAINPAGE_CUSTOMER_MEMBER_EXPORT = By.id("customer_invoice_export");
	
	/** 订单管理系统-来源管理-新增来源 */
	public static By MAINPAGE_ORDER_SOURCE_CREATE = By.id("order_source_create");
	/** 订单管理系统-来源管理-来源列表 */
	public static By MAINPAGE_ORDER_SOURCE_LIST = By.id("order_source_List");
	/** 订单管理系统-第三方订单-饿了么 */
	public static By MAINPAGE_ORDER_THRID_ELM = By.id("customer_elm_search");
	/** 订单管理系统-第三方订单-百度 */
	public static By MAINPAGE_ORDER_THRID_BAIDU = By.id("customer_baidu_search");
	/** 订单管理系统-订单列表-预订单 */
	public static By MAINPAGE_ORDER_SEARCH_RESERVE = By.id("customer_order_reserve");
	/** 订单管理系统-订单查询-超范围订单 */
	public static By MAINPAGE_ORDER_SEARCH_RANGE = By.id("customer_search_range");
	/** 订单管理系统-订单查询-全部订单 */
	public static By MAINPAGE_ORDER_SEARCH_ALL = By.id("customer_order_all");
	/** 订单管理系统-订单查询-缺货订单 */
	public static By MAINPAGE_ORDER_SEARCH_NOTSTOCK = By.id("customer_order_notstock");
	/** 订单管理系统-订单查询-订单退款 */
	public static By MAINPAGE_ORDER_SEARCH_REFUNDS = By.id("customer_search_refunds");

	/** 物流管理系统-订单派送-未完成订单 */
	public static By LOGISTICS_ORDER_LIST = By.id("logistics_station_order_list");
	/** 物流管理系统-订单派送-已完成订单 */
	public static By LOGISTICS_ORDER_LISTBYSTATION = By.id("logistics_order_listbystation");
	/** 物流管理系统-订单派送-赠送订单结单 */
	public static By LOGISTICS_ORDER_GIVE = By.id("logistics_station_order_give");
	/** 物流管理系统-订单派送-商品申购 */
	public static By LOGISTICS_GOODSAPPLICATION_LIST = By.id("logistics_application_list");
	/** 物流管理系统-商品调拨-调拨出库 */
	public static By LOGISTICS_DB_WSEND = By.id("logistics_Wsend_list");
	/** 物流管理系统-商品调拨-调拨入库 */
	public static By LOGISTICS_DB_WDELIVER = By.id("logistics_Wdeliver_list");
	/** 物流管理系统-库存盘点-库存盘点 */
	public static By LOGISTICS_COLLTAING_LIST = By.id("logistics_station_collating_list");
	/** 物流管理系统-库存盘点-盘点结果 */
	public static By LOGISTICS_COLLTAING_RESULT = By.id("logistice_collating_result");
	/** 物流管理系统-库存盘点-库存查看 */
	public static By LOGISTICS_COLLTAING_STOCKSHOW = By.id("logistics_stock_show");
	/** 物流管理系统-站点账目-按渠道 */
	public static By LOGISTICS_RECONCILIATION_CHANNEL = By.id("logistics_reconciliation_channel");
	/** 物流管理系统-生成数据-生成当天数据 */
	public static By LOGISTICS_DATA_TODAY = By.id("create_collaing_data");
	
	/** 供应链管理系统-采购管理-采购单列表*/
	public static By CENTERSTOCK_GPURCHARSE_LIST = By.id("goods_gpurchase_list");
	/** 供应链管理系统-采购管理-待确认采购单*/
	public static By CENTERSTOCK_GPURCHARSE_UNCONFIRMED =By.id("goods_gpurchase_unconfirmed");
	/** 供应链管理系统-采购管理-新增采购单 */
	public static By CENTERSTOCK_GPURCHARSE_CREATE =By.id("goods_gpurchase_create");
	/** 供应链管理系统-申购管理-待确认申购单*/
	public static By CENTERSTOCK_GAPPLICATION_LIST = By.id("goods_gapplication_list");
	/** 供应链管理系统-申购管理-已确认申购单*/
	public static By CENTERSTOCK_GAPPLICATION_AFFIRMLIST = By.id("goods_gapplication_affirmlist");
	/** 供应链管理系统-申购管理-已完成申购单*/
	public static By CENTERSTOCK_GAPPLICATION_FINISH = By.id("goods_gapplication_finish");
	/** 供应链管理系统-入库-待入库*/
	public static By CENTERSTOCK_INSTOCK_CONFIRMED = By.id("goods_gpurchase_confirmed");
	/** 供应链管理系统-入库-历史入库单*/
	public static By CENTERSTOCK_INSTOCK_CONFIRMEDLIST = By.id("goods_gpurchase_confirmedList");
	/** 供应链管理系统-出库-待出库*/
	public static By CENTERSTOCK_OUSTOCK_WAITOUT = By.id("goods_gapplication_waitOut");
	/** 供应链管理系统-出库-已出库*/
	public static By CENTERSTOCK_OUSTOCK_HISTORY = By.id("goods_gapplication_history");
	/** 供应链管理系统-出库-已完成*/
	public static By CENTERSTOCK_OUSTOCK_FINISH = By.id("goods_gapplication_finish");
	/** 供应链管理系统-出库-库存列表*/
	public static By CENTERSTOCK_OUSTOCK_STOCKLIST = By.id("goods_gcentrecheck_stocklist");
	/** 供应链管理系统-盘点-开始盘点*/
	public static By CENTERSTOCK_CENTERCHECK_CREATE = By.id("goods_gcentrecheck_create");
	/** 供应链管理系统-盘点-盘点历史*/
	public static By CENTERSTOCK_CENTERCHECK_LIST = By.id("goods_gcentrecheck_list");

	/** 客服下单输入会员手机号 */
	public static By ORDER_INFO_INPUT_PHONE = By.id("order_user_phone");
	/** 客服下单输入会员手机号点击搜索按钮 */
	public static By ORDER_INFO_BUTTON_SEARCH = By.id("order_search_user");
	/** 保存来电用户的信息按钮 */
	public static By ORDER_INFO_PHONE_SAVE = By.id("member_save");
	/** 来电类型-显示更多内容 */
	public static By ORDER_INFO_DESK_MORE = By.xpath("//div[@class='con-box']/div[4]/div/a");
	/** 来电类型-来电原因 */
	public static By ORDER_INFO_DESK_TYPE = By.xpath("//select[@id='desk_type']");
	/** 来电类型-来电原因2 */
	public static By ORDER_INFO_DESK_REASON = By.id("desk_reason");
	/** 来电类型-保存 */
	public static By ORDER_INFO_DESK_SAVE = By.id("desk_save");
	/** 来电类型-备注 */
	public static By ORDER_INFO_DESK_REMARK = By.id("order_desc_remark");
	/** 新建订单-更多 */
	public static By ORDER_INFO_CREATEORDER_MORE = By.xpath("//div/div[@id='order_auto_process']");
	/** 搜索商品 */
	public static By ORDER_INFO_SEARCH_GOODS = By.id("order_code_match");
	/** 选择商品 */
	public static By ORDER_INFO_SELECT_GOODS = By.xpath("//div[@id='order_match_lists']/ul/li[1]/span[1]");
	/** 订单区域 */
	public static By ORDER_INFO_AREA = By.id("order_area");
	/** 订单渠道 */
	public static By ORDER_INFO_SOURCE_CHANNEL = By.id("order_source");
	/** 预定单 */
	public static By ORDER_INFO_RESERVE_DATE = By.name("order_reserve_date");
	
	public static By ORDER_INFO_SET_TIME = By.id("order_delivery_date");
	/** 送餐时间  开始时间*/
	public static By ORDER_INFO_START_TIME = By.id("order_delivery_start_time");
	/** 送餐时间  结束时间*/
	public static By ORDER_INFO_END_TIME = By.id("order_delivery_stop_time");
	/** 送餐时间  开始时间选择当前时间*/
	public static By ORDER_INFO_START_TIME_DEFAULT = By.xpath("//div[@id='ui-datepicker-div']/div[3]/button[contains(text(),'当前')]");
	/** 送餐时间  开始时间选择当前时间确认*/
	public static By ORDER_INFO_START_TIME_DONE = By.xpath("//div[@id='ui-datepicker-div']/div[3]/button[contains(text(),'确认')]");
	/** 支付方式-网上支付 */
	public static By ORDER_INFO_PAY_INTERNET = By.xpath("//div/input[@name='pay_way' and @value = '2']");
	/** 支付方式-货到付款 */
	public static By ORDER_INFO_PAY_CASH = By.xpath("//div/input[@name='pay_way' and @value = '1']");
	/** 支付的种类 */
	public static By ORDER_INFO_PAY_CHANNEL = By.id("pay_channel");
	/** 订单备注 */
	public static By ORDER_INFO_ORDER_REMARK = By.id("order_remark");
	/** 开发票选项 */
	public static By ORDER_INFO_INVOICE = By.name("invoice");
	/** 发票-显示更多信息 */
	public static By ORDER_INFO_INVOICE_MORE = By.xpath("//div/div[@class='invoice-btn']/a");
	/** 选择发票类型个人or公司 */
	public static By ORDER_INFO_INVOICE_GEREN = By.id("9185");
	/** 生成订单 */
	public static By ORDER_INFO_SAVE_ORDER = By.id("save_order");
	/** 保存订单的结果 */
	public static By ORDER_INFO_CREATEORDER_RESULT = By.id("tips");
	
	/** 商品申购-新增申购*/
	public static By LOGISTICS_GOODSAPPLICATION_CREATE = By.id("JS-create");
	/** 商品申购-申购时间*/
	public static By LOGISTICS_GOODSAPPLICATION_CREATEDATA = By.id("JS-createDate");
	/** 商品申购-申购结果*/
	public static By LOGISTICS_GOODSAPPLICATION_RESULT = By.id("tips");
	/** 商品申购-保存*/
	public static By LOGISTICS_GOODSAPPLICATION_SAVE = By.id("JS-addApplication");
	
	/** 商品申购-选择入库选项 */
	public static By LOGISTICS_INGAPPLICAION_SELECTOR = By.id("JS-appstatus");
	/** 商品申购-点击添加到货数量按钮*/
	public static By LOGISTICS_INGAPPLICATION_PAGE = By.xpath("//tbody/tr[1]/td[9]/a");
	/** 商品申购-输入实际到货数量 */
	public static By LOGISTICS_INGAPPLICATION_COUNT = By.xpath("//tbody/tr[1]/td[8]/input");
	/** 商品申购-商品输入数量保存 */
	public static By LOGISTICS_INGAPPLICATION_SAVE = By.id("JS-fact");
	/** 商品申购-关闭messagebox的提示框 */
	public static By LOGISTICS_INGAPPLICATION_CONFIRM = By.id("confirmed_account");

	/** 商品申购-生成数据按钮 */
	public static By LOGISTICS_DATA_BUTTON = By.id("JS-createData");
	
	/** 供应链-新增采购单-搜索商品框 */
	public static By CENTERSTOCK_GPURCHARSE_CODE = By.id("code");
	/** 供应链-新增采购单-搜索商品框按钮 */
	public static By CENTERSTOCK_GPURCHARSE_SEARCHGOODS = By.id("search_goods");
	/** 供应链-新增采购单-选择搜索出的商品 */
	public static By CENTERSTOCK_GPURCHARSE_SELECTGOODS = By.xpath("//div/ul/li[1]/span[1]");
	/** 供应链-新增采购单-输入采购商品的数量 */
	public static By CENTERSTOCK_GPURCHARSE_NUMBER = By.xpath("");
	/** 供应链-新增采购单-创建采购单 */
	public static By CENTERSTOCK_GPURCHARSE_BUTTONCREATE = By.id("create_account");
	/** 供应链-新增采购单-派送时间控件 */
	public static By CENTERSTOCK_GPURCHARSE_DELIVERYTIME = By.id("deliveryTime");
	/** 供应链-新增采购单-当前时间控件*/
	public static By CENTERSTOCK_GPURCHARSE_DEFAULTTIME = By.xpath("//div/div/button[1]");
	/** 供应链-新增采购单-确定控件 */
	public static By CENTERSTOCK_GPURCHARSE_CONFIRM = By.xpath("//div/div/button[2]");
	/** 供应链-新增采购单-关闭MessageBox提示框 */
	public static By CENTERSTOCK_GPURCHARSE_MESSAGEBOX = By.id("close");
	
	
	/** 供应链-待确认采购单-查看 */
	public static By CENTERSTOCK_GPURCHARSE_DETAIL = By.xpath("//tbody/tr[1]/td[6]/a[@class='table-a view']");
	/** 供应链-待确认采购单-确认采购单 */
	public static By CENTERSTOCK_GPURCHARSE_AFFIRM = By.id("affirm");
	
	
	/** 供应链-入库-进入入库页面*/
	public static By CENTERSTOCK_INSTOCK_INSTOCK = By.xpath("//tbody/tr[1]/td/a");
	/** 供应链-入库-写入批次号 */
	public static By CENTERSTOCK_INSTOCK_BATCH = By.xpath("//tbody/tr[1]/td[4]/input");
	/** 供应链-入库-当前时间 */
	public static By CENTERSTOCK_INSTOCK_DEFAULTTIME = By.xpath("//div/button[1]");
	/** 供应链-入库-确定当前时间 */
	public static By CENTERSTOCK_INSTOCK_CONFIRM = By.xpath("//div/button[2]");
	/** 供应链-入库-确定入库按钮*/
	public static By CENTERSTOCK_INSTOCK_BUTTONCONFIRM = By.id("confirmed");
	/** 供应链-入库-关闭MessageBox提示框 */
	public static By CENTERSTOCK_INSTOCK_CLOSEMESSAGE = By.id("confirmed_account");
	
	/** 供应链-出库-进入出库页面 */
	public static By CENTERSTOCK_OUSTOCK_BUTTONOUSTOCK = By.xpath("//table/tbody/tr[1]/td/a");
	/** 供应链-出库-写入批次号 */
	public static By CENTERSTOCK_OUSTOCK_INPUTBATCHNO = By.xpath("//tbody/tr[1]/td[6]/input");
	/** 供应链-出库-出库按钮 */
	public static By CENTERSTOCK_OUSTOCK_BUTTONOUT = By.id("out");
	/** 供应链-出库-当前时间 */
	public static By CENTERSTOCK_OUSTOCK_DEFAULTTIME = By.xpath("//div/button[1]");
	/** 供应链-出库-确定当前时间 */
	public static By CENTERSTOCK_OUSTOCK_BUTTONCONFIRM = By.xpath("//div/button[2]");
	/** 供应链-出库-关闭弹窗 */
	public static By CENTERSTOCK_OUSTOCK_IMGCONFIRM = By.id("img-close");
	
	/** 供应链-商品申购-查看 */
	public static By CENTERSTOCK_GAPPLICATION_CHECK = By.xpath("//tbody[@id='applicationlist']/tr[1]/td[7]");
	/** 供应链-商品申购-确认*/
	public static By CENTERSTOCK_GAPPLICATION_SUBMIT = By.id("affirm");
	/** 供应链-商品申购-messagebox */
	public static By CENTERSTOCK_GAPPLICATION_CLOSE = By.id("close-back");
	
	/** 供应链-商品申购-全部生成采购单 */
	public static By CENTERSTOCK_GAPPLICATION_COLLECT = By.id("collect");
	/** 供应链-商品申购-messagebox */
	public static By CENTERSTOCK_GAPPLICATION_COLLECTCLOSE = By.id("close"); 
	
}

