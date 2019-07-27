package kareltherobot;
import kareltherobot.*;

public class Supervisor_CalebRollins extends Gardener_CalebRollins
{
	private Gardener_CalebRollins gardenerA;
	private Gardener_CalebRollins gardenerB;
	private Gardener_CalebRollins gardenerC;

	public Supervisor_CalebRollins (int st,int av, Direction dir, int numBeepers, Gardener_CalebRollins botA, Gardener_CalebRollins botB, Gardener_CalebRollins botC)	
	{
		// Look at MoveChoreographer and use it as an example to fill in this constructor method		
	super (st, av, dir, numBeepers);
	gardenerA = botA;
	gardenerB = botB;
	gardenerC = botC;
	
	}
	
	public void plantGarden() {
		gardenerA.plantBeepers();
		gardenerB.plantBeepers();
		gardenerC.plantBeepers();

		
	}
	
	public void plantSupervisor() {
		
		plantBeepers();
	}
	
	
	// Create a method to use the three Gardeners to plant 3 of the 4 corners of the garden
	// The Supervisor robot should also help and plant one of the four corners.



}
