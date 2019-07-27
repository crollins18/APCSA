package kareltherobot;

import kareltherobot.*;

// Ch5 ex. 11 (pages 133-134) - Carpet small rooms
public class CarpetLayer_CalebRollins extends SmartBot_CalebRollins
{
	public CarpetLayer_CalebRollins (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	// The layCarpet() method should lay carpet (put down a beeper) if there is a small room


			
	
	public boolean wallIsToLeft() {
		
		faceWest();
		
		if (! frontIsClear()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean wallIsUp() {
		
		faceNorth();
		
		if (! frontIsClear()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public boolean wallIsToRight() {
		
		faceEast();
		
		if (! frontIsClear()) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	
	
	
	public void checkRoom() {
		
		if (wallIsToLeft() && wallIsUp() && wallIsToRight()) {
			
			putBeeper();
			faceSouth();
			move();
			faceEast();
		}
		
		else {
			
			faceSouth();
			move();
			faceEast();
		}
		
		
		
		
	}
		
			
			
			
	public void layCarpet()
	{
		move();
		turnLeft();
		move();
		checkRoom();
	






	}
}