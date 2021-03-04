package headFirst;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Screen implements ActionListener {
	
	private JFrame frame;
	private JButton button;
	private int s = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(s %= 3) {
		case 0:
			button.setText("Click me again");
			break;
		case 1:
			button.setText("I have been clicked");
			break;
		case 2:
			button.setText("Click me");
			break;
		}
		
		frame.repaint();
		s++;
	}
	
	public void go() {
		frame = new JFrame();
		button = new JButton("click me");
		DrawPanel drawPanel = new DrawPanel();
		
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(300,300);
		
		frame.setVisible(true);
	}

}
