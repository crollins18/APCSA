package kareltherobot;

import java.awt.Color;

public class DiagonalRightRobot_CalebRollins extends BetterRobot_CalebRollins
{
	public DiagonalRightRobot_CalebRollins (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move() {
		
		super.move();
		turnRight();
		super.move();
		turnLeft();

	}

}
