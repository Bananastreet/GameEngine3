package com.ge3;

import java.awt.Dimension;
import java.awt.Insets;

public class Constants {

	public static final String TITLE = "GameEngine3";
	public static final short WIDTH = 700;
	public static final short HEIGHT = 500;
	
	public static final Dimension getDimension(Insets insets) {
		int w = insets.left + 2;
		int h = insets.bottom + 2;
		return new Dimension(WIDTH - w, HEIGHT - h);
	}
}
