package battleship.core.statepattern.statemanager.impl;

import battleship.core.statepattern.IApplicationContext;
import battleship.core.statepattern.IState;
import battleship.enums.StateType;
import battleship.game.GameFactory;
import battleship.game.IGame;

public class GameState implements IState {
	
	private IGame game;

	public void load() {
		// TODO Auto-generated method stub
		
	}

	public void unload() {
		// TODO Auto-generated method stub
		
	}

	public void init(IApplicationContext applicationContext) {
		GameFactory gameFactory = new GameFactory();
		game = gameFactory.createGame(applicationContext);
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void render() {
		// TODO Auto-generated method stub
		
	}

	public void paused() {
		// TODO Auto-generated method stub
		
	}

	public void unpaused() {
		// TODO Auto-generated method stub
		
	}

	public StateType getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
