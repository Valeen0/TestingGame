package main;

import javax.swing.*;
import panels.*;

public class Launcher {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		GamePanel panel = new GamePanel();
		
		window.add(panel);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setTitle("Tetris");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
