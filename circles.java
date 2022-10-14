package p7;
	import java.awt.Color;
import java.awt.Graphics;
	import javax.swing.*;
	public class circles extends JPanel
	{
	  public void paint(Graphics g){
	   
		  g.setColor(Color.green);
		  g.drawOval(690, 320, 150, 150); 
	    g.drawOval(664, 294, 200, 200); 
	    g.drawOval(638,268,250,250);
	    g.drawOval(612, 246, 300, 300);
	    g.drawOval(560, 200, 400, 400);
	    g.drawOval(510, 150, 500, 500);
	    g.drawOval(460,100, 600, 600);
	    g.drawOval(410, 50, 700, 700);
	    g.drawLine(765, 50,765 , 750);
	    g.drawLine(410, 400, 1112, 400);
	    g.drawLine(535,135,990,660);
	    g.drawLine(1005, 150, 515, 655);
	  }
	  
	  public static void main(String[] args){
	    JFrame f = new JFrame("Draw a circle");
	    f.setBackground(Color.black);
	    f.add(new circles());
	    f.setSize(2500, 2500);
	    f.setVisible(true);
	    f.setResizable(false);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	  }
	}