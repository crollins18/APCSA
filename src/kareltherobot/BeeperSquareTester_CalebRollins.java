package kareltherobot;

//Ch6 Exercise - for loops - create square of beepers
public class BeeperSquareTester_CalebRollins implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		
		BeeperSquare_CalebRollins squareMaker;
		squareMaker = new BeeperSquare_CalebRollins(2, 2, East, infinity);
		squareMaker.drawSquare();
		squareMaker.setVisible(false);

		squareMaker = new BeeperSquare_CalebRollins(4, 4, East, infinity);
		squareMaker.drawSquare();
		squareMaker.setVisible(false);
		World.repaint();
	}	
}


