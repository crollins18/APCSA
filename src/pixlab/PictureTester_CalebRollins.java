package pixlab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester_CalebRollins
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture_CalebRollins caterpillar = new Picture_CalebRollins("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.mirrorVerticalRightToLeft();
	  beach.explore();
	  
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture_CalebRollins temple = new Picture_CalebRollins("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testZeroRedStdForLoop() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.zeroRedStdForLoop();
	  beach.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture_CalebRollins canvas = new Picture_CalebRollins("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture_CalebRollins swan = new Picture_CalebRollins("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
	  
  }
  
  public static void testNegate() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
	  
  }
  
  public static void testGrayscale() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
	  
  }
  
  public static void testMirrorHorizonal() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontal();
	  beach.explore();
	  
  }
  
  public static void testMirrorHorizontalBotToTop() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("beach.jpg");
	  beach.explore();
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
	  
	  
  }
  
  public static void testMirrorDiagonal() {
	  
	  Picture_CalebRollins beach = new Picture_CalebRollins("redMotorcycle.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
	  
	  
  }
  
  
  public static void testMirrorArms() {
	  Picture_CalebRollins beach = new Picture_CalebRollins("snowman.jpg");
	  beach.explore();
	  beach.mirrorArms();
	  beach.explore();
	  
	  
  }
  
  public static void testMirrorGull() {
	  Picture_CalebRollins beach = new Picture_CalebRollins("seagull.jpg");
	  beach.explore();
	  beach.mirrorGull();
	  beach.explore();
	  
	  
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
	//testZeroRedStdForLoop();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorDiagonal();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontalBotToTop(); 
	//testMirrorHorizonal();
    //testMirrorTemple();
	//testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}