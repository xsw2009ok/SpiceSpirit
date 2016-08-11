package com.spicespirittest.common;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.XMLReader;

public class LoadTestDataConfig {
	public static String fileName ="data/testdata.xml";

	public static Config config;
	/**
	 * 读取xml文件中的信息
	 * @return Config
	 */
	public static Config  loadConfig(){
		if(null==config)
			config = getConfig();
		return config;
	}
	
	private static Config  getConfig(){
		
		
		Config config= new Config();
		try {
			File f = new File(fileName);
//			File f=new File(XMLReader.class.getResource(fileName).getPath());
//			System.out.println("fileName:"+fileName);
//			System.out.println("AbsolutePath:"+f.getAbsolutePath());
			if(!f.exists()){
				System.out.println("读取xml配置文件 Error: Config file doesn't exist!");
				System.exit(1);
			}
			SAXReader  reader = new SAXReader();
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			Element data;  
            Iterator<?> itr = root.elementIterator("value");  
            data = (Element) itr.next();  
            
            /**
             *此处注意，假如配置文件xml添加新的字段时，那么对应的Config类要添加相应的属性，且要补充下方的代码 
             *1、补充config.xml文件
             *2、补充下面打的代码
             *3、补充config类中的数据
             */
            config.testurl = data.elementText("testurl").trim();  
            config.kefu_username = data.elementText("kefu_username").trim();  
            config.kefu_password = data.elementText("kefu_password").trim();
            config.gongyinglian_username = data.elementText("gongyinglian_username").trim();
            config.gongyinglian_password = data.elementText("gongyinglian_password").trim();
            config.wuliu_username = data.elementText("wuliu_username").trim();
            config.wuliu_password = data.elementText("wuliu_password").trim();
            config.waittime = Integer.valueOf(data.elementText("waittime").trim());
            config.kefu_result = data.elementText("kefu_result").trim();
            config.gongyinglian_result = data.elementText("gongyinglian_result").trim();
            config.wuliu_result = data.elementText("wuliu_result").trim();
            config.jdbc_url = data.elementText("jdbc_url").trim();
            config.jdbc_driver = data.elementText("jdbc_driver").trim();
            config.jdbc_username = data.elementText("jdbc_username").trim();
            config.jdbc_password = data.elementText("jdbc_password").trim();
            config.jdbc_db = data.elementText("jdbc_db").trim();
            config.order_phone = data.elementText("order_phone").trim();
            config.ordertype = data.elementText("ordertype").trim();
            config.logintype = data.elementText("logintype").trim();
            config.gapplicationnumber = data.elementText("gapplicationnumber");
            
            
        } catch (Exception e) {  
            System.out.println("读取配置文件xml Error : " + e.toString());  
        }  
        return config;  
	}
	
	public static void main(String[] args) {
		getConfig();
	}
}
