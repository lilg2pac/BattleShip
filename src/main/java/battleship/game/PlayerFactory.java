package battleship.game;

import battleship.core.statepattern.IApplicationContext;
import battleship.enums.BattleShipMode;

public class PlayerFactory {

	public void createPlayer(IApplicationContext applicationContext) {
		
		BattleShipMode battleShipMode = applicationContext.getGameMode();
		
		switch (battleShipMode) {
			case SINGLE:
				
				break;
	
			default:
				break;
		}
		
	}
	
}
