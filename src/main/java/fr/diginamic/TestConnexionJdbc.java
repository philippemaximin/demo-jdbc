package fr.diginamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestConnexionJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mariadb://localhost/compta2";
		Properties props = new Properties();
		props.setProperty("user","ezechiel");
		props.setProperty("password","fukijada");
		
		Connection conn = DriverManager.getConnection(url, props);

		System.out.println(conn);
	}

}
