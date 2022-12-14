package controller;

import javax.swing.*;

import helpers.GameStatus;
import panels.GamePanel;

public class GameController extends Thread{

	GameStatus gameStatus;
	int FPS = 60;
	GamePanel game;

	public GameController(JPanel game) {
		this.game = (GamePanel) game;
	}
	
	public void run() {
		
		gameStatus = GameStatus.RUNNING;
		
		double drawInterval = 1000000000 / FPS; // 0.016 seconds
		double nextDrawTime = System.nanoTime() + drawInterval;
		
		while(GameStatus.RUNNING.equals(gameStatus)) {

			game.update();
			game.repaint();
			
			try {
				double remainingTime = nextDrawTime - System.nanoTime();
				remainingTime = remainingTime / 1000000;
				
				if(remainingTime < 0) 
					remainingTime = 0;
				
				Thread.sleep((long) remainingTime);
				
				nextDrawTime += drawInterval;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
