package kareltherobot;

import java.awt.Color;

public class DiagonalLeftRobot_CalebRollins extends BetterRobot_CalebRollins
{
	public DiagonalLeftRobot_CalebRollins (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move() {
		
		super.move();
		turnLeft();
		super.move();
		turnRight();

	}
	
}
