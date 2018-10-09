import java.awt.*;

public class Windows {

	public static void main(String[] args) {

		Frame f=new Frame("Raz");
		
	
	
	   TextField T= new TextField();
	   
		
		
		Button b1=new Button("Click 1");
		Button b2=new Button("Click 2");
		Button b3=new Button("Click 3");
		Button b4=new Button("Click 4");
		
		b1.setSize(100, 100);
		
		Event e=new Event(T);
		b1.addActionListener(e);
		
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.SOUTH);
		f.add(T, BorderLayout.CENTER);
		
		
		f.setSize(400, 400);
		
		f.setVisible(true);
		

	}

}
