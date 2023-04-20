package com.brainmentors.game.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.brainmentors.game.utils.Constants;

public abstract class CommonPlayer implements Constants {
	protected int x;
	protected int y;
	protected int w;
	protected int h;
	protected int speed;
	protected int imageIndex;
	protected int currentMove;
	protected boolean isCollide;
	protected int health;
	protected boolean isAttacking;
	protected BufferedImage playerImg;
	public abstract BufferedImage defaultImage();
	
	public CommonPlayer() {
		health = MAXHEALTH;
	}
	
	public boolean isAttacking() {
		return isAttacking;
	}

	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth() {
		this.health = (int)(health - MAXHEALTH * 0.05);
	}

	public boolean isCollide() {
		return isCollide;
	}

	public void setCollide(boolean isCollide) {
		this.isCollide = isCollide;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(int currentMove) {
		this.currentMove = currentMove;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public BufferedImage getPlayerImg() {
		return playerImg;
	}

	public void setPlayerImg(BufferedImage playerImg) {
		this.playerImg = playerImg;
	}
	
	public void drawPlayer(Graphics pen) {
		//pen.drawImage(playerImg, x, y, w, h, null);
		pen.drawImage(defaultImage(), x, y, w, h, null);
	}
	
	public void move() {
		if(!isCollide) {
			x = x + speed;
		}
		//System.out.println("Move : " + x);
	}
}
