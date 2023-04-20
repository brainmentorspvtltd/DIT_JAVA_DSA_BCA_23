package com.brainmentors.game.canvas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.brainmentors.game.utils.Constants;

import jaco.mp3.player.MP3Player;

public class SplashScreen extends JFrame implements Constants {
	
	private JLabel label = new JLabel();
	private MP3Player player;
	
	public SplashScreen() {
		
		setTitle(TITLE);
		setSize(SCREENWIDTH, SCREENHEIGHT);
		//setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Icon icon = new ImageIcon(SplashScreen.class.getResource(SPLASH_BG));
		label.setIcon(icon);
		this.add(label);
		
		loadMusic();
		
		setVisible(true);
		
		try {
			Thread.sleep(10000);
			setVisible(false);
			dispose();
			player.stop();
			GameFrame obj = new GameFrame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadMusic() {
		player = new MP3Player(SplashScreen.class.getResource("splash_music.mp3"));
		player.play();
	}

	public static void main(String[] args) {
		SplashScreen screen = new SplashScreen();
	}

}
