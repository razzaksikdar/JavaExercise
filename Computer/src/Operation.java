import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;


public class Operation implements ActionListener {
	
   TextField TT1, TT2, TT3;
   
	
	public Operation(TextField A, TextField B, TextField C) {
		TT1=A;
		TT2=B;
		TT3=C;
	}
	
	@Override
	public void actionPerformed(ActionEvent x) {
		
		float a, b, c;
		a=b=c=0;
		String TiTleBTN;
		
		a=Integer.parseInt(TT1.getText());
		b=Integer.parseInt(TT2.getText());
		
		
		Button btn;
		btn=(Button)x.getSource();
		TiTleBTN=btn.getLabel();
		
		
		if(TiTleBTN.equals("+")) {
			c=a+b;
		}
		if(TiTleBTN.equals("-")) {
			c=a-b;
		}
		
		if(TiTleBTN.equals("x")) {
			c=a*b;
		}
		if(TiTleBTN.equals("/")) {
			c=a/b;
		}
		
		String result=Float.toString(c);
		TT3.setText(result);
	}

}