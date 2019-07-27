package kareltherobot;
  
public class DrawSquare_CalebRollins implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);

		// Let's only use one variable bob for all robots
	   	BetterRobot_CalebRollins bob;
		bob = new MoveRightRobot_CalebRollins(2, 2, North, infinity);
		bob.draw5BeeperLine();
		bob.turnOff();

		// Here is an example of using the MoveLeftRobot
		bob = new MoveLeftRobot_CalebRollins (6,6, North,infinity);  // You decide what parameters to pass this robot
		bob.draw5BeeperLine();
		bob.turnOff();

		// Keep reassigning bob to the other robots.  All types of robots must be used at least once.
		bob = new MoveLeftRobot_CalebRollins (2,6, East,infinity);
		bob.draw5BeeperLine();
		bob.turnOff();
		
		bob = new MoveRightRobot_CalebRollins (6,2, East,infinity);
		bob.draw5BeeperLine();
		bob.turnOff();
		
		bob = new DiagonalRightRobot_CalebRollins (2,2, North,infinity);
		bob.draw5BeeperLine();
		bob.turnOff();
		
		bob = new DiagonalLeftRobot_CalebRollins (2,6, North,infinity);
		bob.draw5BeeperLine();
		bob.turnOff();
		
	}
}


