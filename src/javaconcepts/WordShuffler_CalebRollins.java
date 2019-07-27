package javaconcepts;

public class WordShuffler_CalebRollins 
{
	// Use this method signature
	// The parameter is a 2-dim array of words
	// The method will return a 2-dim array of shuffled words

	int row;
	int col;
	String first;
	String temp1;
	String temp2;
	String temp3;
	String temp4;
	String temp5;
	String temp6;
	String temp7;
	String temp8;
	char ch;
	
	public String[][] shuffleWords(String[][] words) 
	{
		
	
		for (row = 0; row<words.length; row++) {
			
			for (col = 0; col<words[0].length; col++) {
				
				
				char ch = words[row][col].charAt(0); 
			
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					
					if (col == 0) {
						
						if (row == 0) {
							
							temp4 = words[row][col];
							words[row][col] = temp4;
													
							
						}
						
						else {
							
							temp5 = words[row][col];
							temp6 = words[row-1][col];
							words[row-1][col]  = temp5;
							words[row][col] = temp6;
							
							
						}
						
					}
					
					else {
						
						temp7 = words[row][col];
						temp8 = words[row][col-1];
						words[row][col-1] = temp7;
						words[row][col] = temp8;
						
						
					}
					
					
				}
				
				else {
					
					temp1 = words[row][col].substring(0, 1);
					temp2 = words[row][col].substring(1, words[row][col].length()-1);
					temp3 = words[row][col].substring(words[row][col].length()-1);
					
					words[row][col] = temp3 + temp2 + temp1;
					
				}			
			
			}
	
		}
		
	return words;
	
	}	

}
	