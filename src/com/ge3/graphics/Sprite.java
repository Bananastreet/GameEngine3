package com.ge3.graphics;

import java.awt.Graphics;
import java.awt.Image;

import com.ge3.file.SpriteLoader;

/**
 * 
 * @author Akseli
 */
public class Sprite {
	
	private Image image;

	public Sprite(Image image) {
		this.image = image;
	}
	
	public Sprite(String image) {
		this(SpriteLoader.load(image));
	}
	
	public void draw(Graphics g, int x, int y) {
		g.drawImage(image, x, y, null);
	}
	
	public Image getImage() {
		return image;
	}
}
