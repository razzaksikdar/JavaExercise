package com.qa.raz;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.*;

public class Woperator implements ActionListener{

	  Panel P1, P2, P3, P4, P5;
	  Frame FF;

		public Woperator(Frame F,Panel p1, Panel p2, Panel p3, Panel p4, Panel p5) {
			
		 P1=p1;
		 P2=p2;
		 P3=p3;
		 P4=p4;
		 P5=p5;
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
	
			P3.removeAll();
			
			result=P4;
			
		}
		if(TiTleBTN.equals("Check")) {
	       P3.removeAll();
			
			result=P5;
		}
		
		
		P3.add(result);
		FF.revalidate();
	
		
	}
	
}
