package awt.e2;

import java.awt.*;
import java.awt.event.*;

class Outer implements ActionListener {
	OuterClass obj;

	Outer(OuterClass obj) {
		this.obj = obj;
	}

	public void actionPerformed(ActionEvent e) {
		obj.tf.setText("welcome");
	}
}
