package com.qa.raz;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DepositOperator implements ActionListener {
	TextField TT1, TT2;
	TextArea TT3;
	
	public DepositOperator(TextField A, TextField B, TextArea C) {
		TT1=A;  // account id
		TT2=B;   // deposit amount
		TT3=C;   // result
	}
	


	@Override
	public void actionPerformed(ActionEvent x) {

		String result= null;
		
		String TiTleBTN;
		Button btn;
		btn=(Button)x.getSource();
		TiTleBTN=btn.getLabel();
		
		
		if(TiTleBTN.equals("Search")) {
			
			Connection conn =null;
			Statement stmt=null;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/?useSSL=false", "root", "root");
				stmt=conn.createStatement();
				
				String sql, sql2;
				
				float a, b, c;
				a=b=c=0;
				
				a=Integer.parseInt(TT1.getText());
				
//				String n, a;
//				n=TT1.getText();
//				a=TT2.getText();
				
				
				sql= "SELECT AcNo from bank.account where AcNo='"+a+"'";		
				ResultSet r=stmt.executeQuery(sql);
		        while(r.next()) {
		        	int id=r.getInt("AcNo");
		
		        	System.out.println("Account No:"+id);

		            result="Account No :"+id+"  "+"Exist";
//		        	
		        	TT3.setText(result);
		        	
		        }
		        
		    	r.close();
		        stmt.close();
		        conn.close();
			}
			catch(Exception se){
				
			}
		}
		
		if(TiTleBTN.equals("Save")) {
			

			
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
				
				
				sql= "INSERT INTO `bank`.`deposit` (`Name`, `Address`) VALUES ('"+n+"', '"+a+"')";
				stmt.executeUpdate(sql);
		
				
				sql2="Select * From bank.deposit";
				
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
	
		
	}
	

}
