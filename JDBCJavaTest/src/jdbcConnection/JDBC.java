package jdbcConnection;

import java.sql.*;

public class JDBC {

	public static void main(String[] args) {

		
		Connection conn =null;
		Statement stmt=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			stmt=conn.createStatement();
			
//			String sql, sql1, sql2;
//			sql="Insert into school values(24, 'raz', 75)";
//			sql1="Insert into school values(25, 'radfsg', 55)";
//			stmt.executeQuery(sql);
//			stmt.executeQuery(sql1);

			String sql2="Select * From sakila.actor";
			
			ResultSet r=stmt.executeQuery(sql2);
	        while(r.next()) {
	        	int id=r.getInt("actor_id");
	        	String fname =r.getString("first_name");
	        	String lname =r.getString("last_name");
//	        	int marks=r.getInt("Marks");
	        	System.out.println("ID:"+id);
	        	System.out.println("first name:"+fname);
	        	System.out.println("last name:"+lname);
	        }
	    	r.close();
	        stmt.close();
	        conn.close();
		}
		catch(Exception se){
			
		}

	}

}
