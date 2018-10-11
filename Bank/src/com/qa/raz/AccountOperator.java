package com.qa.raz;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AccountOperator implements ActionListener{
	TextField TT1, TT2;
	TextField TT3;
	
	public AccountOperator(TextField A, TextField B, TextField C) {
		TT1=A;
		TT2=B;
		TT3=C;
	}
	

	@Override
	public void actionPerformed(ActionEvent x) {
		String result= null;
		
		String TiTleBTN;
		Button btn;
		btn=(Button)x.getSource();
		TiTleBTN=btn.getLabel();
		

		
		if(TiTleBTN.equals("Create")) {
			
			Connection conn =null;
			Statement stmt=null;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root", "root");
				stmt=conn.createStatement();
				
				String sql;
				
				String sql2;
				
				
				String n, a;
				n=TT1.getText();
				a=TT2.getText();
				
				
				sql= "INSERT INTO `bank`.`account` (`Name`, `Address`) VALUES ('"+n+"', '"+a+"')";
				stmt.executeUpdate(sql);
		
				
				sql2="Select * From bank.account";
				
				ResultSet r=stmt.executeQuery(sql2);
		        while(r.next()) {
		        	int id=r.getInt("AcNo");
		        	String cname =r.getString("Name");
		        	String address=r.getString("Address");
		
		        	System.out.println("Account No:"+id);
		        	System.out.println("Name:"+cname);
		        	System.out.println("Address:"+address);
		        	
		            result="Account No :"+id+"  "+"Name :"+cname+"  "+"Address :"+address;
		        	
		        	TT3.setText(result);
		        	
		        }
		        
		    	r.close();
		        stmt.close();
		        conn.close();
			}
			catch(Exception se){
				
			}
		}
		
	
	if(TiTleBTN.equals("Clear")) {
			
			TT1.setText(" ");
		
			TT2.setText(" ");
			
			TT3.setText(" ");
		}

		
		
	}

}
