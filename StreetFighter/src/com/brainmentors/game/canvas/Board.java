package com.brainmentors.game.canvas;

import java.awt.Color;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.brainmentors.game.sprites.Health;
import com.brainmentors.game.sprites.OpponentPlayer;
import com.brainmentors.game.sprites.Player;
import com.brainmentors.game.utils.Constants;

public class Board extends JPanel implements Constants {
	BufferedImage imageBg;
	private Player player;
	private OpponentPlayer oppPlayer;
	
	private Health kenHealth;
	private Health ryuHealth;
	
	private Timer timer;
	public Board() throws Exception {
		player = new Player();
		oppPlayer = new OpponentPlayer();
		loadBackground();
		setFocusable(true);
		bindEvents();
		loadHealth();
		gameLoop();
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
	
	private void gameLoop() {
		timer = new Timer(250, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Hello World...");
				//Date date = new Date();
				//System.out.println(date);
				player.fall();
				collision();
				repaint();
			}
		});
		timer.start();
	}
	
	private void loadHealth() {
		kenHealth = new Health(30, Color.GREEN, "KEN");
		ryuHealth = new Health(SCREENWIDTH - 760, Color.GREEN, "RYU");
	}
	
	private void printHealth(Graphics pen) {
		kenHealth.printHealthBar(pen);
		ryuHealth.printHealthBar(pen);
	}
	
	private boolean isCollide() {
		int xDist = Math.abs(player.getX() - oppPlayer.getX());
		int yDist = Math.abs(player.getY() - oppPlayer.getY());
		int maxW = Math.max(player.getW(), oppPlayer.getW());
		int maxH = Math.max(player.getH(), oppPlayer.getH());
		return xDist <= maxW && yDist <= maxH; 
	}
	
	private void collision() {
		if(isCollide()) {
			//System.out.println("Collision...");
			player.setCollide(true);
			player.setSpeed(0);
		}
		else {
			player.setSpeed(SPEED);
			player.setCollide(false);
		}
	}
	
	@Override
	public void paintComponent(Graphics pen) {
		showBackground(pen);
		player.drawPlayer(pen);
		oppPlayer.drawPlayer(pen);
		printHealth(pen);
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
				if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setCollide(false);
					player.setSpeed(-SPEED);
					player.move();
					player.setCurrentMove(WALK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.setSpeed(SPEED);
					player.move();
					player.setCurrentMove(WALK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_F) {
					player.setCurrentMove(PUNCH);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_Z) {
					player.setCurrentMove(KICK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					player.jump();
				}
				
				if(e.getKeyCode() == KeyEvent.VK_L) {
					oppPlayer.setSpeed(SPEED);
					oppPlayer.move();
					oppPlayer.setCurrentMove(WALK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_J) {
					oppPlayer.setSpeed(-SPEED);
					oppPlayer.move();
					oppPlayer.setCurrentMove(WALK);
					//repaint();
				}
				else if(e.getKeyCode() == KeyEvent.VK_P) {
					oppPlayer.setCurrentMove(PUNCH);
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
