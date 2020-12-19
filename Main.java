import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	void connect()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //load the jar file in the class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/manish","root","");
			//establish ther the connect betwwen the database and java file
			// jdbc:mysql is name of database software
			//localhost means your computer 
			//3306 is the port that is different-2 for different database 
			//manish is database you made
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
