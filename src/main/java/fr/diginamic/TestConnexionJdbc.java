package fr.diginamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class TestConnexionJdbc {

	
	private static final String URL;
	private static final String USER;
	private static final String PWD;
	private static final String PORT;
	
	static {
		ResourceBundle res = ResourceBundle.getBundle("db");
		URL = res.getString("url");
		USER = res.getString("user");
		PWD = res.getString("pwd");
		PORT = res.getString("port");
	}
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Properties props = new Properties();
		props.setProperty("user", USER);
		props.setProperty("password", PWD);
		props.setProperty("port", PORT);
		
		Connection conn = DriverManager.getConnection(URL, props);

		System.out.println(conn);

	}

}
