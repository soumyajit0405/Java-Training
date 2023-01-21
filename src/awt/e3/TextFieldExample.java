package awt.e3;

import java.awt.*;
import java.awt.event.*;

public class TextFieldExample extends Frame implements TextListener{
	// creating instances of TextField and Button class
	TextField tf1, tf2;

	// instantiating using constructor
	TextFieldExample() {    
        // instantiating objects of text field and button  
        // setting position of components in frame  
        tf1 = new TextField();    
        tf1.setBounds(50, 50, 150, 20);    
        tf2 = new TextField();    
        tf2.setBounds(50, 100, 150, 20);    
        
        tf1.addTextListener(this);
       //tf2.addTextListener(this);
        // adding components to frame  
        add(tf1);  
        add(tf2);  
       
        // setting size, layout and visibility of frame   
        setSize(300,300);    
        setLayout(null);    
        setVisible(true);
        
    }


// main method   
	public static void main(String[] args) {
		new TextFieldExample();
	}

@Override
public void textValueChanged(TextEvent e) {
	// TODO Auto-generated method stub
	tf2.setText(tf1.getText());
	
}
}
