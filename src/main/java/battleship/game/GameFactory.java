package battleship.game;

import battleship.core.statepattern.IApplicationContext;
import battleship.enums.BattleShipMode;
import battleship.game.impl.SingleGame;

public class GameFactory {

	public IGame createGame(IApplicationContext applicationContext) {
		
		BattleShipMode battleShipMode = applicationContext.getGameMode();
		
		switch (battleShipMode)
		{	
			case SINGLE:
				
				return createSingleGame();
	
			case MULTIPLAYER:
				
				return createMultiplayerGame();
		
				default:
					throw new RuntimeException("doesn't supported yet");
		}
		
	}
	
	public SingleGame createSingleGame() {
		
		SingleGame singleGame = new SingleGame();
		
		singleGame.setFirstPlayer(null);
		singleGame.setSecondPlayer(null);
		
		return singleGame;
	
	}
	
	public SingleGame createMultiplayerGame() {
		
		return null;
		
	}
	
}
