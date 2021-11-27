import java.sql.*;

class Connection_Code {
	java.sql.Connection cn = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	String insert_quary = "insert into STUDENT values(?,?,?)";
	String select_quary = "select * from STUDENT";
	
	public void insert_data()
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");
		st = cn.createStatement();
		ps = cn.prepareStatement(insert_quary);
		
		ps.setString(1, "4");
		ps.setString(2, "Soumik");
		ps.setString(3, "BTECH");
		ps.setString(1, "6");
		ps.setString(2, "Asish");
		ps.setString(3, "BTECH");
		ps.setString(1, "5");
		ps.setString(2, "Anjana");
		ps.setString(3, "MCA");
		
		ps.executeUpdate();
		cn.commit();
		}
		catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
	}
	public void get_data()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee");
			st = cn.createStatement();
			rs = st.executeQuery(select_quary);
			while(rs.next())
				System.out.println(rs.getString(1)+" ========> "+rs.getString(2)+" =========> "+rs.getString(3));
		}
		catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
}
public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection_Code ccn = new Connection_Code();
		ccn.insert_data();
		ccn.get_data();
	}

}
