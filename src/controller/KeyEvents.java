package controller;

import java.awt.event.*;

import models.Figure;
import panels.GamePanel;

public class KeyEvents extends KeyAdapter {
	
	GamePanel game;
	
	public KeyEvents(GamePanel game) {
		this.game = game;
	}
	
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_D) {
			game.getFigure().getController().moveRight();
			game.repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			game.getFigure().getController().moveLeft();
			game.repaint();
		}
		
		
	}
}
