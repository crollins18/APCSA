package gridworld;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

public class MultiSpiralBugTester_CalebRollins {

	public static void main(String[] args) {
		
		   ActorWorld world = new ActorWorld(new UnboundedGrid());
	        MultiSpiralBug_CalebRollins alice = new MultiSpiralBug_CalebRollins(3,9,10,-10);
	        world.add(new Location(7, 8), alice);
	        alice.act();
	        world.show();
		
	}

}
