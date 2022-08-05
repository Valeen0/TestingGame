package models;

import javax.swing.*;

import panels.GamePanel;

import java.awt.*;
import java.awt.geom.*;

public class Figure {

	int tileSize;
	int figureX, figureY;
	char[] figures = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	char nextFigure;

	public Figure(Graphics g, int figureX, int figureY) {
		this.tileSize = Tile.size;
		this.figureX = figureX;
		this.figureY = figureY;

		generateRandom(g);
	}

	public void generateRandom(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		createFigure(g2, (int) Math.round(Math.random() * 6));
	}

	public void createFigure(Graphics2D g2, int f) {

		g2.setColor(Color.RED);
		//drawFigureA(g2);
		
	}
	
	
}
