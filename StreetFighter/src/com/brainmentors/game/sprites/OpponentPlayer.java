package com.brainmentors.game.sprites;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.brainmentors.game.utils.Constants;

public class OpponentPlayer extends CommonPlayer implements Constants {
	public OpponentPlayer() throws Exception {
		x = SCREENWIDTH - 500;
		h = 200;
		w = 150;
		y = FLOOR - h;
		speed = -10;
		playerImg = ImageIO.read(Player.class.getResource("ryu_.png"));
		//playerImg = ImageIO.read(Player.class.getResource("thor.png"));
	}
	
	@Override
	public BufferedImage idle() {
		//X = 2749 Y = 35 Width = 101 Height = 232
		return playerImg.getSubimage(2749, 35, 101, 232);
		//return playerImg.getSubimage(698, 20, 201, 234);
	}
}
