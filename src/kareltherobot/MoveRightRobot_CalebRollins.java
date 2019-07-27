package kareltherobot;

import java.awt.Color;

public class MoveRightRobot_CalebRollins extends BetterRobot_CalebRollins
{
	public MoveRightRobot_CalebRollins (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move() {
			
			turnRight();
			super.move();
			turnLeft();
			
		}
	
	
}
