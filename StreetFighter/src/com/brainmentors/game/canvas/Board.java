package com.brainmentors.game.canvas;

//import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.brainmentors.game.sprites.OpponentPlayer;
import com.brainmentors.game.sprites.Player;
import com.brainmentors.game.utils.Constants;

public class Board extends JPanel implements Constants {
	BufferedImage imageBg;
	private Player player;
	private OpponentPlayer oppPlayer;
	public Board() throws Exception {
		player = new Player();
		oppPlayer = new OpponentPlayer();
		loadBackground();
		setFocusable(true);
		bindEvents();
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
		player.drawPlayer(pen);
		oppPlayer.drawPlayer(pen);
	}
	
	private void bindEvents() {
		KeyListener listener = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println("Key Typed : " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println("Key Released : " + e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println("Key Pressed : " + e.getKeyCode());
				if(e.getKeyCode() == AKEY) {
					player.setSpeed(-10);
					player.move();
					repaint();
				}
				if(e.getKeyCode() == DKEY) {
					player.setSpeed(10);
					player.move();
					repaint();
				}
				
//				if(e.getKeyCode() == LEFTKEY) {
//					oppPlayer.move();
//				}
			}
		};
		this.addKeyListener(listener);
	}
	
	private void showBackground(Graphics pen) {
		// image, x, y, w, h
		pen.drawImage(imageBg, 0, 0, SCREENWIDTH, SCREENHEIGHT, null);
	}
	
	private void loadBackground() {
		try {
			imageBg = ImageIO.read(Board.class.getResource("bg_2.jpg"));
		}
		catch (IOException e) {
			System.out.println("Failed to load background image...");
			System.exit(0);
		}
	}
}