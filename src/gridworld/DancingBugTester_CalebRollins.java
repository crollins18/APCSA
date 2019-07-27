package gridworld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class DancingBugTester_CalebRollins {

	public static void main(String[] args) {

		int[] list = {1,2,0,0,4,0};
		DancingBug_CalebRollins d = new DancingBug_CalebRollins(list);
		ActorWorld a = new ActorWorld(new BoundedGrid(20,20));
		a.add(new Location (9,9), d);
		a.show();
	}

}
