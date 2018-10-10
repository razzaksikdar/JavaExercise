package com.qa.raz;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.*;

public class Woperator implements ActionListener{

	  Panel P1, P2, P3;
	  Frame FF;

		public Woperator(Frame F,Panel p1, Panel p2, Panel p3) {
			
		 P1=p1;
		 P2=p2;
		 P3=p3;
		 FF=F;
		}
	
	@Override
	public void actionPerformed(ActionEvent x) {
		Panel result=null;
		String TiTleBTN;
		Button btn;
		btn=(Button)x.getSource();
		TiTleBTN=btn.getLabel();
		
		
		if(TiTleBTN.equals("Create")) {
			P3.removeAll();
	    result=P1;
		}
		if(TiTleBTN.equals("Deposit")) {
			P3.removeAll();
	
			result=P2;
		}
		
		if(TiTleBTN.equals("Withdraw")) {
	
		}
		if(TiTleBTN.equals("Check")) {
	
		}
		
		
		P3.add(result);
		FF.revalidate();
	
		
	}
	
}
