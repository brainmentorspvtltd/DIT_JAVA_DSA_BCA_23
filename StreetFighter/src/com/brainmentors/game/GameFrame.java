package com.brainmentors.game;

import javax.swing.JFrame;

import com.brainmentors.game.utils.Constants;

public class GameFrame extends JFrame implements Constants {
	
	public GameFrame() {
		setTitle(TITLE);
		setSize(SCREENWIDTH, SCREENHEIGHT);
		
		Board board = new Board();
		add(board);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		GameFrame obj = new GameFrame();
	}

}
