package javaconcepts;
 
import java.util.Random;
import java.util.Scanner;

// DiceRoller allows the user to roll 5 dice and decide how many dice to roll roll.  
// The dice can be rolled 3 times.
public class DiceRoller_CalebRollins 
{
	
	public DiceRoller_CalebRollins()  //Constructor 
	{	
		
	}
	
	public void playGame() {
		
		Random generator = new Random();
		Scanner in = new Scanner (System.in);
		
		int roll = 5;
		int reRoll = 0;

		while (!(roll == 0) && !(reRoll==2)) {
			
			System.out.print("Your rolled the following numbers: " );

			for (int i = 0; i<roll; i++) {
			
				System.out.print(generator.nextInt(6) + 1 + " ");

			}
			
			System.out.println("");
			System.out.print("How many dice would you like to roll roll? Press 0 to end the game.  ");
			roll = in.nextInt();
			reRoll = reRoll + 1;
		
		}
		
		if (reRoll==2) {
		
		System.out.print("Your rolled the following numbers:   " );
		
		for (int i = 0; i<roll; i++) {
			
			System.out.print(generator.nextInt(6) + 1 + " ");

			}
		
	     System.out.println(" ");
		 
		}
		
		System.out.println("*** Thanks for Playing Dice Roller ***");
	}
	
	
	
	
}
