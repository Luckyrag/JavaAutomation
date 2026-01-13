package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Display {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","Lokesh@143");
			
			String displayQuery = "select * from students where branch = 'EC' and sem ='8'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(displayQuery);

			while (rs.next()) {
			    System.out.println(
			        rs.getInt("roll_no") + " " +
			        rs.getString("name") + " " +
			        rs.getString("branch") + " " +
			        rs.getString("sem")
			    );
			}

			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Warning "+e);
		}
		catch(SQLException e) {
			System.out.println("Connection : "+e);
		}
			

	}

}
