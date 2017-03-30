package com.ge3;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * 
 * @author Akseli
 */
public class Client extends JComponent {

	private static final long serialVersionUID = 1L;
	
	private JFrame frame;
	private JPanel panel;
	
	
	protected Client() {
		frame = new JFrame();
		panel = new JPanel(new BorderLayout());
		panel.add(this);
		frame.add(panel);
		frame.setSize(Constants.WIDTH, Constants.HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		processMainLoop();
	}
	
	private void processMainLoop() {
		new Thread() {
			@Override
			public void run() {
				while(true) {
					processGameLoop();
					repaint();
					try {
						sleep(1);
					} catch(Exception e) {
						e.printStackTrace();
						break;
					}
				}
			}
		}.start();
	}
	
	private void processGameLoop() {
	}
	
	@Override
	public void paintComponent(Graphics g) {
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
