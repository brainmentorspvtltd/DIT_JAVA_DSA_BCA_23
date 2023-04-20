package com.brainmentors.game.sprites;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Health extends CommonPlayer {
	Color color;
	String playerName;
	public Health(int x, Color color, String name) {
		this.x = x;
		y = 20;
		w = 700;
		h = 50;
		this.color = color;
		this.playerName = name;
	}
	
	public void printHealthBar(Graphics pen) {
		pen.setColor(Color.RED);
		pen.fillRect(x, y, w, h);
		if(health > 0) {
			pen.setColor(color);
			pen.fillRect(x, y, health, h);
			pen.setFont(new Font("times", Font.BOLD, 50));
		}
		pen.setColor(Color.WHITE);
		pen.drawString(this.playerName, x, y + 100);
	}

	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}
}
