package semitest.test.semitest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Test {
	private static Test test;
	
	private Test() { }
	
	public static Test getTest() {
		if(test == null) return test = new Test();
		else return test;
	}

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

	private String juwhanInform() {
		return "솔민 바보^^ 멍청이";
	}
}

