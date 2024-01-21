package frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Swing {
	public static void main(String[] args) {
		JTextField tfOne = new JTextField();
		JTextField tfTwo = new JTextField();

		JButton btn;

		JFrame frame = new JFrame();
		btn.setBounds(100, 100, 50, 50);
		
		frame.add(tfOne);//
		frame.add(tfTwo);
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(88, 99);
		frame.setVisible(true);
	}

}
