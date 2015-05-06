package my.tdl.main;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import my.project.gop.main.GameWindow;
import my.project.gop.main.SpriteSheet;
import my.tdl.gameloop.GameLoop;

public class Main {

//code to fit to screen(not resize tho :( )	
//	public static GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//	public static int width = gd.getDisplayMode().getWidth();
//	public static int height = gd.getDisplayMode().getHeight();
	
	static SpriteSheet blocks = new SpriteSheet();

	public static void main(String[] args) {
		//create the game window with name and dimensions
		GameWindow frame = new GameWindow("theDlooter", 1280, 720);
		frame.add(new GameLoop(1280, 720));
		
	}

}
