package assignment_4;
import java.sql.*;

// Write a program to increase 5% to percentage of all Students whose branch is CSE.
public class JDBC_Select {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AdvanceJava","root","Lokesh@143");
		
		String select1 = "update students set percentage = percentage + (percentage*0.5) where branch ='CSE' ";
		Statement st = con.createStatement();
		st.execute(select1);
		con.close();
	}

}
