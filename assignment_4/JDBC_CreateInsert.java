package assignment_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_CreateInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","Lokesh@143");
			
			String insertData = "insert into students(roll_no, name , branch , yop ,sem , percentage) values (03 ,'Abhishek Bihar' , 'EC', 2026, '8' ,79),"
					+ "(16,'Amish pratap','AIDS', 2027 , '6' , 79) , (26,'Raja sujal', 'Civil', 2027 , '6' , 58), (31,'Sachin Corrdinator','EC',2026,'8',76),"
					+ "(34,'Devansh Jha', 'CSE', 2028,'4',81.89)";
			
			Statement st = con.createStatement();
			st.execute(insertData);
			
			System.out.println("Data is Updated Successfully !");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Warning "+e);
		}
		catch(SQLException e) {
			System.out.println("Connection : "+e);
		}

	}

}
