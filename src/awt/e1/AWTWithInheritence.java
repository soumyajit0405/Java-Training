package awt.e1;

import java.awt.*;
import java.awt.event.*;

public class AWTWithInheritence extends Frame implements ActionListener, WindowListener{
	AWTWithInheritence() {  
		  
	      // creating a button   
	      Button b = new Button("Click Me!!");  
	  
	      // setting button position on screen  
	      b.setBounds(30,100,80,30);  
	  
	      // adding button into frame    
	      add(b);  
	  
	      // frame size 300 width and 300 height    
	      setSize(300,300);  
	  
	      // setting the title of Frame  
	      setTitle("This is our basic AWT example");   
	      addWindowListener(this);
	      // no layout manager   
	      setLayout(null);   
	      // now frame will be visible, by default it is not visible    
	      setVisible(true);  
	}

	// main method
	public static void main(String args[]) {

		// creating instance of Frame class
		AWTWithInheritence f = new AWTWithInheritence();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
	    System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
