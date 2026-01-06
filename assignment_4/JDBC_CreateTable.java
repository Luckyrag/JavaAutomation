package assignment_4;
import java.sql.*;

/*
 * Task         : Create Table using JDBC
 * Date 		: 30/12/25
 * Completed By : Lokesh Raghuwanshi
 */

public class JDBC_CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","Lokesh@143");
			
			String createTable = "create table Students(roll_no INT  primary key , name varchar(20), branch varchar(20), yop INT  ,sem varchar(10)) ";
			Statement st = con.createStatement();
			st.execute(createTable);
			
			System.out.println("Table is Created Successfully !");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Warning "+e);
		}
		catch(SQLException e) {
			System.out.println("Connection : "+e);
		}

	}

}
