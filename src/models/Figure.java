package models;

import javax.swing.*;

import controller.FigureController;
import panels.GamePanel;
import helpers.Constants;
import java.awt.*;
import java.awt.geom.*;

public class Figure implements Constants{

	FigureController figureController;
	
	public int tileSize = Constants.tileSize;
	int figureX, figureY;
	boolean object = true;
	
	public Figure(int figureX, int figureY) {
		figureController = new FigureController(this);
		this.figureX = figureX;
		this.figureY = figureY;
	}

	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		g2.fillRect(figureX-tileSize/2, figureY, tileSize, tileSize);
		
	}

	public int getXPosition() {
		return figureX;
	}
	public int getYPosition() {
		return figureY;
	}
	public FigureController getController() {
		return figureController;
	}
	
	public void setXPosition(int x) {
		figureX = x;
	}
	public void setYPosition(int y) {
		figureY = y;
	}
	
}
