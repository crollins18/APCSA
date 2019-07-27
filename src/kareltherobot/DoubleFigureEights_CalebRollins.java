package kareltherobot;

import java.awt.Color;

public class DoubleFigureEights_CalebRollins implements Directions
{
	public static void main(String [] args)
	{
		World.setVisible(true);
		World.readWorld("doubleFigureEightsWorld.txt");
		World.showSpeedControl(true);
		//World.setBeeperColor(Color.RED);
		World.setWorldColor(Color.WHITE);
		
		UrRobot l = new UrRobot(5, 3, North, 0, Color.red);
		UrRobot r = new UrRobot(5, 8, North, 0, Color.blue);

		// Enter your code here.   Note that robots should alternate movements
		
		l.pickBeeper();
		r.pickBeeper();
		l.turnLeft();
		r.turnLeft();
		r.turnLeft();
		r.turnLeft();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.turnLeft();
		l.turnLeft();
		l.turnLeft();
		r.turnLeft();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.turnLeft();
		l.turnLeft();
		l.turnLeft();
		r.turnLeft();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.turnLeft();
		r.turnLeft();
		r.turnLeft();
		r.turnLeft();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.turnLeft();
		r.turnLeft();
		r.turnLeft();
		r.turnLeft();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.turnLeft();
		r.turnLeft();
		r.turnLeft();
		r.turnLeft();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.turnLeft();
		r.turnLeft();
		r.turnLeft();
		r.turnLeft();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.turnLeft();
		l.turnLeft();
		l.turnLeft();
		r.turnLeft();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.turnLeft();
		l.turnLeft();
		l.turnLeft();
		r.turnLeft();
		l.pickBeeper();
		r.pickBeeper();
		l.move();
		r.move();
		l.pickBeeper();
		r.pickBeeper();
		l.turnLeft();
		l.turnLeft();
		l.turnLeft();
		r.turnLeft();
		
		
	}

}
