package root;

import javax.swing.JPanel;
import java.awt.*;

public class Game extends JPanel implements Runnable{
	private boolean running = false;
	private Thread th;
	
	/**
	 * Create the panel.
	 */
	public Game() {

	}

	@Override
	public void run() {
		while(running) {
			repaint();
		}
		
	}

	public void start() {
		th= new Thread(this);
		th.start();
	}
	
	public void stop() {
		
	}
	
	public void paintComponent(Graphics g) {
		
	}
}
