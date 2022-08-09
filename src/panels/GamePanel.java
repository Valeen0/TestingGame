package panels;

import javax.swing.*;

import controller.*;
import models.Figure;
import helpers.Constants;
import java.awt.*;

public class GamePanel extends JPanel {
	
	GameController gameController;
	Figure figure;
	
	final int screenRows = 20;
	final int screenCol = 13;
	final int tileSize = Constants.tileSize;
	
	final int screenWidth = tileSize*screenCol;
	final int screenHeight = tileSize*screenRows;
	
	int InitialobjectX = screenWidth/2;
	int InitialobjectY = 0;
	
	public GamePanel() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setBackground(new Color(40, 40, 40));
		setFocusable(true);
		addKeyListener(new KeyEvents(this));
		gameController = new GameController(this);
		gameController.start();	
	}
	
	public void startGame() {
		createFigure();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		drawGrid(g);
		figure.draw(g);
		g2.dispose();
		
	}
	public void createFigure() {
		figure = new Figure(InitialobjectX, InitialobjectY);
	}

	public void update() {
		if(figure.getYPosition() + tileSize < screenHeight) {
			figure.getController().moveDown();
		}else {
			// instance new figure
		}
		
		//System.out.print("Y: "+figure.getYPosition());
		//System.out.println(" X: "+figure.getXPosition());
	}
	
	private void drawGrid(Graphics g) {
		g.setColor(new Color(45,45,45));
		
		for(int i = 0; i< screenWidth / tileSize; i++) 
			g.drawLine(tileSize*i, 0, tileSize*i, screenHeight);
		
		for(int i = 0; i< screenHeight / tileSize; i++)
			g.drawLine(0, tileSize*i, screenWidth, tileSize*i);
	}
	
	public Figure getFigure() {
		return this.figure;
	}
}
