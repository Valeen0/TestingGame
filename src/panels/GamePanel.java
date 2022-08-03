package panels;

import javax.swing.*;

import controller.GameController;
import models.Figure;

import java.awt.*;

public class GamePanel extends JPanel {
	
	GameController gameController;
	Figure figure;
	
	final int screenWidth = 350;
	final int screenHeight = 450;
	final int tileSize = 20;
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
		
		figure = new Figure(g, objectX, objectY);
		g2.dispose();
		
	}
	
	public void update() {
		objectY += 2;
	}
}
