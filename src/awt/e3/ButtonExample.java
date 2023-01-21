package awt.e3;

import java.awt.*;

public class ButtonExample extends Frame{
	ButtonExample() {  
		  
	      // creating a button   
	      Button b = new Button("Click Me!!");  
	      //Button b2 = new Button();
	      //Button b3 = new Button();
	     // b3.setLabel("Button 3");  

	      // setting button position on screen  
	      b.setBounds(30,100,80,30);  
	  
	      // adding button into frame    
	      add(b);  
	  
	      // frame size 300 width and 300 height    
	      setSize(300,300);  
	  
	      // setting the title of Frame  
	      setTitle("This is our basic AWT example");   
	          
	      // no layout manager   
	      setLayout(null);   
	  
	      // now frame will be visible, by default it is not visible    
	      setVisible(true);  
	}

	// main method
	public static void main(String args[]) {

		// creating instance of Frame class
		ButtonExample f = new ButtonExample();

	}
}
