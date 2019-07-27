package pixlab;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture_CalebRollins extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture_CalebRollins ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture_CalebRollins(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture_CalebRollins(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture_CalebRollins(Picture_CalebRollins copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture_CalebRollins(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count = count + 1;
      }
    }
    
    System.out.print(count);
  }
  
  public void mirrorArms() {
	  
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 153; row < 191; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 99; col <169 ; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[191 * 2 - row][col];
	        rightPixel.setColor(leftPixel.getColor());
	        count = count + 1;
	      }
	    }
	    
	    for (int row = 169; row < 198; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 239; col <300 ; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[197 * 2 - row][col];
	        rightPixel.setColor(leftPixel.getColor());
	        count = count + 1;
	      }
	    }
	  
	  
  }
  
  public void mirrorGull() {
	  
	  int mirrorPoint = 349;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 228; row < 326; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 231; col < mirrorPoint; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint*2 - col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
	    
	  
	  
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture_CalebRollins fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture_CalebRollins flower1 = new Picture_CalebRollins("flower1.jpg");
    Picture_CalebRollins flower2 = new Picture_CalebRollins("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture_CalebRollins flowerNoBlue = new Picture_CalebRollins(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void zeroRedStdForLoop() {
	  
	  Pixel[][] pixels = getPixels2D();
	  for (int r=0; r<pixels.length; r++) {
		  
		  for (int c=0; c<pixels[0].length; c++) {
			  
			  pixels[r][c].setRed(0);
			  
		  }
		  
	  }
	  
  }
  
  public void keepOnlyBlue() {
	  
	  Pixel[][] pixels = getPixels2D();
	  for (int r=0; r<pixels.length; r++) {
		  
		  for (int c=0; c<pixels[0].length; c++) {
			  
			  pixels[r][c].setRed(0);
			  pixels[r][c].setGreen(0);
			  
		  }
		  
	  }
	  
  }
  
  public void negate() {
	  
	  Pixel[][] pixels = getPixels2D();
	  for (int r=0; r<pixels.length; r++) {
		  
		  for (int c=0; c<pixels[0].length; c++) {
			  
			  pixels[r][c].setRed(255-(pixels[r][c].getRed()));
			  pixels[r][c].setGreen(255-(pixels[r][c].getGreen()));
			  pixels[r][c].setBlue(255-(pixels[r][c].getBlue()));
			  
		  }
		  
	  }
	  
  }
  
  public void grayscale() {
	  
	  Pixel[][] pixels = getPixels2D();
	  for (int r=0; r<pixels.length; r++) {
		  
		  for (int c=0; c<pixels[0].length; c++) {
			  
			  int sumColor = (pixels[r][c].getBlue())+(pixels[r][c].getRed())+(pixels[r][c].getGreen()); 
			  int avg = sumColor/3;
			  pixels[r][c].setRed(avg);
			  pixels[r][c].setGreen(avg);
			  pixels[r][c].setBlue(avg);
			  
		  }
		  
	  }
	  
  }
  
  
  
  public void mirrorVerticalRightToLeft() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
	  
	  
  }
  
  public void mirrorHorizontal() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    int length = pixels.length;
	    
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[length - 1 - row][col];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    } 
	  
  }
  
  public void mirrorDiagonal() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int length = pixels.length;
	    int width = pixels[0].length;

	  
	  for (int row = 0; row<length; row++) {
		  
		  for (int col = 0; col<500; col++) {
			  
			  if (row > col) {
				 
					  
					  leftPixel = pixels[row][col];
					  rightPixel = pixels[col][row];
					  rightPixel.setColor(leftPixel.getColor());
				  
			  }
			  
		  }
		  
	  }
	  
	  
  }
  
  public void mirrorHorizontalBotToTop() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    int length = pixels.length;
	    
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[length - 1 - row][col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
	  
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture_CalebRollins pic = new Picture_CalebRollins("seagull.jpg");
    pic.explore();


  }
  
} // this } is the end of class Picture, put all new methods before this
