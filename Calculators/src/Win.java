
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Win {

	
	public static void main(String[] args) {

		Frame f=new Frame("Calculator");
		Panel body=new Panel();
		
	
	
	   TextField T1, T2, T3, T4;
	   T1= new TextField();
	   T2= new TextField();
	   T3= new TextField();
	   T4= new TextField();
		
		
		Button b1=new Button("+");
		Button b2=new Button("-");
		Button b3=new Button("x");
		Button b4=new Button("/");
		
		Button b5=new Button("0");  //0
		Button b6=new Button("1");  //1
		Button b7=new Button("2"); 
		
		Button b8=new Button("3");
		Button b9=new Button("4");
		Button b10=new Button("5");
		
		Button b11=new Button("6");
		Button b12=new Button("7");
		Button b13=new Button("8");
		
		Button b14=new Button("9");
		Button b15=new Button("=");
		Button b16=new Button("C");
	
		
		// Operation

		b1.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	    
	            String s= "+";
	            T4.setText(s);
	            String x=T1.getText();
	            String c=x+s;
	            T1.setText(c);
	        }

	    });
		
		b2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	    
	            String s= "-";
	            String x=T1.getText();
	            String c=x+s;
	            T1.setText(c);
	        }

	    });
		
		b3.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	    
	            String s= "x";
	            String x=T1.getText();
	            String c=x+s;
	            T1.setText(c);
	        }

	    });
		
		b4.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	    
	            String s= "/";
	            String x=T1.getText();
	            String c=x+s;
	            T1.setText(c);
	        }

	    });
		
		
		
		
		// Digit 
		
		
		b5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            int i=0;
	            String s= Integer.toString(i);
	            
	            String x=T1.getText();
	            String c=x+s;
	            T1.setText(c);
	        }

	    });
		
		
		b6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	            int i=1;
	            String s= Integer.toString(i);
	            T3.setText(s);
	            String x=T1.getText();
	            String c=x+s;
	            T1.setText(c);
	           
	        }

	    });
	
	
     b10.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
          
            
            int five=5;
            String s= Integer.toString(five);
            T2.setText(s);
            String x=T1.getText();
            String c=x+s;
            T1.setText(c);
        }

    });

     

	
	
	
	// =
	b15.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String s= "=";
            String x=T1.getText();
            String c=x+s;
            T1.setText(c);
        }

    });
	
		

		Operation e=new Operation(T2, T3, T4, T1);
	
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		b15.addActionListener(e);
		
		f.add(T1, BorderLayout.NORTH);
		
		f.add(body, BorderLayout.CENTER);

	    body.add(b5);
	    body.add(b6);
	    body.add(b7);
	    body.add(b1);
	    
	    
	    body.add(b8);
	    body.add(b9);
	    body.add(b10);
	    body.add(b2);
	    
	    body.add(b11);
	    body.add(b12);
	    body.add(b13);
	    body.add(b3);
	    
	    body.add(b14);
	    body.add(b15);
	    body.add(b16);
	    body.add(b4);
	    
	    
	    
	    
	    
	    
		//FlowLayout FL=new FlowLayout();
		//f.setLayout(FL);
		
		GridLayout gl=new GridLayout(4,6);
		body.setLayout(gl);
		f.setSize(400, 400);
		f.setVisible(true);
		

	}

}
