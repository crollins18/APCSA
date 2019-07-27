package kareltherobot;

import java.awt.Color;

public class Gardener_CalebRollins extends BetterRobot_CalebRollins
{
	public Gardener_CalebRollins (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}
	
	public void drawLine4 () {
		
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
	}
	
	public void drawLine3 () {
		
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		
	}
	
	
	public void turnLFT() {
		
		turnLeft();
	}
	
	public void turnRT() {
		
		turnRight();
		
	}


	public void plantBeepers() {
		
		drawLine4();
		turnLFT();
		drawLine3();

		
	}
	
	
	



}