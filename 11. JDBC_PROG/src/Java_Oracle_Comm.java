import java.sql.*;

class TestConnection{
	java.sql.Connection cn = null;		//For establish the connection
	Statement st = null;		//To execute the statement
	PreparedStatement ps = null; // To insert data
	ResultSet rs = null;		//To retrieve data from database
	String Select_Sql = "select * from student";	//query
	String Insert_Sql = "insert into STUDENT values(?,?,?)";
	String Delete_Sql = "delete from STUDENT where ROLLNO=(?)";
	String Update_Sql = "update STUDENT set SNAME=?,SDEPT=? where ROLLNO=?";
	
	/*public void insertData()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");	// Register & load the driver
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");	//establish the connection
			st = cn.createStatement();	// Create the statement
			ps = cn.prepareStatement(Insert_Sql);
			ps.setString(1, "3");
			ps.setString(2, "Anjana");
			ps.setString(3, "MCA");
			ps.setString(1,"4");
			ps.setString(2,"Amit");
			ps.setString(3,"BTECH");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void UpdateData()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");	// Register & load the driver
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");	//establish the connection
			st = cn.createStatement();	// Create the statement
			ps = cn.prepareStatement(Update_Sql);
			ps.setString(3, "3");
			ps.setString(1, "Samrat");
			ps.setString(2, "BTECH");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
	}
	public void DeleteData() 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");	// Register & load the driver
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");	//establish the connection
			st = cn.createStatement();	// Create the statement
			ps = cn.prepareStatement(Delete_Sql);
			ps.setString(1, "Samrat");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
	}*/
	public void getData() 
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");	// Register & load the driver
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");	//establish the connection
			st = cn.createStatement();	// Create the statement
			rs = st.executeQuery(Select_Sql);	// execute the query
			
			while(rs.next()) // Fetch data one by one
			{
				System.out.println(rs.getString(1)+" ====> "+rs.getString(2)+" =====> "+rs.getString(3));
			}
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
public class Java_Oracle_Comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestConnection ts = new TestConnection();
		//ts.insertData();
		//ts.DeleteData();
		//ts.UpdateData();
		ts.getData();
	}
}