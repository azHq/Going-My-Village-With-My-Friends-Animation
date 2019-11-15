package newAnimation;



import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyVillage extends JPanel implements ActionListener{
	
	float size;
	double number;
	int plane;
	int fan;
	int car2;
	
	int x=-212,y=210;
	
	private BufferedImage img;
	private BufferedImage img1;
	GeneralPath path=new GeneralPath();
	
	public MyVillage() {
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated constructor stub
		setPreferredSize(new Dimension(920,720));
		
		try {
			
			img = ImageIO.read(getClass().getResourceAsStream("/azaz5.jpg")); 
			img1 = ImageIO.read(getClass().getResourceAsStream("/azaz2.jpg"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		number++;
		path.moveTo(0,0);
		path.lineTo(5,4);
		path.lineTo(3,5);
		
		path.closePath();
		new Timer(30,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				number+=4;
				plane+=7;
				fan+=40;
				car2+=7;
				System.out.println(number);
				repaint();
				
			}
			
		}).start();
		
	}
	
	
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2D=(Graphics2D)g;
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		AffineTransform transform=g2D.getTransform();
		g2D.scale(100,-100);
		g2D.translate(0,-3);
		g2D.setColor(Color.gray);
		g2D.fillRect(0,-10,900,700);
		/*g2D.scale(getWidth()/7,getHeight()/-7.9);*/
		g2D.setColor(new Color(51,204,51));
		
		
		g2D.fill(path);
		g2D.setTransform(transform);
		
		
		
		AffineTransform transform1=g2D.getTransform();
		g2D.scale(getWidth()/7,getHeight()/-7.9);
		g2D.translate(0,-5);
		
		
		
		g2D.setColor(new Color(45,78,99));
		g2D.fill(new Rectangle2D.Double(0,-1.74,15,1.5));
		
		g2D.setStroke(new BasicStroke(0.08F,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,0,new float[] {0.2F,0.2F},1));
	
		g2D.setColor(Color.white);
		g2D.drawLine(-1,-1, 9,- 1);
		g2D.setTransform(transform1);
		
		
		//image
		AffineTransform aTran = new AffineTransform();
		g2D.scale(4,1.4);
		g2D.translate(0,0);
		g2D.drawImage(img, new AffineTransform(), this);
		g2D.transform(aTran);
		

	      
		  AffineTransform transform2 = new AffineTransform();
	      g2D.translate(0,-5);
	      g2D.scale(getWidth()/7,getHeight()/-7.9);
	      g2D.setColor(new Color(45,78,99));
	      g2D.fill(new Rectangle2D.Double(0,-4.16,15,.33));
	      g2D.setTransform(transform2);
	     
	      AffineTransform aTran1 = new AffineTransform();
	      g2D.scale(3.9,-2.1);
	      g2D.translate(0,-660);
	      g2D.drawImage(img1, new AffineTransform(), this);
	      
	      g2D.transform(aTran1);
	      
	   
	      AffineTransform transform4 = new AffineTransform();
	      g2D.setTransform(transform4);
	      System.out.println("azaz"+g2D.getTransform());
	      
	      g2D.translate(-20+number,80);
	      g2D.scale(3,3);
			
		  paint_cars(g2D);
		  g2D.setTransform(transform4);
		  
		  
		  g2D.translate(-20+plane,80);
	      g2D.scale(3,3);
		  plane(g2D);
		  g2D.setTransform(transform4);
		  
		  g2D.translate(-20+car2,80);
	      g2D.scale(3,3);
		  paintcar2(g2D);
		  g2D.setTransform(transform4);
		  
		  
		  g2D.translate(-20-car2,80);
	      g2D.scale(3,3);
		  paintBird(g2D);
		  g2D.setTransform(transform4);
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	*/
	
	
	private void paint_cars(Graphics2D g2D) {
		// TODO Auto-generated method stub
		//bird
		g2D.setColor(Color.black);
		for(int i=60;i<2000;i+=420) {
			
			g2D.fill(new Ellipse2D.Double(-43-i,-12,12,2));
			g2D.fillRoundRect(-36-i,-13,1,4,2,2);
			
			g2D.fill(new Ellipse2D.Double(-10-i,-4,12,2));
			g2D.fillRoundRect(-3-i,-5,1,4,2,2);
			
			g2D.fill(new Ellipse2D.Double(-27-i,9,12,2));
			g2D.fillRoundRect(-20-i,8,1,4,2,2);
			
			
			g2D.fill(new Ellipse2D.Double(-50-i,4,12,2));
			g2D.fillRoundRect(-43-i,3,1,4,2,2);
		}
		
		
		
		
		
		
		float sum=0;
		//System.out.println("azaz"+g2D.getTransform());
		g2D.setColor(Color.red);
		g2D.fillRoundRect(0,170,120,40, 8, 8);
		
		
		
		AffineTransform transform=g2D.getTransform();
		g2D.translate(90,210);
		g2D.scale(8,8);
		paint_wheel(g2D);
		g2D.setTransform(transform);
		g2D.translate(30,210);
		g2D.scale(8,8);
		
		paint_wheel(g2D);
		g2D.setTransform(transform);
		for(int i=0;i<5;i++) {
			
			sum=sum+20;
			g2D.setColor(Color.black);
			g2D.fill(new Rectangle2D.Double(sum-16,176,10,13));
		}
		
		g2D.fill(new Rectangle2D.Double(sum+4,178,10,14));
		
		
		g2D.setColor(Color.white);
		g2D.setFont(new Font("serif",Font.BOLD,7));
		g2D.drawString("UNIVERY OF DHAKA",sum-75,197);
		
		//cars2
		/*g2D.setColor(Color.blue);
		g2D.fillRoundRect(-212,210,113,20, 12, 8);
		g2D.fill(new Ellipse2D.Double(-194,205,70,20));
		g2D.fill(new Ellipse2D.Double(-194,200,70,20));
		g2D.fill(new Ellipse2D.Double(-194,200,75,20));
		
		//window
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRoundRect(-178,208,14,10,4,4);
		
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRoundRect(-148,208,14,10,4,4);
		
		
		g2D.translate(-127,229);
		g2D.scale(8,8);
		paint_wheel(g2D);
		g2D.setTransform(transform);
		
		g2D.translate(-180,229);
		g2D.scale(8,8);
		paint_wheel(g2D);
		g2D.setTransform(transform);*/
		
		
		
		int j=0;
		
		for(int i=100;i<3000;i+=300) {
			
			
			if(j==0) g2D.setColor(Color.red);
			if(j==1) g2D.setColor(Color.yellow);
			if(j==2) g2D.setColor(Color.green);
			if(j==3) g2D.setColor(Color.MAGENTA);
			if(j==4) g2D.setColor(Color.orange);
			if(j>=5) g2D.setColor(Color.blue);
			g2D.fillRoundRect(x-i,y,113,20, 12, 8);
			g2D.fill(new Ellipse2D.Double(x+18-i,205,70,20));
			g2D.fill(new Ellipse2D.Double(x+18-i,200,70,20));
			g2D.fill(new Ellipse2D.Double(x+18-i,200,75,20));
			
			//window
			g2D.setColor(Color.LIGHT_GRAY);
			g2D.fillRoundRect(x+34-i,208,14,10,4,4);
			
			g2D.setColor(Color.LIGHT_GRAY);
			g2D.fillRoundRect(x+64-i,208,14,10,4,4);
		
			g2D.translate(x+85-i,229);
			g2D.scale(8,8);
			paint_wheel(g2D);
			g2D.setTransform(transform);
			
			g2D.translate(x+32-i,229);
			g2D.scale(8,8);
			paint_wheel(g2D);
			g2D.setTransform(transform);
		
			j++;
		}
		
		
		
		
		
		
		
		
		
		g2D.setTransform(transform);
		g2D.setColor(Color.blue);
		g2D.fill(new Rectangle2D.Double(-10.5,1,2,1.5));
		g2D.fill(new Rectangle2D.Double(-12.5,0,5,1.5));
		g2D.setColor(Color.blue);
		
		g2D.fill(new Rectangle2D.Double(-9.7,1,0.8,1));
		g2D.setColor(new Color(0,0,128));
		
		g2D.fill(new Ellipse2D.Double(-10.5,12,6,2));
		
		g2D.fill(new Rectangle2D.Double(-8.4,11.8,0.25,0.7));
		g2D.fill(new Rectangle2D.Double(-10.3,12.1,0.25,0.5));
		
		
		//plane
		g2D.fill(new Ellipse2D.Double(0,400,18,18));
		
		
		
	}
	
	private void  paintcar2(Graphics2D g2D) {
		
		
		AffineTransform transform=g2D.getTransform();
		g2D.setColor(Color.blue);
		g2D.fillRoundRect(-212,210,113,20, 12, 8);
		g2D.fill(new Ellipse2D.Double(-194,205,70,20));
		g2D.fill(new Ellipse2D.Double(-194,200,70,20));
		g2D.fill(new Ellipse2D.Double(-194,200,75,20));
		
		//window
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRoundRect(-178,208,14,10,4,4);
		
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fillRoundRect(-148,208,14,10,4,4);
		
		
		g2D.translate(-127,229);
		g2D.scale(8,8);
		paint_wheel(g2D);
		g2D.setTransform(transform);
		
		g2D.translate(-180,229);
		g2D.scale(8,8);
		paint_wheel(g2D);
		g2D.setTransform(transform);
		
		
		
	}
	
	private void plane(Graphics2D g2D) {
		
		
		/*for(int i=0;i<3000;i+=120) {
			
			g2D.fill(new Ellipse2D.Double(-40+i,8,12,2));
			g2D.fillRoundRect(-33+i,7,1,4,2,2);
			
			g2D.fill(new Ellipse2D.Double(430+i,60,12,2));
			g2D.fillRoundRect(434+i,59,1,4,2,2);
			
			g2D.fill(new Ellipse2D.Double(430+i,80,12,2));
			g2D.fillRoundRect(434+i,79,1,4,2,2);
			
			
			g2D.fill(new Ellipse2D.Double(450+i,80,12,2));
			g2D.fillRoundRect(454+i,79,1,4,2,2);
	}*/
		
		g2D.setColor(new Color(0,100,150));
		g2D.fill(new Ellipse2D.Double(-70,20,68,12));
		g2D.fillRoundRect(-75,23,12,6,5,5);
		
		
		g2D.fillRoundRect(-40,15,2,12,1,1);
		
		
		
		
		g2D.rotate(2*Math.PI/15);
		
		
		g2D.fillRoundRect(-66,50,13,4,3,3);
		
		//g2D.rotate(0);
		AffineTransform transform1=g2D.getTransform();
		g2D.translate(-30,30);
		g2D.scale(1,1);
		//g2D.rotate(-2*Math.PI/15);
		
		g2D.rotate(-fan);
		for(int i=0;i<15;i++) {
			g2D.rotate(2*Math.PI/15);
			g2D.fillRoundRect(0,0,10,1,1,1);
		}
		
		
	}

	private void paint_wheel(Graphics2D g2D) {
		
		// TODO Auto-generated method stub
		AffineTransform transform=g2D.getTransform();
		
		g2D.rotate(-number);
		g2D.rotate(-number);
		g2D.rotate(-number);
		g2D.translate(0,0);
		g2D.scale(1,1);
		g2D.setColor(Color.black);
		g2D.fill(new Ellipse2D.Double(-1.0,-1,2,2));
		
		
		g2D.setColor(Color.LIGHT_GRAY);
		g2D.fill(new Ellipse2D.Double(-0.8,-0.8,1.6,1.6));
		
		g2D.setColor(Color.black);
		g2D.fill(new Ellipse2D.Double(-0.2,-0.2,0.4,0.4));
		
		
		
			
			for(int i=0;i<=15;i++) {
				g2D.rotate(2*Math.PI/15);
				g2D.draw(new Rectangle.Double(0,0,1,.2));
			}
			
		

		
	}
	
	private void paintBird(Graphics2D g2D) {
		
		
		g2D.setColor(Color.black);
		
		for(int i=0;i<3000;i+=320) {
				
				g2D.fill(new Ellipse2D.Double(400+i,70,12,2));
				g2D.fillRoundRect(404+i,69,1,4,2,2);
				
				g2D.fill(new Ellipse2D.Double(430+i,60,12,2));
				g2D.fillRoundRect(434+i,59,1,4,2,2);
				
				g2D.fill(new Ellipse2D.Double(430+i,80,12,2));
				g2D.fillRoundRect(434+i,79,1,4,2,2);
				
				
				g2D.fill(new Ellipse2D.Double(450+i,80,12,2));
				g2D.fillRoundRect(454+i,79,1,4,2,2);
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
