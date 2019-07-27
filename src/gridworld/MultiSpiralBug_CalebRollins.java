package gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class MultiSpiralBug_CalebRollins extends Bug{
	
	private int initSideLength;
	private int endSideLength;
	private int rowOffSet;
	private int colOffSet;
	private int steps= 0;
	private int turns = 0;
	private int absoluteSideLength;
	
	public MultiSpiralBug_CalebRollins(int inInitSideLength, int inEndSideLength, int inRowOffSet, int inColOffSet) {
		
		initSideLength = inInitSideLength;
		endSideLength = inEndSideLength;
		rowOffSet = inRowOffSet;
		colOffSet = inColOffSet;
		
		absoluteSideLength = initSideLength;
		
	}
	
	public void act() {
        if (steps < absoluteSideLength && canMove()) {
        	
        	super.move();
        	steps++;
        	
        }
        else {
        	super.turn();
        	super.turn();
        	steps=0;
        	turns++;
        	if (absoluteSideLength < endSideLength) {
        		
        		absoluteSideLength++;
        	}
        	else {
        		super.moveTo(new Location(getLocation().getRow()+rowOffSet, getLocation().getCol()+colOffSet));
        		absoluteSideLength = initSideLength;
        		steps = 0;
        		turns = 0;
        		this.setDirection(this.getDirection()+270);
        	}
        }
		
	}
	
	

}
