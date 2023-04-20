package com.brainmentors.game.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.brainmentors.game.utils.Constants;

public class Player extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[4];
	private BufferedImage walkImages[] = new BufferedImage[5];
	private BufferedImage kickImages[] = new BufferedImage[5];
	private BufferedImage punchImages[] = new BufferedImage[3];
	private BufferedImage powerImages[] = new BufferedImage[4];
	
	private int force;
	
	public Player() throws Exception {
		x = 300;
		h = 200;
		w = 150;
		y = FLOOR;
		speed = SPEED;
		force = 0;
		playerImg = ImageIO.read(Player.class.getResource("ken_.png"));
		//playerImg = ImageIO.read(Player.class.getResource("thor.png"));
		loadIdleImages();
		loadWalkImages();
		loadPunchImages();
		loadKickImages();
		loadPowerImages();
	}
	
	public void jump() {
		force = -30;
		y = y + force;
	}
	
	public void fall() {
		if(y + force > FLOOR) {
			return;
		}
		force = force + GRAVITY;
		y = y + force;
	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(45, 245, 109, 243);
		idleImages[1] = playerImg.getSubimage(263, 242, 112, 246);
		idleImages[2] = playerImg.getSubimage(477, 242, 112, 246);
		idleImages[3] = playerImg.getSubimage(684, 245, 116, 243);
	}
	
	private void loadWalkImages() {
		walkImages[0] = playerImg.getSubimage(43, 735, 113, 239);
		walkImages[1] = playerImg.getSubimage(255, 731, 120, 243);
		walkImages[2] = playerImg.getSubimage(472, 731, 102, 243);
		walkImages[3] = playerImg.getSubimage(694, 731, 100, 243);
		walkImages[4] = playerImg.getSubimage(908, 747, 97, 227);
	}
	
	private void loadKickImages() {
		kickImages[0] = playerImg.getSubimage(43, 1461, 130, 243);
		kickImages[1] = playerImg.getSubimage(245, 1462, 127, 240);
		kickImages[2] = playerImg.getSubimage(426, 1462, 210, 240);
		kickImages[3] = playerImg.getSubimage(245, 1462, 127, 240);
		kickImages[4] = playerImg.getSubimage(43, 1461, 130, 243);
	}
	
	private void loadPowerImages() {
		powerImages[0] = playerImg.getSubimage(29, 10, 155, 224);
		powerImages[1] = playerImg.getSubimage(240, 10, 161, 224);
		powerImages[2] = playerImg.getSubimage(439, 26, 197, 206);
		powerImages[3] = playerImg.getSubimage(660, 26, 193, 206);
	}
	
	private void loadPunchImages() {
		punchImages[0] = playerImg.getSubimage(42, 489, 120, 242);
		punchImages[1] = playerImg.getSubimage(258, 489, 169, 242);
		punchImages[2] = playerImg.getSubimage(475, 489, 117, 242);
	}
	
	public BufferedImage printIdle() {
		if(imageIndex > 3) {
			imageIndex = 0;
		}
		//X = 47 Y = 245 Width = 109 Height = 243
		//return playerImg.getSubimage(45, 245, 109, 243);
		//return playerImg.getSubimage(698, 20, 201, 234);
		BufferedImage img = idleImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printWalk() {
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printPower() {
		if(imageIndex > 3) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = powerImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printPunch() {
		isAttacking = true;
		if(imageIndex > 2) {
			imageIndex = 0;
			currentMove = IDLE;
			isAttacking = false;
		}
		BufferedImage img = punchImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printKick() {
		isAttacking = true;
		if(imageIndex > 2) {
			imageIndex = 0;
			isAttacking = false;
			currentMove = IDLE;
		}
		BufferedImage img = kickImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	private ArrayList<Power> powers = new ArrayList<>();
	
	public ArrayList<Power> getPowers() {
		return powers;
	}
	
	public void showPower() {
		powers.add(new Power(x+w-50, y+h/2 - 70, playerImg));
	}
	
	@Override
	public BufferedImage defaultImage() {
		if(currentMove == WALK) {
			return printWalk();
		}
		else if(currentMove == PUNCH) {
			return printPunch();
		}
		else if(currentMove == KICK) {
			return printKick();
		}
		else if(currentMove == POWER) {
			return printPower();
		}
		else {
			return printIdle();
		}
	}
	
}
