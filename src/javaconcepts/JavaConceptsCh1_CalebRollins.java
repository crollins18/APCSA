// This assignment will give you practice with printing text to the console.  You will need to know
// how to use the System.out.print() and println() methods.
package javaconcepts;

public class JavaConceptsCh1_CalebRollins 
{

	// Print out YOUR answers to the following review exercises on page 28 of the Java Concepts book:
	// R1.2, R1.4, R1.7, R1.12 
	public static void answersToReviewExercises()
	{
		System.out.println("R1.2: What distinquishes a computer from a typical household appliance?");
		System.out.println("Computers can be programmed, can remember things, or can do things. On the other hand appliances can only do things");
		System.out.println(" ");
		System.out.println("R1.4: What is a Java Virtual Machine?");
		System.out.println("A java Virtual Machine or JVM takes the high level code and converts it into machine readable code to a .class file");
		System.out.println(" ");
		System.out.println("R1.7: What is a console window?");
		System.out.println("The console window is where text can be printed to, aswell as where errors are displayed");
		System.out.println(" ");
		System.out.println("R1.12: What do the following programs print?  Don't guess.  Write a program to find out.");
		System.out.println("3 + 4");
		System.out.println("7");
		System.out.println("34");
		System.out.println("");
	}
	
	// Exercise P1.2 facePainter method (page 29 in Java Concepts book)
	// Write a method that prints a face using text characters, hopefully looking better than the one in the textbook 
	public static void facePainter()
	{
		System.out.println("   /////  ");
		System.out.println("  | O O | ");
		System.out.println(" (|  ^  |) ");
		System.out.println("  | [ ] | ");
		System.out.println("   ----- ");
		
	}

	// Exercise P1.3 ticTacToeBoard method (page 29 in Java Concepts book)
	// Write a method that prints the tic-tac-toe board.  Use looping to get full credit.
	
	
	public static void ticTacToeBoard()
	{
		
		
		for (int i=1; i<=3; i++) {
			
			System.out.println("+---+---+---+");
			System.out.println("|   |   |   |");
			

		}
	
		System.out.println("+---+---+---+");
		
	}

}
