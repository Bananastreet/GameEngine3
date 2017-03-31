package com.ge3.content;

import java.util.ArrayList;

import com.ge3.content.scenes.MenuScene;

/**
 * 
 * @author Akseli
 */
public class Scenes {

	/**
	 * {@linkplain ArrayList} of the {@linkplain Scene}s
	 */
	private static ArrayList<Scene> scenes = new ArrayList<Scene>();
	
	static {
		scenes.add(new MenuScene());
	}
	
	/**
	 * 
	 * @param id
	 *		id of the {@linkplain Scene} 
	 * @return
	 * 		{@linkplain Scene} for id
	 */
	public static Scene getScene(int id) {
		return scenes.get(id);
	}
	
	/**
	 * Getter for {@linkplain #scenes}
	 * 
	 * @return
	 * 		{@linkplain #scenes}
	 */
	public static ArrayList<Scene> getScenes() {
		return scenes;
	}
	
	/**
	 * @return
	 * 		total amount of {@linkplain Scene}s in {@linkplain Scenes}
	 */
	public static int amount() {
		return scenes.size();
	}
}
