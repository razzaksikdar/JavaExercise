package com.qa.raz;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class AccountManager {
	
	
	public static void main(String[] args) {
		
		
		Frame f=new Frame("Raz Bank");
		
						f.addWindowListener( 
							new WindowAdapter() {
							public void windowClosing(WindowEvent t) {
								System.exit(0);
							}
							
						});
		Panel body=new Panel();
		Panel buttonPanel=new Panel();

		
		Panel dnrPanel=new Panel();
	    
		
		Panel createAccount=new Panel();
		Panel depositMoney=new Panel();
		Panel withdrawMoney=new Panel();
		Panel checkAccount=new Panel();

		
		f.add(body, BorderLayout.CENTER);
		
		
		
		
// Button
		
		Button b1=new Button("Create");
		Button b2=new Button("Deposit");
		Button b3=new Button("Withdraw");
		Button b4=new Button("Check");
		
		
	
		
		
	
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		buttonPanel.add(b4);
		body.add(buttonPanel);
		
		body.add(dnrPanel);
		
		
		
		

		
		
		
//		Data Entry Panel
		
		
		
		Label L1=new Label("Name");
		Label L2=new Label("Address");
		Label L3=new Label("Output");

		   TextField T1, T2;
		   T1= new TextField();
		   T2= new TextField();
	
		  
		TextArea ta=new TextArea();
		Button b5=new Button("Clear");
		Button b6=new Button("Create");

		
		createAccount.add(L1);
		createAccount.add(T1);
			
		createAccount.add(L2);
		createAccount.add(T2);
			
		createAccount.add(b5);
		createAccount.add(b6);
		createAccount.add(L3);
		createAccount.add(ta);
		
	//dnrPanel.add(createAccount);
	
		
		
		
		// Deposit
		
		
		Label L4=new Label("Enter Account No");
		Label L5=new Label("Enter Deposit Amount");
		Label L6=new Label("Report");

		   TextField T4, T5;
		   T4= new TextField();
		   T5= new TextField();
		  
		TextArea tat=new TextArea();
		Button b7=new Button("Search");
		Button b8=new Button("Save");

		
		depositMoney.add(L4);
		depositMoney.add(T4);
		depositMoney.add(b7);
		
		
		depositMoney.add(L5);
		depositMoney.add(T5);
		depositMoney.add(b8);
		depositMoney.add(L6);
		depositMoney.add(tat);
		
		//dnrPanel.add(depositMoney);
		
		
		
	// action listener
		
		Woperator e=new Woperator(f,createAccount, depositMoney, dnrPanel);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		
		
		
		AccountOperator ao=new AccountOperator(T1, T2, ta);
		b5.addActionListener(ao);
		b6.addActionListener(ao);
	
		
		DepositOperator dot=new DepositOperator(T4, T5, tat);
	    b7.addActionListener(dot);
		b8.addActionListener(dot);
		
		//
		GridLayout gl=new GridLayout(1,2);
		body.setLayout(gl);
		
		GridLayout bg=new GridLayout(4,1);
		buttonPanel.setLayout(bg);
		
		GridLayout createAcGrid=new GridLayout(4,2);
		createAccount.setLayout(createAcGrid);
		
		GridLayout depositGrid=new GridLayout(3,3);
		depositMoney.setLayout(depositGrid);
		
		
		GridLayout dnrp=new GridLayout(1,1);
		dnrPanel.setLayout(dnrp);
		
	
		
		
		f.setSize(1850,850);
		f.setVisible(true);	
	
		
		
	}

}
