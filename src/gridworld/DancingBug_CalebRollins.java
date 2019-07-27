package gridworld;

import info.gridworld.actor.Bug;

public class DancingBug_CalebRollins extends Bug {
	
	private int[] turns;
	private int countTurns=0;
	private int toTurn;
	private int i=0;
	
	public DancingBug_CalebRollins(int[] nums) {
		
		turns=nums;
		
	}
	
	public void act() {
		toTurn = turns[i];
		
		for(int j=0; j<toTurn; j++) {
			
			super.turn();
			
		}
		super.move();
		
		if (i == turns.length-1) {
			
			i=0;
		}
		else {
		i++; }
	}

}
