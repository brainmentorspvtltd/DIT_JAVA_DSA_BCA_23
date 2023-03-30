package com.brainmentors.game;

//import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.brainmentors.game.utils.Constants;

public class Board extends JPanel implements Constants {
	BufferedImage imageBg;
	public Board() {
		loadBackground();
	}
	
//	@Override
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		g.setColor(Color.RED);
//		//g.fillRect(x,y,w,h);
//		g.fillRect(40, 40, 400, 40);
//		g.setColor(Color.BLUE);
//		//g.drawOval(100, 100, 100, 100);
//		g.fillOval(100, 100, 100, 100);
//	}
	
	@Override
	public void paintComponent(Graphics pen) {
		showBackground(pen);
	}
	
	private void showBackground(Graphics pen) {
		// image, x, y, w, h
		pen.drawImage(imageBg, 0, 0, SCREENWIDTH, SCREENHEIGHT, null);
	}
	
	private void loadBackground() {
		try {
			imageBg = ImageIO.read(Board.class.getResource("background.png"));
		}
		catch (IOException e) {
			System.out.println("Failed to load background image...");
			System.exit(0);
		}
	}
}
