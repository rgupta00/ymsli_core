package com.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static Connection connection = null;

	private ConnectionFactory() {
	}

	public static Connection getConnection() {
		InputStream is = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");

		Properties properties = new Properties();
		try {
			properties.load(is);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		String url = properties.getProperty("jdbc.url");
		String driverName = properties.getProperty("jdbc.driverName");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return connection;
	}

}
