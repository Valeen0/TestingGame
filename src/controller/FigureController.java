package controller;

import models.Figure;

public class FigureController {

	private Figure figure;
	
	public FigureController(Figure figure) {
		this.figure = figure;
	}
	
	public void moveLeft() {
		figure.setXPosition(figure.getXPosition() - figure.tileSize);
	}
	
	public void moveRight() {
		figure.setXPosition(figure.getXPosition() + figure.tileSize);
	}
	
	public void moveDown() {
		figure.setYPosition(figure.getYPosition() + figure.tileSize);
	}
	
	public void rotate() {
		
	}
	
}
