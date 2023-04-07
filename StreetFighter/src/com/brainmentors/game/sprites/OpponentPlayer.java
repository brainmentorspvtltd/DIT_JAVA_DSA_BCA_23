package com.brainmentors.game.sprites;

import java.awt.image.BufferedImage;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;

import javax.imageio.ImageIO;

import com.brainmentors.game.utils.Constants;

public class OpponentPlayer extends CommonPlayer implements Constants {
	
	private BufferedImage idleImages[] = new BufferedImage[5];
	private BufferedImage walkImages[] = new BufferedImage[5];
	private BufferedImage kickImages[] = new BufferedImage[5];
	private BufferedImage punchImages[] = new BufferedImage[5];
	
	public OpponentPlayer() throws Exception {
		x = SCREENWIDTH - 500;
		h = 200;
		w = 150;
		y = FLOOR - h;
		speed = -10;
		playerImg = ImageIO.read(Player.class.getResource("ryu_.png"));
		//playerImg = ImageIO.read(Player.class.getResource("thor.png"));
		loadIdleImages();
		loadWalkImages();
		loadPunchImages();
	}
	
	private void loadIdleImages() {
		idleImages[0] = playerImg.getSubimage(2961, 40, 106, 228);
		idleImages[1] = playerImg.getSubimage(2748, 40, 107, 228);
		idleImages[2] = playerImg.getSubimage(2555, 33, 108, 235);
		idleImages[3] = playerImg.getSubimage(2359, 38, 104, 230);
		idleImages[4] = playerImg.getSubimage(2174, 47, 91, 217);
	}
	
	private void loadWalkImages() {
		walkImages[0] = playerImg.getSubimage(2960, 329, 92, 217);
		walkImages[1] = playerImg.getSubimage(2758, 317, 111, 229);
		walkImages[2] = playerImg.getSubimage(2575, 313, 107, 233);
		walkImages[3] = playerImg.getSubimage(2392, 313, 98, 231);
		walkImages[4] = playerImg.getSubimage(2211, 313, 94, 231);
	}
	
	private void loadPunchImages() {
		punchImages[0] = playerImg.getSubimage(2940, 1227, 111, 226);
		punchImages[1] = playerImg.getSubimage(2731, 1215, 135, 238);
		punchImages[2] = playerImg.getSubimage(2491, 1215, 186, 238);
		punchImages[3] = playerImg.getSubimage(2731, 1215, 135, 238);
		punchImages[4] = playerImg.getSubimage(2940, 1227, 111, 226);
	}
	
	private void loadKickImages() {
		
	}
	
//	@Override
//	public BufferedImage idle() {
//		//X = 2749 Y = 35 Width = 101 Height = 232
//		return playerImg.getSubimage(2749, 35, 101, 232);
//		//return playerImg.getSubimage(698, 20, 201, 234);
//	}
	
	
	public BufferedImage printIdle() {
		if(imageIndex > 4) {
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
		if(imageIndex > 4) {
			imageIndex = 0;
			currentMove = IDLE;
		}
		BufferedImage img = punchImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	@Override
	public BufferedImage defaultImage() {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(IDLE);
//		list.add(WALK);
//		list.add(PUNCH);
//		
//		Random random = new Random();
//		currentMove = list.get(random.nextInt(list.size()));
		
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
