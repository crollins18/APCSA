package kareltherobot;

import kareltherobot.*;

// Ch6 Exercise - for loops - create a 6x6 square of beepers
public class BeeperSquare_CalebRollins extends SmartBot_CalebRollins
{
	public BeeperSquare_CalebRollins (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	// You need to use at least one for loop to create the square
	public void drawLine()
	
	{
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		turnLeft();
		
	}
	
	
	
	public void drawSquare()
	{
		drawLine();	
		drawLine();
		drawLine();
		drawLine();



	}
}
