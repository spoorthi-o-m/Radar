package p7.Radar;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class tries extends JPanel{
	

	 private static class RectDraw extends JPanel {
	        public void paintComponent(Graphics g) {
	        super.paintComponent(g);  
	         g.drawRect(230,80,10,10);  
	         g.setColor(Color.RED);  
	         g.fillRect(230,80,10,10); 
	         g.rotate(90);
	        }
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Draw a circle");
	    f.setBackground(Color.black);
	    f.add(new circles());
	    f.setSize(2500, 2500);
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
/*GRect rect1 = new GRect(100, 100, 50, 50);
	rect1.setFilled(true);
	add(rect1);
	rect1.rotate(90);
*/