package lab6;

import java.awt.*;
import java.awt.event.ActionEvent;

class Test extends Frame implements ActionListener{

		TextField textfield;
		Test(){
			textfield=new TextField();
			Button button = new Button("Click");
			button.setBounds(100,200,50,40);
			textfield.setBounds(60,50,70,80);
			button.addActionListener((ActionListener) this);
			add(button);
			}
				public  action void performed(ActionEvent e){
					textfield.setText("Play game during class");
					}
					
				public static void main(String []args){
				new Test();
				}

				
				
}