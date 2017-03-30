package com.ge3;

/**
 * 
 * @author Akseli
 */
public class Initialize {
	
	private static Client instance;
	
	public static Client getInstance() {
		return instance;
	}
	
	public static void main(String[] arguments) {
		instance = new Client();
	}
}
