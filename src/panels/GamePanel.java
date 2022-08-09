package panels;

import javax.swing.*;

import controller.GameController;
import models.Figure;
import helpers.Constants;
import java.awt.*;

public class GamePanel extends JPanel {
	
	GameController gameController;
	Figure figure;
	
	
	final int screenRows = 17;
	final int screenCol = 13;
	final int tileSize = Constants.tileSize;
	
	final int screenWidth = tileSize*screenCol; //360
	final int screenHeight = tileSize*screenRows; //500
	
	int InitialobjectX = screenWidth/2;
	int InitialobjectY = 0;
	
	public GamePanel() {
		setPreferredSize(new Dimension(screenWidth, screenHeight));
		setBackground(new Color(40, 40, 40));
		setFocusable(true);
		gameController = new GameController(this);
		gameController.start();
		
	}
	
	public void startGame() {
		figure = new Figure(InitialobjectX, InitialobjectY);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		drawGrid(g);
		
		//figure = new Figure(g, InitialobjectX, InitialobjectY);
		figure.generate(g);
		g2.dispose();
		
	}

	public void update() {
		figure.setYPosition(figure.getYPosition() + tileSize);
	}
	
	private void drawGrid(Graphics g) {
		g.setColor(new Color(45,45,45));
		
		for(int i = 0; i< screenWidth / tileSize; i++) 
			g.drawLine(tileSize*i, 0, tileSize*i, screenHeight);
		
		for(int i = 0; i< screenHeight / tileSize; i++)
			g.drawLine(0, tileSize*i, screenWidth, tileSize*i);
	}
}
