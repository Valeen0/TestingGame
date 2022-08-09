package models;

import javax.swing.*;

import panels.GamePanel;
import helpers.Constants;
import java.awt.*;
import java.awt.geom.*;

public class Figure implements Constants{

	int tileSize = Constants.tileSize;
	int figureX, figureY;

	public Figure() {}
	
	public Figure(int figureX, int figureY) {
		this.figureX = figureX;
		this.figureY = figureY;
	}

	public void generate(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		g2.fillRect(figureX-tileSize/2, figureY, tileSize, tileSize);
		
	}


	public int getXPosition() {
		return this.figureX;
	}
	public int getYPosition() {
		return this.figureY;
	}
	
	public void setXPosition(int x) {
		this.figureX = x;
	}
	public void setYPosition(int y) {
		this.figureY = y;
	}
	
}
