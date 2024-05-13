package semitest.test.semitest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Test {
	

	Connection conn = null;
	PreparedStatement pstmt = null;
	public void checkConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path = Test.class.getResource("./").toString();
		try {
			FileReader fr = new FileReader(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public int sameNumber() {
		return 0; 
	}

	
	
	
	
}
