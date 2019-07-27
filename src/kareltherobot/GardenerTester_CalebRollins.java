package kareltherobot;

import java.awt.Color;

public class GardenerTester_CalebRollins implements Directions
{
	public static void main(String args[])  
	{

		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("gardenerWorld.txt");
		World.setSize(10, 10);
		
		Gardener_CalebRollins botA = new Gardener_CalebRollins (2, 5, North, 7);
		Gardener_CalebRollins botB = new Gardener_CalebRollins (5, 9, West, 7);
		Gardener_CalebRollins botC = new Gardener_CalebRollins (9, 6, South, 7);
		
		Supervisor_CalebRollins alex;
		alex = new Supervisor_CalebRollins(6,2,East, 7, botA, botB, botC);
		alex.plantGarden();
		alex.plantSupervisor();
		
		// Construct a new Gardener robot, pass it the 3 GardenerHelper robots, and position it to help plant one of the corners.
		// Look at MoveChoregrapherTester as an example client class
		// Send the Gardener robot the message to plant the entire garden 

	}
}


