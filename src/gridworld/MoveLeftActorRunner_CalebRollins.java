package gridworld;
import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class MoveLeftActorRunner_CalebRollins
{
	public static void main(String[] args)
	{
		
		ActorWorld world = new ActorWorld();
		world.show();
		MoveLeftActor_CalebRollins a = new MoveLeftActor_CalebRollins();
		a.setColor(Color.GREEN);
		world.add(new Location(4,9), a);
		a.act();

	}
}