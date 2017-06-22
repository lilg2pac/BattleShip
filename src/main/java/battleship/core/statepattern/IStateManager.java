package battleship.core.statepattern;

public interface IStateManager {
	
	public IState pop();
	
	public IState peek();
	
	public void push(IState state);
	
	public void handle();
	
	public void paused();
	
	public void unpaused();
}
