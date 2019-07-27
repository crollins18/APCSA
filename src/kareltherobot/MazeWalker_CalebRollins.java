package kareltherobot;

import kareltherobot.*;

//Ch5 Ex. 9 - followWallRight() method
public class MazeWalker_CalebRollins extends SmartBot_CalebRollins
{
	public MazeWalker_CalebRollins (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	// The followWallRight() method assumes that there is a wall directly to the robot's right to begin with
	// Look at ex. 9 in the book (pages 132-133) and make sure it handles the four situations.
	// Hint: Before coding, look at the four situations and see what is the same and different for each.
	// Start with the initial situation for each robot.  How could you use an if statement to determine if they are
	// in a specific situation? 
	// This can be done with an if statement that includes nested if statements.
	public void followWallRight() 
	{
		if (frontIsClear()) {
			
			move();
			turnLeft();
			turnLeft();
			turnLeft();
			
			if (frontIsClear()) {
				
				move();
				turnLeft();
				turnLeft();
				turnLeft();
				
				if (frontIsClear()) {
					
					move();
				}
				
				else {
					
					turnLeft();
				}
			}
			
			
			
			else {
				
				turnLeft();
			}
			
		}
		
		else {
			
			turnLeft();

			
			}
		
	}
	
}
