package com.ge3.file;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

/**
 * Useful class for writing and reading files
 * 
 * @author Akseli
 */
public class FileUtils {

	/**
	 * Reads a file fully
	 * 
	 * @param file
	 * 		target {@link File}
	 * @return
	 * 		file content as bytes
	 */
	public static byte[] readFully(File file) {
		byte[] bytes = new byte[(int) file.length()];
		try {
			DataInputStream dis;
			dis = new DataInputStream(new FileInputStream(file));
			dis.readFully(bytes);
			dis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	/**
	 * Reads a file fully
	 * @see #readFully(File)
	 * 
	 * @param file
	 * 		target {@link File} path
	 * @return
	 * 		file content as bytes
	 */
	public static byte[] readFully(String file) {
		return readFully(new File(file));
	}
	
	/**
	 * Writes content into a {@link File}.
	 * DOES NOT APPEND!
	 * 
	 * @param file
	 * 		target {@link File}
	 * @param s
	 * 		content
	 */
	public static void write(File file, String s) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(s);
			fw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @see #write(File, String)
	 */
	public static void write(String file, String s) {
		write(new File(file), s);
	}
	
	/**
	 * Writes content into a {@link File}.
	 * DOES APPEND!
	 * 
	 * @param file
	 * @param s
	 */
	public static void append(File file, String s) {
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(s);
			fw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @see #write(File, String)
	 */
	public static void append(String file, String s) {
		append(new File(file), s);
	}
}
