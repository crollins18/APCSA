package kareltherobot;

public class GroceryShopper_CalebRollins implements Directions
{
	public static void main(String [] args)
	{
		World.setVisible(true);
		World.readWorld("groceryWorld.txt");
		World.setSize(10, 10);
		World.showSpeedControl(true);

		UrRobot shopper = new UrRobot(5, 7, East, 0);
		
		shopper.turnLeft();
		shopper.turnLeft();
		shopper.move();
		shopper.move();
		shopper.pickBeeper();
		shopper.move();
		shopper.turnLeft();
		shopper.turnLeft();
		shopper.turnLeft();
		shopper.move();
		shopper.pickBeeper();
		shopper.move();
		shopper.turnLeft();
		shopper.move();
		shopper.pickBeeper();
		shopper.turnLeft();
		shopper.turnLeft();
		shopper.turnLeft();
		shopper.move();
		shopper.pickBeeper();
		shopper.turnLeft();
		shopper.turnLeft();
		shopper.move();
		shopper.move();
		shopper.move();
		shopper.turnLeft();
		shopper.move();
		shopper.move();
		shopper.move();
		shopper.move();
	}
}
