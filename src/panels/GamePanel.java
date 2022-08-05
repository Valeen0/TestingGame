package panels;

import javax.swing.*;

import controller.GameController;
import models.Figure;
import models.Tile;

import java.awt.*;

public class GamePanel extends JPanel {
	
	GameController gameController;
	Figure figure;
	
	final int tileSize = Tile.size;
	final int screenWidth = tileSize*17; //360
	final int screenHeight = tileSize*23; //500
	
	int objectX = screenWidth/2;
	int objectY = 0;
	
	public GamePanel() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setBackground(new Color(40, 40, 40));
		setFocusable(true);
		gameController = new GameController(this);
		
		startGame();
	}
	
	public void startGame() {
		gameController.start();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		drawGrid(g);
		drawFigure(g2);
		
		g2.dispose();
		
	}
	
	public void update() {
		objectY += tileSize;
	}
	
	private void drawFigure(Graphics2D g2) {
		figure = new Figure(g2, objectX, objectY);
	}
	
	private void drawGrid(Graphics g) {
		g.setColor(new Color(45,45,45));
		
		for(int i = 0; i< screenWidth / tileSize; i++) 
			g.drawLine(tileSize*i, 0, tileSize*i, screenHeight);
		
		for(int i = 0; i< screenHeight / tileSize; i++)
			g.drawLine(0, tileSize*i, screenWidth, tileSize*i);
	}
}
