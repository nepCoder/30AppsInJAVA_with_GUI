package myClock;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame extends JFrame {

	public JPanel pnl;
	
	public Frame(String title)
	{
		super(title);
		setSize(720, 720);
		setLocationByPlatform(true);
		pnl = new JPanel();
		pnl.setBackground(Color.BLACK);
		add(pnl, SwingConstants.CENTER);
		
		new Thread() {
			public void run()
			{
				while (true)
				{
					repaint();
					delayAnimation();
				}
			}
		}.start();
	}
	
	
	
	
	public void delayAnimation() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void drawLines(int val, int pos, Graphics g) {
		//Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.WHITE);
		if((val & 1) != 0) 
			g.drawLine(pos+5, 200, pos+80, 200); //0th  > 1st
		if((val & 2) != 0) 
			g.drawLine(pos+85, 205, pos+85, 280); //1st  > 6th
		if((val & 4) != 0) 
			g.drawLine(pos+85, 290, pos+85, 365); //2nd  > 7th
		if((val & 8) != 0) 
			g.drawLine(pos+5, 370, pos+80, 370); //3rd  > 3rd
		if((val & 16) != 0) 
			g.drawLine(pos, 290, pos, 365); //4th  > 5th
		if((val & 32) != 0) 
			g.drawLine(pos, 205, pos, 280); //5th  > 4th
		if((val & 64) != 0) 
			g.drawLine(pos+5, 285, pos+80, 285); //6th  2nd
		
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		//combination value for each digit
		int[] digit = new int[] 
				{63, 6, 91, 79, 102, 109, 125, 7, 127, 111};
		
		//get system time
		Calendar time = Calendar.getInstance();
		int hr = time.get(Calendar.HOUR_OF_DAY);
		int min = time.get(Calendar.MINUTE);
		int sec = time.get(Calendar.SECOND);
		
		// determine AM or PM
		int am = 1;
		if (hr>12) {
			hr -=12;
			am = 0;
		}
				
		//hour digits
		drawLines(digit[hr/10], 20, g);  //tens digit
		drawLines(digit[hr%10], 120, g); //ones digit
		
		//ratio sign
		g.setColor(Color.RED);
		g.fillRect(230, 260 , 5, 5);
		g.fillRect(230, 310, 5, 5);
		
		//minute digits
		drawLines(digit[min/10], 250, g);  //tens digit
		drawLines(digit[min%10], 350, g);  //ones digit
		
		//ratio sign
		g.setColor(Color.RED);
		g.fillRect(460, 260 , 5, 5);
		g.fillRect(460, 310, 5, 5);
		
		//second digits
		drawLines(digit[sec/10], 480, g); //tens digit
		drawLines(digit[sec%10], 580, g); //ones digit
		
		//AM or PM
		if (am==1) 
		{
			g.setColor(Color.YELLOW);
			g.drawString("AM", 690, 210);
		}
		else 
		{
			g.setColor(Color.GREEN);
			g.drawString("PM", 690, 210);
		}
	}
	
	
}
