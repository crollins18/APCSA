package javaconcepts;

public class WordShufflerTester_CalebRollins 
{
	// Don't change this tester except to change the values in the 2-dim array
	public static void main(String[] args) 
	{	
		// Here is a 2-dim array to test your method, but you should
		// try your own array with a different number of rows/columns.
		String[][] words = {{"zoom", "old", "young"},
                            {"orange", "eagle", "bat"}}; 
		
		WordShuffler_CalebRollins shuffler = new WordShuffler_CalebRollins();
		String[][] mixedUpWords = shuffler.shuffleWords(words);

		// The following will print out each element of the returned array
		for (int r=0; r<mixedUpWords.length; r++)
		{
			for (int c=0; c<mixedUpWords[r].length; c++)
			{
				System.out.print(mixedUpWords[r][c] + "\t");
			}
			System.out.println(" ");
		}
		
	}

}
