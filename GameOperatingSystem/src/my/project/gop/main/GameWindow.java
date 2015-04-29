package my.project.gop.main;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	public GameWindow(String title, int width, int height) {
		// TODO Auto-generated constructor stub
		setTitle(title);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
