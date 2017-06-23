package battleship.core.statepattern;

import battleship.enums.StateType;

public interface IState {
	
	public void load();
	
	public void unload();
	
	public void init(IApplicationContext applicationContext);
	
	public void update();
	
	public void render();
	
	public void paused();
	
	public void unpaused();
	
	public StateType getState();
}
