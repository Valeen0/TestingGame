package models;

import javax.swing.*;

import panels.GamePanel;

import java.awt.*;
import java.awt.geom.*;

public class Figure{
	
	int tileSize = 10;
	int figureX, figureY = 0;
	char[] figures = {'A','B','C','D','E','F','G'};
	
	public Figure(Graphics g, int figureX, int figureY) {
		this.figureX = figureX;
		this.figureY = figureY;
		
		generateRandom(g);
	}
	
	public void generateRandom(Graphics g) {
		Graphics2D g2 = (Graphics2D) g; 
		drawFigure(g2, (int)Math.round(Math.random()*6) );
	}
	
	public void drawFigure(Graphics2D g2, int figure) {
		
		g2.setColor(Color.RED);
		
		g2.fill(new A(20, 80));
		
	}
	
	public class A extends Rectangle2D.Double{
		
		private static final long serialVersionUID = 1L;
		
		public A(double width, double height) {
			
			super(figureX-width / 2, figureY, width, height);
		}
		
	}
	
}
