import java.sql.*;

class Test {
	Connection cn = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	String update_quary = "update STUDENT set SNAME=?,SDEPT=? where ROLLNO=?";
	String Select_quary = "select * from STUDENT";
	
	public void update()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");
			st = cn.createStatement();
			ps = cn.prepareStatement(update_quary);
			
			ps.setString(3, "6");
			ps.setString(1, "Amit");
			ps.setString(2, "BTECH");
			
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
	
	public void getData() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");
			st = cn.createStatement();
			rs = st.executeQuery(Select_quary);
			
			while(rs.next())
				System.out.println(rs.getString(1)+" =========> "+rs.getString(2)+" ==========> "+rs.getString(3));
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
public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test ccn = new Test();
		ccn.update();
		ccn.getData();
	}

}
