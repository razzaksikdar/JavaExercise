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
	TextField TT3;
	
	public DepositOperator(TextField A, TextField B, TextField C) {
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
				
				String sql;
				
				int a;
				a=0;
				
				a=Integer.parseInt(TT1.getText());
				
//				String n, a;
//				n=TT1.getText();
//				a=TT2.getText();
				
				
				sql= "SELECT AcNo from bank.account where AcNo='"+a+"'";		
				ResultSet r=stmt.executeQuery(sql);
				
				
		        if(r.next()) {
		        	
					String id= null;
		        	id=r.getString("AcNo");
		        		result="Account No :"+id+"  "+"Exist."+" Enter The Deposit Amount Please";
		        		System.out.println("Account No:"+id);
		        		TT3.setText(result);
		        	}
		        	else {
		        		result="Account No :"+a+"  "+"Does NOT Exist"+"Sorry!Create your Account first";
		        		System.out.println("Account No:"+a);
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
				
				
				sql= "INSERT INTO `bank`.`deposit` (`AcNo`, `amount`) VALUES ('"+n+"', '"+a+"')";
				stmt.executeUpdate(sql);
		
				
				sql2="Select * From bank.deposit";
				
				ResultSet r=stmt.executeQuery(sql2);
		        while(r.next()) {
		        	int ac=r.getInt("AcNo");
		        	float amnt =r.getFloat("amount");
		        	String datet=r.getString("Date");
		        	int depId=r.getInt("depositId");
		
		        	System.out.println("Account No:"+ac);
		        	System.out.println("Amount:"+amnt);
		        	System.out.println("Date:"+datet);
		        	System.out.println("Deposit id:"+depId);
		        	
		            result="Account No :"+ac+"  "+"Amount:"+amnt+"  "+"Date :"+datet+"Deposit Id :"+depId;
		        	
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
