package battleship.ai;

import battleship.core.statepattern.IApplicationContext;

public class AiInterfaceFactory {
	
	public AiInterface createAiInterface(IApplicationContext applicationContext) {
		
		switch (applicationContext.getGameMode()) {
			case SINGLE:
				
				break;
	
		}
		
		return null;

	}

}
