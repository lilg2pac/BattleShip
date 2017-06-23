package battleship.game;

import battleship.core.statepattern.IApplicationContext;

public interface IGame {

	public void init(IApplicationContext applicationContext);
	
	public void update();
	
	public void render();
}
