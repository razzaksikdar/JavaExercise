import java.awt.Button;
import java.awt.TextField;
import java.awt.event.*;


public class Operation implements ActionListener {
	


	@Override
	public void actionPerformed(ActionEvent x) {
		
		float a, b, c;
		a=b=c=0;
		String TiTleBTN;
		
		a=Integer.parseInt(TT1.getText());
		b=Integer.parseInt(TT2.getText());
		
		
	
		TiTleBTN=TT4.getText();
		
		
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
		if(TiTleBTN.equals("=")) {
		String result=Float.toString(c);
		TT3.setText(result);
		}
	}

}