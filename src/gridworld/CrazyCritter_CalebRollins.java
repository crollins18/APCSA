package gridworld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class CrazyCritter_CalebRollins extends Critter
{
	Grid<Actor> gr;	
	ArrayList<Actor> actors;
	
	public CrazyCritter_CalebRollins()
	{
		setColor(Color.GREEN);
	}
	
	//getActors will return all actors around this critter that are directly in front, 
	//directly behind, directly right or directly left of where CrazyCritter is facing
	public ArrayList<Actor> getActors()
	{
		gr = getGrid();
		actors = new ArrayList<Actor>();
		Location front = getLocation().getAdjacentLocation(getDirection() + 0);
		Location left = getLocation().getAdjacentLocation(getDirection() +270);
		Location below = getLocation().getAdjacentLocation(getDirection() + 180);
		Location right = getLocation().getAdjacentLocation(getDirection() + 90);
		if(gr.get(front) != null) {
		actors.add(gr.get(front));
		}
		if(gr.get(below) != null) {
		actors.add(gr.get(below));
		}
		if(gr.get(left) != null) {
		actors.add(gr.get(left));
		}
		if(gr.get(right) != null) {
		actors.add(gr.get(right));
		}
		return actors;

	}
	public boolean canMoveTwoFromLoc(Actor a, Location loca)
	{

	 Location loc = loca;
	 Location next = loc.getAdjacentLocation(a.getDirection());
	 Location next2 = next.getAdjacentLocation(a.getDirection());
	 if (!gr.isValid(next2))
		 return false;
	 Actor neighbor2 = gr.get(next2);
	 return (neighbor2 == null);

	 } 

	public boolean isSameColor(Color c, Actor a) {
		
		if (getColor().equals(a.getColor())) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void move(Actor a) {

		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location next2 = next.getAdjacentLocation(getDirection());
		if (gr.isValid(next2)) {
		 a.moveTo(next2);
		}
	}
	
	//If the selected actors have the same color as CrazyCritter, CrazyCritter will make 
	//them turn 90 degrees.  If any of the selected actors are not the same color as CrazyCritter, 
	//then make them move two locations away from CrazyCritter, in the direction that CrazyCritter 
	//would have to go to get to the actor.  If the actor cannot move two locations away from CrazyCritter 
	//because the location is occupied or there is a wall, then it should turn orange instead.	
	public void processActors(ArrayList<Actor> actors)
	{
		System.out.println(actors);
		for(int i=0; i<actors.size(); i++) {
			if(isSameColor(getColor(), actors.get(i))) {
				actors.get(i).setDirection(actors.get(i).getDirection() + Location.RIGHT);
			}
			else {
				if(canMoveTwoFromLoc(actors.get(i), getLocation()) && (!(actors.get(i) instanceof Flower))) {
					move(actors.get(i));
				}
				else {
					actors.get(i).setColor(Color.ORANGE);
				}
			}
			
		}
		
		
	}
	
}
