package kareltherobot;

// Ch5 ex. 11 (pages 133-134) - Carpet small rooms
public class CarpetLayerTester_CalebRollins implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		World.readWorld("carpetLayerWorld.txt");

	   	CarpetLayer_CalebRollins bob;
	   	bob = new CarpetLayer_CalebRollins(1, 1, East, infinity);
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.layCarpet();
	   	bob.turnOff();
	}	
}
