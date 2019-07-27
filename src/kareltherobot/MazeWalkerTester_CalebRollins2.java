package kareltherobot;

import java.awt.Color; 

public class MazeWalkerTester_CalebRollins2 implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("mazeWorld_CalebRollins.txt");

	   	MazeWalker_CalebRollins_2 bob;
	   	bob = new MazeWalker_CalebRollins_2(1, 1, North, 0);
		bob.completeMaze();
	   	bob.turnOff();
	   	
	}	
}

