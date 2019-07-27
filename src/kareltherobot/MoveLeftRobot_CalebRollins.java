package kareltherobot;

import java.awt.Color;

public class MoveLeftRobot_CalebRollins extends BetterRobot_CalebRollins
{
	public MoveLeftRobot_CalebRollins (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move() {
		
		turnLeft();
		super.move();
		turnRight();
		
	}
	
}
