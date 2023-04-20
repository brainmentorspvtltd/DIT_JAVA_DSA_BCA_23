package com.brainmentors.game.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Power extends CommonPlayer {

	public Power(int x, int y, BufferedImage img) {
		this.playerImg = img;
		this.x = x;
		this.y = y;
		w = 50;
		h = 50;
		speed = 70;
	}

	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return playerImg.getSubimage(30, 1028, 98, 82);
	}
	
	public void printPower(Graphics pen) {
		pen.drawImage(defaultImage(), x, y, w, h, null);
		move();
	}
	
}
