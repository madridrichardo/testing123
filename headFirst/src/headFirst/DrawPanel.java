package headFirst;

import java.awt.*;
import javax.swing.*;

public class DrawPanel extends JPanel {
	int x1 = 10;
	int x2 = 100;
	int y1 = 10;
	int y2 = 100;
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		x1 += 10; y1 += 10; 
		x2 += 10; y2 += 10;
		
		GradientPaint gradient = new GradientPaint(x1, y1, randColor(), x2, y2, randColor());
		
		g2d.setPaint(gradient);
		g2d.fillOval(x1, y1, 50, 50);
	}
	
	public Color randColor() {
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		Color c = new Color(red, green, blue);
		
		return c;
	}

}
