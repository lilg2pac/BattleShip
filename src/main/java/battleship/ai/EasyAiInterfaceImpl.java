package battleship.ai;

import java.util.Random;

import battleship.enums.AiInterfaceType;
import battleship.model.Map;
import battleship.model.ShotPosition;

public class EasyAiInterfaceImpl implements AiInterface {

	private Random random;
	
	private final int BATTLEFIELD_SIZE_X;
	
	private final int BATTLEFIELD_SIZE_Y;
	
	public EasyAiInterfaceImpl(int BATTLEFIELD_SIZE_X, int BATTLEFIELD_SIZE_Y) {
		random = new Random();
		this.BATTLEFIELD_SIZE_X = BATTLEFIELD_SIZE_X;
		this.BATTLEFIELD_SIZE_Y = BATTLEFIELD_SIZE_Y;
	}
	
	public ShotPosition evaluate(Map map) {
		
		boolean isInvented = false;
		
		ShotPosition shotPosition = new ShotPosition();
		
		while(!isInvented) {
			
			shotPosition.setX(random.nextInt(BATTLEFIELD_SIZE_X));
			shotPosition.setY(random.nextInt(BATTLEFIELD_SIZE_Y));
			
			if(map.isCellEmpty(shotPosition))
			{
				isInvented = true;
			}
		}
		
		return shotPosition;
	}

	public AiInterfaceType getAiInterfaceType() {
		return AiInterfaceType.EASY;
	}

}
