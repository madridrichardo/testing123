package headFirst;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI {
	
	int x = 70, y = 70;
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Screen screen = new Screen();
		//screen.go();
		
		//Simple animation code: Head First pg 384
		SimpleGUI gui = new SimpleGUI();
		gui.go();

	}
*/	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		for(int i=0; i < 130; i++) {
			x++; y++;
			
			drawPanel.repaint();
			
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println("Something went wrong");
			}
		}
	}
	
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}

}
