package kareltherobot;

import java.awt.Color;

public class MountainClimbers_CalebRollins implements Directions
{
	public static void main(String [] args)
	{
		World.setVisible(true);
		World.readWorld("mountainPeakWorld.txt");
		World.setSize(20, 20);
		World.showSpeedControl(true);
		// World.setBeeperColor(Color.RED);
		// World.setNeutroniumColor(Color.GRAY);
		World.setWorldColor(Color.WHITE);

		UrRobot karel = new UrRobot(1, 1, North, 1);
		UrRobot mountainMan = new UrRobot(1, 16, North, 1);
		
		//First Robot
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnOff();
		
		//Second Robot
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.putBeeper();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.move();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.turnLeft();
		mountainMan.turnOff();
		
	}
}
