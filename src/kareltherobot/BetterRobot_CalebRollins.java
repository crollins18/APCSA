package kareltherobot;

import kareltherobot.UrRobot;
import kareltherobot.Directions.Direction;

public class BetterRobot_CalebRollins extends Robot
{
	public BetterRobot_CalebRollins(int street, int avenue, Direction direction, int beepers) 
	{
		super(street, avenue, direction, beepers);
	}

	// Create methods for the following:
	// turnRight - turns right (stays on same corner)
	// moveBackward - moves backwards and faces in same direction
	// turnAround - turns the opposite direction (stays on same corner)
	// moveMile - moves one mile, which is 8 street corners
	// moveDecaMile - moves 10 miles (80 corners) 

	public void turnRight()
	{
		this.turnLeft();
		this.turnLeft();
		this.turnLeft();

	}
	
	public void moveBackward()
	{
		this.turnLeft();
		this.turnLeft();
		this.move();
		this.turnLeft();
		this.turnLeft();
		this.move();
		
	}
	
	public void turnAround()
	{
		this.turnLeft();
		this.turnLeft();
	}
	
	public void moveMile() 
	{
		this.move();
		this.move();
		this.move();
		this.move();
		this.move();
		this.move();
		this.move();
		this.move();

	}
	
	public void moveDecaMile() 
	{
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
		this.moveMile();
	}
	
	public void draw5BeeperLine() {
		
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
	}
}