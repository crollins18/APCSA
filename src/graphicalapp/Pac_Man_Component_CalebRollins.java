package graphicalapp;

import java.awt.BasicStroke;
import java.awt.Color;		//color class 
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Polygon;
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import java.awt.geom.QuadCurve2D;
import java.io.IOException;

import javax.swing.JPanel;

import javax.swing.JComponent;

public class Pac_Man_Component_CalebRollins extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		drawGrid(g2);  //Draw grid to make it easier to create component
		
		int row;   
        int col;   
        int x,y;   
        
     
        for ( row = 0;  row < 12;  row++ ) {
        
           for ( col = 0;  col < 12;  col++) {
        	   
              x = col * 50;
              y = row * 50;
              
              if ( (row % 2) == (col % 2) ) {
            	  
                 g2.setColor(Color.white); 
              }
              else {
                 g2.setColor(Color.black);
              }
              Rectangle shape = new Rectangle (x, y, 50, 50);
              g2.fill(shape);
              
           }
        }
        
        for ( row = 0;  row < 20;  row++ ) {
            
            for ( col = 0;  col < 20;  col++) {
         	   
               x = col * 30;
               y = row * 30;
               
               if ( (row % 2) == (col % 2) ) {
             	  
                  g2.setColor(Color.blue); 
               }
               else {
                  g2.setColor(Color.red);
               }
               Rectangle shape = new Rectangle (x, y, 20, 20);
               g2.fill(shape);
               
            }
         }
        
        
       
        
        Rectangle i = new Rectangle (100, 150, 400, 300);
        g2.setColor(Color.BLACK);
        g2.fill(i);
        g2.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(15));
        g2.draw(i);
        
        Ellipse2D.Double mouth = new Ellipse2D.Double(225, 225, 150, 150);
        g2.setColor(Color.YELLOW);
        g2.fill(mouth);
        
        Polygon poly = new Polygon();
		poly.addPoint(300, 300);
		poly.addPoint(400, 400);
		poly.addPoint(400, 200);
		poly.addPoint(300, 300);
		g2.setColor(Color.BLACK);
		g2.fill(poly);
        
        g2.setColor(Color.YELLOW);
		Ellipse2D.Double dot1 = new Ellipse2D.Double(350, 290, 25, 25);
        g2.fill(dot1);
        Ellipse2D.Double dot2 = new Ellipse2D.Double(400, 290, 25, 25);
        g2.fill(dot2);
        g2.setColor(Color.BLACK);
        Ellipse2D.Double dot3 = new Ellipse2D.Double(290, 245, 25, 25);
        g2.fill(dot3);
        g2.setColor(Color.WHITE);
        Ellipse2D.Double dot4 = new Ellipse2D.Double(296, 251, 12, 12);
        g2.fill(dot4);
        

        
        
	}

	public void drawGrid(Graphics2D g2)
	{
		// The following two for loops draw a grid on the screen to help you 
		// position your object.  Once you have finished your object, you can 
		// comment out the call to this method.
		
		//Draw horizontal lines
		g2.setColor(Color.LIGHT_GRAY);									
		for (int i=50; i<=600; i=i+50)
		{
			g2.drawString(""+i, 5, i);
			Line2D.Double horizonalLine = new Line2D.Double(5, i, 700, i);	
			g2.draw(horizonalLine);
		}
		//Draw vertical lines
		for (int i=50; i<=600; i=i+50)
		{
			g2.drawString(""+i, i, 10);
			Line2D.Double horizonalLine = new Line2D.Double(i, 10, i, 700);	
			g2.draw(horizonalLine);
		}
		g2.setColor(Color.BLACK);									
		//**End of grid
	}
}
