package com.ge3.file;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 
 * @author Akseli
 */
public class SpriteLoader {
	
	public static final String ROOT_PATH = "/cache/sprites/";

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
