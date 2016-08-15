package com.spicespirittest.common;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SpiceSpiritBase {

	public static Logger log = Logger.getLogger(SpiceSpiritBase.class.getName());

	public static WebDriver driver;

	public static Config config = LoadTestDataConfig.loadConfig();

	public static List<String> goodsCode = new ArrayList<String>();
	
	public String result ="";
	/**
	 * 启动浏览器
	 */
	
	public void openBrowser() {
		LogConfig.initLog(this.getClass().getSimpleName());
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		try {
			log.info("open browser start...");
			driver = new ChromeDriver();
			driver.get(config.testurl);
			driver.manage().window().maximize();
			log.info("max browser...");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			log.info("set driver wait time...");
		} catch (Exception e) {
			log.warning("open browser fail...");
		}

	}

	/**
	 * 退出浏览器
	 */

	public void closeBrowser() {
		driver.quit();
		log.info("driver exit...");
	}

	/**
	 * 休眠等待1秒
	 */
	public static void sleep() {
		try {
			log.info("线程开始休眠");
			Thread.sleep(800);
			log.info("线程结束休眠");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 设置休眠秒数
	 * 
	 * @param m_time
	 */
	public static void sleep(int m_time) {
		try {
			log.info("线程开始休眠");
			Thread.sleep(m_time * 1000);
			log.info("线程结束休眠");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 查找控件
	 * 
	 * @param by
	 */
	public static WebElement findElement(By by) {
		log.info("开始查找元素[" + by + "]");
		return driver.findElement(by);
	}

	/**
	 * 点击控件
	 * 
	 * @param element
	 */
	public static void click(By by) {
		log.info("点击元素[" + by + "]");
		findElement(by).click();
	}

	/**
	 * 向控件中写入字符串
	 * 
	 * @param element
	 * @param str
	 */
	public static void input(By by, String str) {
		log.info("向元素[" + by + "]中写入" + str);
		findElement(by).sendKeys(str);
	}

	/**
	 * 清空控件中的内容
	 * 
	 * @param element
	 */
	public static void clear(By by) {
		log.info("清空元素[" + by + "]中的内容");
		findElement(by).clear();
	}

	/**
	 * 返回多个控件
	 * 
	 * @param by
	 * @return
	 */
	public static List<WebElement> findElements(By by) {
		return driver.findElements(by);
	}

	/**
	 * 获得页面的标题
	 */
	public static String getTitle() {
		return driver.getTitle();
	}

	/**
	 * 获得元素的文本
	 */
	public static String getText(By elementLocator) {
		log.info("获取元素[" + elementLocator + "]的内容");
		return driver.findElement(elementLocator).getText().trim();
	}

	/**
	 * 获得元素 属性的文本
	 */
	public static String getAttributeText(By elementLocator, String attribute) {
		return driver.findElement(elementLocator).getAttribute(attribute).trim();
	}

	/**
	 * 模拟键盘操作的,比如Ctrl+A,Ctrl+C等 参数详解：<br>
	 * 1、WebElement element - 要被操作的元素 <br>
	 * 2、Keys key- 键盘上的功能键 比如ctrl ,alt等 <br>
	 * 3、String keyword - 键盘上的字母
	 */
	public static void pressKeysOnKeyboard(WebElement element, Keys key, String keyword) {

		element.sendKeys(Keys.chord(key, keyword));
	}

	/**
	 * 在给定的时间内去查找元素，如果没找到则超时，抛出异常
	 */
	public static void waitForElementToLoad(int timeOut, By By) {
		log.info("开始查找元素[" + By + "]");
		try {
			(new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

				public Boolean apply(WebDriver driver) {
					WebElement element = driver.findElement(By);
					return element.isDisplayed();
				}
			});
		} catch (TimeoutException e) {
			log.warning("超时!! " + timeOut + " 秒之后还没找到元素 [" + By + "]");
			Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + By + "]");

		}
		log.info("找到了元素 [" + By + "]");
	}

	/**
	 * 切换frame - 根据String类型（frame名字）
	 */
	public static void inFrame(String frameId) {
		driver.switchTo().frame(frameId);
	}

	/**
	 * 切换frame - 根据frame在当前页面中的顺序来定位
	 */
	public static void inFrame(int frameNum) {
		driver.switchTo().frame(frameNum);
	}

	/**
	 * 切换frame - 根据页面元素定位
	 */
	public static void switchFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			log.info("进入frame失败 ");
		}
		log.info("进入frame成功 ");
	}

	/**
	 * 选择下拉选项 -根据value
	 */
	public static void selectByValue(By by, String value) {
		Select s = new Select(driver.findElement(by));
		s.selectByValue(value);
	}

	/**
	 * 选择下拉选项 -根据index角标
	 */
	public static void selectByIndex(By by, int index) {
		Select s = new Select(driver.findElement(by));
		s.selectByIndex(index);
	}

	/**
	 * 选择下拉选项 -根据文本内容
	 */
	public static void selectByText(By by, String text) {
		Select s = new Select(driver.findElement(by));
		s.selectByVisibleText(text);
	}

	/**
	 * 获得当前select选择的值
	 */
	public static List<WebElement> getCurrentSelectValue(By by) {
		List<WebElement> options = null;
		Select s = new Select(driver.findElement(by));
		options = s.getAllSelectedOptions();
		return options;
	}

	public static String getPageSource() {
		return driver.getPageSource();
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getDate(){
		long l_time = System.currentTimeMillis();
		//设置大于1天的时间
		l_time = l_time + 86900 * 1000;
		Date date = new Date(l_time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
}
