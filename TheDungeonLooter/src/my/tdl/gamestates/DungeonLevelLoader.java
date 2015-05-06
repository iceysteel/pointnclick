package my.tdl.gamestates;

import java.awt.Graphics2D;

import my.project.gop.main.SpriteSheet;
import my.project.gop.main.loadImageFrom;
import my.tdl.gamestate.GameState;
import my.tdl.gamestate.GameStateManager;
import my.tdl.main.Main;

public class DungeonLevelLoader extends GameState{

	//Most of our code goes in this class, the other classes are frameworks building up to this
	
	SpriteSheet girl = new SpriteSheet();
	
	public DungeonLevelLoader(GameStateManager gsm) {
		super(gsm);
		
	}

	@Override
	public void init() {
		girl.setSpriteSheet(loadImageFrom.LoadImageFrom(Main.class, "girl.png"));
		
	}

	@Override
	public void tick(double deltaTime) {
	
	}

	@Override
	public void render(Graphics2D g) {
		g.drawString("Hello World", 200, 200);
		g.drawImage(girl.getTile(0,0,32,64), 0 , 0, 64, 128, null);
		g.drawImage(girl.getTile(0,0,32*2-32*1,64), 0 , 0, 64, 128, null);
		
	}

}
