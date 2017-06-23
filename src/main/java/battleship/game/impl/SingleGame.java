package battleship.game.impl;

import battleship.core.statepattern.IApplicationContext;
import battleship.game.IGame;
import battleship.model.AbstractPlayer;
import battleship.model.Map;

public class SingleGame implements IGame {

	private Map map;
	
	private AbstractPlayer firstPlayer;
	
	private AbstractPlayer secondPlayer;
	
	public void setFirstPlayer(AbstractPlayer firstPlayer) { this.firstPlayer = firstPlayer; }
	
	public void setSecondPlayer(AbstractPlayer secondPlayer) { this.secondPlayer = secondPlayer; }
	
	public void setMap(Map map) {
		this.map = map;
	}
	
	public void init(IApplicationContext applicationContext) {
		
	}

	public void update() {

		
	}

	public void render() {
		
		
	}

}
