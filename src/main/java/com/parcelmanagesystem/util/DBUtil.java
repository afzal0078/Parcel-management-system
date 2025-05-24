package com.parcelmanagesystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	
	/*
	 * @author 2733488
	 * Method to connect to databse
	 * */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			connection = DriverManager.getConnection("jdbc:derby:C:\\Users\\2733488\\Desktop\\ParcelManagementSystem\\PCMdb;create=true;");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}		
		return connection;
	}
	/*
	 * @author 2733488
	 * Method to close resultset, preparedstatement and connection of database
	 * */
	
	public static void closeAllConnections(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			if(connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection connection = DBUtil.getConnection();
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
