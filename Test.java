package lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test extends Frame implements ActionListener {

	TextField textfield;

	Test() {
		textfield = new TextField();
		Button button = new Button("Click");//This option Appear in the screen
		button.setBounds(1, 2, 5, 4);
		textfield.setBounds(1, 10, 1, 8);
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}

	public static void main(String[] args) {
		Test ts = new Test();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		textfield.setText("Play game during class");
		System.out.println("hello");

	}

}