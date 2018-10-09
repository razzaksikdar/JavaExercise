
import java.awt.*;


public class WinCal {

	
	public static void main(String[] args) {

		Frame f=new Frame("Calculator");
		
	
	
	   TextField T1, T2, T3;
	   T1= new TextField();
	   T2= new TextField();
	   T3= new TextField();
	   
		
		
		Button b1=new Button("+");
		Button b2=new Button("-");
		Button b3=new Button("x");
		Button b4=new Button("/");
		
		
		
		Label L1, L2, L3;
		L1= new Label("NO1:");
		L2= new Label("NO2:");
		L3= new Label("Result:");
		
		
		
		OperationCal e=new OperationCal(T1, T2, T3);
	
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		
		
		
		
		
		f.add(L1);
		f.add(T1);
		f.add(L2);
		f.add(T2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(L3);
		f.add(T3);

	
		
		FlowLayout FL=new FlowLayout();
		f.setLayout(FL);
		f.setSize(400, 400);
		f.setVisible(true);
		

	}

}
