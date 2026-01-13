package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","Lokesh@143");
		
		String deleteQuery = "DELETE from  students where yop = 2024 and branch ='Civil' ";
		Statement st = con.createStatement();
		st.execute(deleteQuery);
		
		con.close();
		System.out.println("Delete operation is completed!");
		
	}
	catch(ClassNotFoundException e) {
		System.out.println("Warning "+e);
	}
	catch(SQLException e) {
		System.out.println("Connection : "+e);
	}
		
	}

}
