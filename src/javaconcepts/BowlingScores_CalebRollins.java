package javaconcepts;

// BowlingScores is used to practice using parallel arrays and 2-dimensional arrays

public class BowlingScores_CalebRollins 
{
	int row;
	int col;
	int i;
	double personalAvg;
	int tempHighest = 0;
	int tempLowest = 300;
	int value;
	String personHighest;
	String personLowest;
	int sum = 0;
	int count = 0;
	double avg;
	
	public void printScores() 
	{
		String[] bowlers = {"Kirsten", 
							"Roland", 
							"Caspian", 
							"Philokrates", 
							"Ziya", 
							"Veselko"};
		
		int[][] scores = {{155, 190, 180, 120},
							{95, 92 ,100 ,103},
							{200, 175, 223, 202},
							{105, 75, 80, 92},
							{122, 140, 161, 110},
							{90, 100, 130, 135}};
		
		for (row=0; row<bowlers.length; row++) {
			
			personalAvg = 0;
			
			System.out.print(bowlers[row] + " bowled games of ");
			
			for (i = 0; i<scores[row].length-1; i++) {
				
				System.out.print(scores [row][i] + ", ");
				
				personalAvg = personalAvg + scores [row][i];
				
			}
			
			System.out.print(scores [row][i] + ".");
			
			personalAvg = personalAvg + scores [row][i];

			personalAvg = personalAvg/4;
			
			System.out.print(" " + bowlers[row] + "'s average is " + personalAvg);
			
			System.out.println("");
			
		}
		
		for (row = 0; row<scores.length; row++) {
			
			for (col = 0; col<scores[row].length; col++) {
				
				value = scores[row][col];
				
				if (value < tempLowest) {
					tempLowest = value;
					personLowest = bowlers[row];
				}
				
			}
			
			
		}
		
		System.out.println(personLowest + " had the lowest score of " + tempLowest + ".");
		
		for (row = 0; row<scores.length; row++) {
			
			for (col = 0; col<scores[row].length; col++) {
				
				value = scores[row][col];
				
				if (value > tempHighest) {
					tempHighest = value;
					personHighest = bowlers[row];
				}
				
			}
			
			
		}
		
		System.out.println(personHighest + " had the highest score of " + tempHighest + ".");
	
		
		for (row = 0; row<scores.length; row++) {
			
			for (col = 0; col<scores[row].length; col++) {
				
				value = scores[row][col];
				
				sum = sum + value;
				
				count = count + 1;
				
			}
			
			
		}
		
		avg = sum/count;
		
		System.out.println("The average score for all of the bowlers is " + avg + ".");

		

	} 
	
}