import java.awt.*;

public class Windows {

	public static void main(String[] args) {

		Frame f=new Frame("Raz");
		
	
	
	
		
		
		Button b1=new Button("Click 1");
		Button b2=new Button("Click 2");
		Button b3=new Button("Click 3");
		Button b4=new Button("Click 4");
		Button b5=new Button("Click 5");
		
		Event e=new Event();
		b1.addActionListener(e);
		
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.WEST);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.CENTER);
		
		
		f.setSize(400, 400);
		
		f.setVisible(true);
		

	}

}
