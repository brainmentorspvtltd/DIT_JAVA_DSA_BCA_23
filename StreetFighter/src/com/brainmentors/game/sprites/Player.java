package com.brainmentors.game.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.brainmentors.game.utils.Constants;

public class Player extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[4];
	private BufferedImage walkImages[] = new BufferedImage[5];
	private BufferedImage kickImages[] = new BufferedImage[5];
	private BufferedImage punchImages[] = new BufferedImage[3];
	
	public Player() throws Exception {
		x = 300;
		h = 200;
		w = 150;
		y = FLOOR - h;
		speed = 10;
		playerImg = ImageIO.read(Player.class.getResource("ken_.png"));
		//playerImg = ImageIO.read(Player.class.getResource("thor.png"));
		loadIdleImages();
		loadWalkImages();
		loadPunchImages();
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
	
	public BufferedImage printPunch() {
		if(imageIndex > 2) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = punchImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	@Override
	public BufferedImage defaultImage() {
		if(currentMove == WALK) {
			return printWalk();
		}
		else if(currentMove == PUNCH) {
			return printPunch();
		}
		else {
			return printIdle();
		}
	}
	
}
