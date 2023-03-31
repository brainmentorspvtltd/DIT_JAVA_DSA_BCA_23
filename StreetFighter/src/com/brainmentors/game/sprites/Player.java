package com.brainmentors.game.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.brainmentors.game.utils.Constants;

public class Player extends CommonPlayer implements Constants {
	
	public Player() throws Exception {
		x = 300;
		h = 200;
		w = 150;
		y = FLOOR - h;
		speed = 10;
		playerImg = ImageIO.read(Player.class.getResource("ken_.png"));
		//playerImg = ImageIO.read(Player.class.getResource("thor.png"));
	}
	
	@Override
	public BufferedImage idle() {
		//X = 47 Y = 245 Width = 109 Height = 243
		return playerImg.getSubimage(47, 245, 109, 243);
		//return playerImg.getSubimage(698, 20, 201, 234);
	}
	
}
