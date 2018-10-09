import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener {
	
   TextField TXT;
   
   
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		TXT.setText("Hello World");
		System.out.println("Hello World");
	}
	
	public Event(TextField x) {
		TXT=x;
	}

}
