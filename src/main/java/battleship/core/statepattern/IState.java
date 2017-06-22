package battleship.core.statepattern;

public interface IState {
	
	public void load();
	
	public void unload();
	
	public void init();
	
	public void update();
	
	public void render();
	
	public void paused();
	
	public void unpaused();
}
