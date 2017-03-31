package com.ge3.file;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * A class for loading sprites from {@link #ROOT_PATH}
 * 
 * @author Akseli
 */
public class SpriteLoader {
	
	/**
	 * Path where the images are loaded from
	 */
	public static final String ROOT_PATH = "/cache/sprites/";

	/**
	 * Loads an {@link Image} from {@link #ROOT_PATH}.
	 * 
	 * @param name
	 * @return {@link Image}
	 */
	public static Image load(String name) {
		try {
			String path = ROOT_PATH + name + ".png";
			return new ImageIcon(SpriteLoader.class.getResource(path)).getImage();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
