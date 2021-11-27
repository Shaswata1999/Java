import java.sql.*;

class TestConnection1{
	Connection cn = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	String delete_quary = "delete from STUDENT where ROLLNO=(?)";
	String select_quary = "select * from STUDENT";
	
	public void delete_data()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");
			st = cn.createStatement();
			ps = cn.prepareStatement(delete_quary);
			
			ps.setString(1, "6");
			
			ps.executeUpdate();
			cn.commit();
		}
		catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		}
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}
		
	}
	
	public void getData()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");
			st = cn.createStatement();
			rs = st.executeQuery(select_quary);
			
			while(rs.next())
				System.out.println(rs.getString(1)+" ======> "+rs.getString(2)+" ========> "+rs.getString(3));
		}
		catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		}
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		}
	}
	
}
public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestConnection1 t1 = new TestConnection1();
		t1.delete_data();
		t1.getData();
	}

}
