package com.ge3.graphics;

import java.awt.Graphics;
import java.awt.Image;

import com.ge3.file.SpriteLoader;

/**
 * Class for sprites that can be drawn
 * 
 * @author Akseli
 */
public class Sprite {
	
	/**
	 * The actual {@link Image} of the {@link Sprite}
	 */
	private Image image;

	/**
	 * Constructs a new {@link Sprite}
	 * 
	 * @param image
	 * 		{@link #image}
	 */
	public Sprite(Image image) {
		this.image = image;
	}
	
	/**
	 * Constructs a new {@link Sprite}
	 * 
	 * @param image
	 * 		path to an image
	 */
	public Sprite(String image) {
		this(SpriteLoader.load(image));
	}
	
	/**
	 * Draws the {@link #image}.
	 * 
	 * @param g
	 * @param x
	 * 		X-coordinate on screen
	 * @param y
	 * 		Y-coordinate on screen
	 */
	public void draw(Graphics g, int x, int y) {
		g.drawImage(image, x, y, null);
	}
	
	/**
	 * Getter for {@link #image}
	 * 
	 * @return
	 * 		{@link #image}
	 */
	public Image getImage() {
		return image;
	}
}
