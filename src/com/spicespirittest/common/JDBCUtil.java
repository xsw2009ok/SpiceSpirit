package com.spicespirittest.common;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class JDBCUtil {

	// 创建静态全局变量
	public static Connection conn;
	public static Statement statement;
	public static PreparedStatement pst = null;
	public static ResultSet ret = null;
	public static String sqlResult = null;

	public static String getDataBase(String sql) {
		String jdbc_url = Config.jdbc_url;
		String jdbc_driver = Config.jdbc_driver;
		String jdbc_name = Config.jdbc_username;
		String jdbc_password = Config.jdbc_password;
		String jdbc_db = Config.jdbc_db;

		try {
			Class.forName(jdbc_driver);
			conn = (Connection) DriverManager.getConnection(jdbc_url + jdbc_db, jdbc_name, jdbc_password);
			pst = (PreparedStatement) conn.prepareStatement(sql);
			ret = pst.executeQuery();
			while (ret.next()) {
				sqlResult = ret.getString(1);
				SpiceSpiritBase.goodsCode.add(sqlResult.toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return sqlResult;

	}

}
