package gridworld;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class MoveLeftActor_CalebRollins extends Actor
{
	public void act()
	{
		if (this.getLocation().getCol() != 0)
			this.moveTo(new Location(this.getLocation().getRow(), this.getLocation().getCol()-1));
		else
			this.moveTo(new Location(this.getLocation().getRow(), 9));

		
	}
}