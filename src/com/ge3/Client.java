package com.ge3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

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
		frame.setTitle(Constants.TITLE);
		frame.setSize(Constants.WIDTH, Constants.HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		processMainLoop();
	}
	
	private void processMainLoop() {
		TimerTask timerTask = new TimerTask() {

			@Override
			public void run() {
				processGameLoop();
				repaint();
			}
		};
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(timerTask, 0, 1);
	}
	
	
	private void processGameLoop() {
		x++;
		if (x == 500)
			x=0;
	}
	
	int x = 0;
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawString("test", x, 100);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
