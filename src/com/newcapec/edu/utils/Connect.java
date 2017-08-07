package com.newcapec.edu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	static String url = null;
static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		url = "jdbc:mysql://localhost:3306/page?useSSL=false";
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
/**
 * 返回数据库连接对象
 * @return
 */
public static Connection getConn(){
	 Connection conn = null;
	try {
	 conn = DriverManager.getConnection(url, "root", "1234567890");
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	return conn;
}

}
