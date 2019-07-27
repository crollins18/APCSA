package graphicalapp;

import javax.swing.JFrame;

public class Pac_Man_Viewer_CalebRollins
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.setSize(600, 600);		//Set frame size
		frame.setTitle("PACMAN");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pac_Man_Component_CalebRollins component = new Pac_Man_Component_CalebRollins();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}