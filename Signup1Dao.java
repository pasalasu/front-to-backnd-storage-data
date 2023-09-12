package facebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Signup1Dao {
	Signup1 s1;
	Signup1 getSignup1(String FIRSTNAME)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:ORCL","system","tiger1");
			PreparedStatement pstmt=con.prepareStatement("select * from  myapplication where FIRSTNAME=?");
			pstmt.setString(1, FIRSTNAME);
			ResultSet rs=pstmt.executeQuery();
			rs.next();
			s1=new Signup1();
			s1.setFirstname(rs.getString(1));
			s1.setSurname(rs.getString(2));
			s1.setMobilenumberoremailaddress(rs.getString(3));
			s1.setPassword(rs.getString(4));
			s1.setMont(rs.getString(5));
			s1.setMnumber(rs.getInt(6));
			s1.setYear(rs.getInt(7));
			s1.setSex(rs.getString(8));
			s1.setUname(rs.getString(9));
			return s1;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s1;
	}
}