package com.qa.raz.Calculator;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operation implements ActionListener {
	
   TextField TXT;
   
   

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		TXT.setText("Hello World");
		System.out.println("Hello World");
	}
	
	public Operation(TextField x) {
		TXT=x;
	}

}
