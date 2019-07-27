package kareltherobot;

import java.awt.Color; 

public class MazeWalkerTester_CalebRollins implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("mazeWalkerWorld.txt");

	   	MazeWalker_CalebRollins bob;
	   	bob = new MazeWalker_CalebRollins(2, 2, North, 0);
		bob.followWallRight();
	   	bob.turnOff();
	   	
	   	bob = new MazeWalker_CalebRollins(7, 2, North, 0);
		bob.followWallRight();
	   	bob.turnOff();

	   	bob = new MazeWalker_CalebRollins(7, 7, North, 0);
		bob.followWallRight();
	   	bob.turnOff();

	   	bob = new MazeWalker_CalebRollins(2, 7, North, 0);
		bob.followWallRight();
	   	bob.turnOff();
	   	
	}	
}

