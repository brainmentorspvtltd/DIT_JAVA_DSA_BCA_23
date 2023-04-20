package com.brainmentors.game.canvas;

import java.io.IOException;

import javax.swing.JFrame;

import com.brainmentors.game.utils.Constants;

public class GameFrame extends JFrame implements Constants {
	
	public GameFrame() throws Exception {
		setTitle(TITLE);
		setSize(SCREENWIDTH, SCREENHEIGHT);
		setResizable(false);
		Board board = new Board();
		add(board);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

//	public static void main(String[] args) {
//		try {
//			GameFrame obj = new GameFrame();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
