package jdbcConnection;


	import java.sql.*;

	public class JDBC2 {

		public static void main(String[] args) {

			
			Connection conn =null;
			Statement stmt=null;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root", "root");
				stmt=conn.createStatement();
				
				String sql, sql1;
				
				String sql2;
				
				sql="Insert into qa.school values(24, 'raz', 75)";
				stmt.executeUpdate(sql);
				
				sql1="Insert into qa.school values(25, 'radfsg', 55)";
				stmt.executeUpdate(sql1);

				sql2="Select * From qa.school";
				
				ResultSet r=stmt.executeQuery(sql2);
		        while(r.next()) {
		        	int id=r.getInt("RollNo");
		        	String fname =r.getString("Name");
		        	int marks=r.getInt("Marks");
  	
		        	System.out.println("ID:"+id);
		        	System.out.println("name:"+fname);
		        	System.out.println("marks:"+marks);
		        }
		    	r.close();
		        stmt.close();
		        conn.close();
			}
			catch(Exception se){
				
			}

		}

	
	
	

}
