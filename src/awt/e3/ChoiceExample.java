package awt.e3;

import java.awt.*;
import java.awt.event.*;

public class ChoiceExample {

	// class constructor
	ChoiceExample() {

		// creating a frame
		Frame f = new Frame();

		// creating a final object of Label class
		final Label label = new Label();

		// setting alignment and size of label component
		label.setAlignment(Label.CENTER);
		label.setSize(400, 100);

		// creating a button
		Button b = new Button("Show");

		// setting the bounds of button
		b.setBounds(200, 100, 50, 20);

		// creating final object of Choice class
		 Choice c = new Choice();

		// setting bounds of choice menu
		c.setBounds(100, 100, 75, 75);

		// adding 5 items to choice menu
		c.add("C");
		c.add("C++");
		c.add("Java");
		c.add("PHP");
		c.add("Android");

		// adding above components into the frame
		f.add(c);
		f.add(label);
		f.add(b);

		// setting size, layout and visibility of frame
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

		// adding event to the button
		// which displays the selected item from the list when button is clicked
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Programming language Selected: " + c.getItem(c.getSelectedIndex());
				label.setText(data);
			}
		});
	}

// main method  
	public static void main(String args[]) {
		new ChoiceExample();
	}
}