package com.ge3.content;

import java.awt.Graphics;

/**
 * 
 * @author Akseli
 */
public interface Scene {
	
	/**
	 * Initializes the {@linkplain Scene}
	 */
	public void init();

	/**
	 * Draws the scene contents
	 * 
	 * @param g {@linkplain Graphics}
	 */
	public void draw(Graphics g);
}
