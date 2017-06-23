package battleship.ai;

import battleship.enums.AiInterfaceType;
import battleship.model.Map;
import battleship.model.ShotPosition;

public interface AiInterface {
	
	public ShotPosition evaluate(Map map);
	
	public AiInterfaceType getAiInterfaceType();
	
}
