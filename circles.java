package p7.Radar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class circles extends JFrame{
	JFrame f=new JFrame();
	JPanel jp;

	public circles() {
		f.setTitle("Radar PPI");
		f.setSize(1920,1080);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBackground(Color.black);
		jp=new Radar_Panel();
		jp.setBackground(Color.black);
		f.add(jp);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		circles g1= new circles();
		g1.setVisible(true);
	}
	
	class Radar_Panel extends JPanel
	{
      static int angle=0;
      @Override
	  public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2d=(Graphics2D)g;
	    g2d.setColor(Color.green);
		g2d.drawOval(690, 320, 150, 150); 
	    g2d.drawOval(664, 294, 200, 200); 
	    g2d.drawOval(638,268,250,250);
	    g2d.drawOval(612, 246, 300, 300);
	    g2d.drawOval(560, 200, 400, 400);
	    g2d.drawOval(510, 150, 500, 500);
	    g2d.drawOval(460,100, 600, 600);
	    g2d.drawOval(410, 50, 700, 700);
	    g2d.drawLine(765, 50,765 , 750);
	    g2d.drawLine(410, 400, 1112, 400);
	    g2d.drawLine(535,135,990,660);
	    g2d.drawLine(1005, 150, 515, 655);
	    g2d.drawOval(570, 520, 1, 1);
	    g2d.drawOval(800, 500, 1, 1);
	    g2d.drawOval(700, 300, 1, 1);
	   
        Line2D line= new Line2D.Double(765,400,765,50);

	    
	    AffineTransform at = 
	            AffineTransform.getRotateInstance(
	                Math.toRadians(angle), line.getX1(), line.getY1());
	 
	        
	        // Draw the rotated line
	        g2d.draw(at.createTransformedShape(line));	    
	        ActionListener taskPerformer = new ActionListener() {
	        	
	            public void actionPerformed(ActionEvent evt) {
	            	
	            	if(angle==360)
	            		angle=0;
	            	else{  
	            		angle=angle+1;	
	            	}
	            	repaint();
	            }
	        };
		 	Timer timer = new Timer(100 ,taskPerformer);
	        timer.setRepeats(false);
	        timer.start();
		    
	         
	  }
		
	
	}
	
}