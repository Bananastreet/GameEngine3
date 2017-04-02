package com.ge3.content;

import java.awt.Graphics;

/**
 * Class for managing scenes
 * 
 * @author Akseli
 */
public class SceneManager {

	/**
	 * Current {@linkplain Scene} of the instance
	 */
	private Scene currentScene;
	
	/**
	 * ID of the current {@linkplain Scene}
	 */
	private int currentSceneID;
	
	/**
	 * Constructs a new {@linkplain SceneManager} instance.
	 * Automatically sets {@linkplain #currentScene} to 0
	 */
	public SceneManager() {
		currentScene = Scenes.getScene(currentSceneID = 0);
		currentScene.init();
	}
	
	/**
	 * Sets the next {@linkplain Scene} in the list
	 */
	public void next() {
		if (currentSceneID < Scenes.amount() - 1)
			set(currentSceneID++);
		currentScene.init();
	}
	
	/**
	 * Sets the previous {@linkplain Scene} in the list
	 */
	public void previous() {
		if (currentSceneID > 0)
			set(currentSceneID--);
		currentScene.init();
	}
	
	/**
	 * Sets a {@linkplain Scene} by <code>id</code>
	 * 
	 * @param id
	 * 		of the {@linkplain Scene}
	 */
	public void set(int id) {
		currentScene = Scenes.getScene(currentSceneID = id);
		currentScene.init();
	}
	
	/**
	 * Draws the {@linkplain #currentScene}
	 * 
	 * @param g {@linkplain Graphics}
	 */
	public void drawCurrentScene(Graphics g) {
		currentScene.draw(g);
	}
	
	/**
	 * Getter for {@linkplain #currentScene}
	 * 
	 * @return
	 * 		{@linkplain #currentScene}
	 */
	public Scene getCurrentScene() {
		return currentScene;
	}
	
	/**
	 * Getter for {@linkplain #currentSceneID}
	 * 
	 * @return
	 * 		{@linkplain #currentSceneID}
	 */
	public int getCurrentSceneID() {
		return currentSceneID;
	}
}
