package jdbcsetup.non.assisted;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connect {
	 private Connection connection;
     
     public db_connect(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
             
             Class.forName("com.mysql.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "1234");
             this.connection = DriverManager.getConnection(dbURL, user, pwd);
     }
     public Connection getConnection(){
         return this.connection;
 }
 
 public void closeConnection() throws SQLException {
         if (this.connection != null)
                 this.connection.close();
 }
}

