package kareltherobot;

import java.awt.Color;

public class LetterRobot_CalebRollins extends BetterRobot_CalebRollins
{
	public LetterRobot_CalebRollins (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}
	
	public void movePutBeeper()
	
	{
		move();
		putBeeper();
		
	}
	

	public void drawLongLine4()
	{
		movePutBeeper();
		movePutBeeper();
		movePutBeeper();
		movePutBeeper();
		
	}
	
	public void drawLongLine3()
	{
		movePutBeeper();
		movePutBeeper();
		movePutBeeper();
		
	}
	
	public void drawLongLine2()
	{
		movePutBeeper();
		movePutBeeper();
		
	}
	

	public void drawH()
	{
	putBeeper();
	drawLongLine4();	
	turnRight();
	turnRight();
	move();
	move();
	turnLeft();
	drawLongLine3();
	turnRight();
	move();
	move();
	turnLeft();
	turnLeft();
	putBeeper();
	drawLongLine4();
	}
	
	public void repositionRobot1() 
	{
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	public void repositionRobot2() 
	{
		move();
		move();
		move();
		move();
		move();
		move();
		move();
		turnRight();
		move();
		turnLeft();
	}
	
	public void repositionRobot3() 
	{
		move();
		move();
		move();
		turnRight();
		move();
		move();
		move();
		move();
		turnRight();
		turnRight();
	}


	public void drawE()
	{
		turnLeft();
		putBeeper();
		drawLongLine3();
		turnRight();
		drawLongLine4();
		turnRight();
		turnRight();
		move();
		move();
		turnLeft();
		drawLongLine2();
		turnLeft();
		turnLeft();
		move();
		move();
		turnRight();
		move();
		move();
		turnRight();
		drawLongLine3();
		
		
		
		
		
		// Insert your code here to draw the E.  If you see yourself repeating code,
		// then you should create a method for the repeated code and call that method here.
	

	}

	// Create other methods as necessary to perform repetitive tasks.  Do not redefine methods that
	// you need to use but have already been defined in a parent class.


}
