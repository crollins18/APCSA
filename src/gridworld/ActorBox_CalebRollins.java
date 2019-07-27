package gridworld;

import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import java.awt.Color;


public class ActorBox_CalebRollins
{
	
	
	
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		//add code here to make a box and diagonals
		//select one of the two ActorBox output options
		
		for (int r=0; r<10; r++) {
			
			for (int c=0; c<10; c++) {
				
				if ((r==0 && c==0) || (r==0 && c==9) || (r==9 && c==0) || (r==9 && c==9)) {
					
					world.add(new Location(r,c), new Rock());
				}
				
				if (r==c) {
					
					world.add(new Location(r,c), new Rock());
					
				}
				
				if (r+c == 9) {
					
					world.add(new Location(r,c), new Rock());

				}
				
				if (r == 0 && (c != 0) && (c !=9)) {
					
					world.add(new Location(r,c), new Critter());

				}
				
				if (c==0 && r!=0 && r!=9) { 
					world.add(new Location(r,c), new Actor());

					
				}
				
				if (r==9 && c!=0 && c!=9) { 
					world.add(new Location(r,c), new Flower());

				}
				
				if (c==9 && r!=0 && r!=9) {
					world.add(new Location(r,c), new Bug());
					
				}
				
			}
			

		}
		
		world.show(); 
	}
}