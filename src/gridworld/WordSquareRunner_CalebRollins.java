package gridworld;


public class WordSquareRunner_CalebRollins
{
   public static void main(String[] args)
   {
		WordSquare_CalebRollins words = new WordSquare_CalebRollins("Word square");
		words.show();
	
		words = new WordSquare_CalebRollins("AP Computer Science is fun");
		words.show();
		
		words = new WordSquare_CalebRollins("Spring Break is here");
		words.show();
		
		words = new WordSquare_CalebRollins("HELP");
		words.show();
		
		words = new WordSquare_CalebRollins("10SNE1");
		words.show();
		
		words = new WordSquare_CalebRollins("1 2 3 4 5 6 7 8 9 10 11");
		words.show();
		//Add more test cases to test strings of different lengths */
   }
}