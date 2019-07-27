package javaconcepts;
  
import javax.swing.JOptionPane;

public class TestScores_CalebRollins 
{
	int maxScores;
	int tempTestScore;
	int[] scores;
	int[] correctedScores;
	int validScore;
	
	public void inputScores() 
	{
		
	
	maxScores = 10;
	scores = new int[10];
	validScore = 0;
	String entered = null;
	tempTestScore = 0;
	
	for (int i=0; i<maxScores; i++) {
		
		
		entered = JOptionPane.showInputDialog("Enter a score between 0 and 110 (enter 999 to finish)");
		tempTestScore = Integer.parseInt(entered);
		
		if (tempTestScore >= 0 && tempTestScore<= 110) {
			
			scores[i] = tempTestScore;
			validScore = validScore + 1;
		}
		
		if (tempTestScore == 999) {
			
			break;
	
		}
		
		if (tempTestScore> 110 && tempTestScore !=999) {
			
			JOptionPane.showMessageDialog(null, "Please enter a grade between 0 and 110");
			i = i - 1;
			
		}
		
	  }
	
	}
	
	public void processScores()
	{
		getCorrected();
		printCorrected();
		printLowest();
		printHighest();
		printAvg();
	}
	
	public void getCorrected()
	{
	correctedScores= new int[validScore];
		for (int i =0; i<validScore; i++) {
			
			correctedScores[i] = scores[i];
			
		}
	
	}
	
	public void printCorrected() {
		
		int i;
		System.out.print("Here are the scores you entered: ");
		
		for (i = 0; i<correctedScores.length -1; i++) {
			
			System.out.print(correctedScores[i] + ", ");
			
		}
		
		System.out.println(correctedScores[i]);
		
		
		
	}
	
	public void printHighest() {
		int maxSoFar = correctedScores[0];
		
		for (int i=1; i<correctedScores.length; i++) {
			
			if (correctedScores[i] > maxSoFar) {
				
				maxSoFar = correctedScores[i];
			}
			
		}
		
		System.out.println("The highest score entered is: " + maxSoFar);
		
	} 
	
	public void printLowest() {
		int lowSoFar = correctedScores[0];
		
		for (int i=1; i<correctedScores.length; i++) {
			
			if (correctedScores[i] < lowSoFar) {
				
				lowSoFar = correctedScores[i];
			}
			
		}
		
		System.out.println("The lowest score entered is: " + lowSoFar);
		
	} 
	
	public void printAvg() {
		
		int sum = 0;
		double avg;
		
		for (int i=0; i<correctedScores.length; i++) {
			
			sum = sum + correctedScores[i];
			
		}
		
		avg = sum/validScore;
		System.out.println("The average score entered is: " + avg);
		
		
	}
}