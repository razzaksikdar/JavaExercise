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
						
		// Panel declaration
						
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
	
		  
		TextField ta=new TextField();
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
		
		TextField tat=new TextField();
		
		
		Button b7=new Button("Search");
		Button b8=new Button("Save");
		Button b0=new Button("Clear");

		
		depositMoney.add(L4);
		depositMoney.add(T4);
		depositMoney.add(b7);
		depositMoney.add(L5);
		depositMoney.add(T5);
		depositMoney.add(b8);
		depositMoney.add(L6);
		depositMoney.add(tat);
		depositMoney.add(b0);

		
		// Withdraw 
		Label L7=new Label("Enter Account No");
		Label L8=new Label("Existing Balance");
		Label L9=new Label("Enter Amount to withdraw");
		Label L10=new Label("");
		Label L11=new Label("Output");
		
		TextField T6, T7, T8;
		T6= new TextField();
		T7= new TextField();
		T8= new TextField();
		TextField wOutput=new TextField();
		
		
		Button b9=new Button("Clear");
		Button b10=new Button("Search");
		Button b11=new Button("Withdraw");
		
		
		withdrawMoney.add(L7);
		withdrawMoney.add(T6);
		
		withdrawMoney.add(b9);
		withdrawMoney.add(b10);
		
		withdrawMoney.add(L8);
		withdrawMoney.add(T7);
		
		withdrawMoney.add(L9);
		withdrawMoney.add(T8);
		
		withdrawMoney.add(L10);
		withdrawMoney.add(b11);
		
		withdrawMoney.add(L11);
		withdrawMoney.add(wOutput);
		
//		dnrPanel.add(withdrawMoney);
		
		// Check account
		
		
		Label L12, L13, L14, L15;
		
		L12 = new Label("Account Number: ");
		L13 = new Label("Name:");
		L14 = new Label("Address:");
		L15 = new Label("Balance");
		
		Button b12=new Button("Clear");
		Button b13=new Button("Search");
		
		TextField T9, T10, T11, T12, T13, T14;
		T9= new TextField();
		T10= new TextField();
		T11= new TextField();
		T12= new TextField();
		T13= new TextField("Inward Statement:");
		T14= new TextField("Outward Statement:");
		
		checkAccount.add(L12);
		checkAccount.add(T9);
		
		checkAccount.add(b12);
		checkAccount.add(b13);
		
		checkAccount.add(L13);
		checkAccount.add(T10);
		
		checkAccount.add(L14);
		checkAccount.add(T11);
		
		checkAccount.add(L15);
		checkAccount.add(T12);
		
		checkAccount.add(T13);
		checkAccount.add(T14);
		
		
	// action listener
		// window operator
		Woperator e=new Woperator(f,createAccount, depositMoney, dnrPanel, withdrawMoney, checkAccount);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		
		
		// account operator
		AccountOperator ao=new AccountOperator(T1, T2, ta);
		b5.addActionListener(ao);
		b6.addActionListener(ao);
	
		// Deposit operator
		DepositOperator dot=new DepositOperator(T4, T5, tat);
	    b7.addActionListener(dot);
		b8.addActionListener(dot);
		b0.addActionListener(dot);
		
		// Layout declaration
		
		
		GridLayout gl=new GridLayout(1,2);
		body.setLayout(gl);
		
		GridLayout bg=new GridLayout(4,1);
		buttonPanel.setLayout(bg);
		
		GridLayout createAcGrid=new GridLayout(4,2);
		createAccount.setLayout(createAcGrid);
		
		GridLayout depositGrid=new GridLayout(3,3);
		depositMoney.setLayout(depositGrid);
		
		
		GridLayout withdraw=new GridLayout(6,2);
		withdrawMoney.setLayout(withdraw);
		
		GridLayout moneycheck=new GridLayout(6,2);
		checkAccount.setLayout(moneycheck);
		
		GridLayout dnrp=new GridLayout(1,1);
		dnrPanel.setLayout(dnrp);
		
		
	    
		// frame size
		
		f.setSize(1850,850);
		f.setVisible(true);	
	
		
		
	}

}
