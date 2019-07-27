package kareltherobot;

import java.awt.Color;

public class LetterRobotDriver_CalebRollins implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.setBeeperColor(Color.BLUE);
		World.setDelay(30);
		World.setSize(20, 20);

	   	LetterRobot_CalebRollins bob = new LetterRobot_CalebRollins(1, 1, North, infinity);
		bob.setVisible(false);
	   	bob.drawH();
		bob.repositionRobot1();
		bob.drawE();
		bob.repositionRobot2();
		bob.drawE();
		bob.repositionRobot3();
		bob.drawH();
		// new instruction
		
		// Insert code here to have Bob move to a new position and draw another H or E
		// Create another robot and have it create another H or E somewhere in the world
		// Make sure that you also test drawing the two letters sideways by having 
		// the robot face either east or west to begin with.
		

	}
}