package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {

public static void main(String[] args) throws ClassNotFoundException, SQLException{

Class.forName("org.apache.derby.jdbc.ClientDriver");
System.out.println("Driver Loaded");
Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/stutidb;create=true;");
System.out.println("Connection created");

// after connection is created, createStatement object
Statement st = con.createStatement();

con.setAutoCommit(false);

// any SQL statement query
st.executeUpdate("insert into student values(111,'Harish',65)");
st.executeUpdate("insert into student values(222,'Karan',75)");

st.executeUpdate("update student set marks = 100 where studentid=200");

ResultSet rs = st.executeQuery("select * from student where marks > 50");

while(rs.next())
{
int id = rs.getInt(1);
String name =rs.getString(2); // 2 is the column position
float marks = rs.getFloat("marks"); // marks is the column name
System.out.println(id + name + marks);


}

con.rollback();
}

}