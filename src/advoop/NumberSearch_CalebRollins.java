package advoop;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch_CalebRollins
{
	private int[] numArray;
	private int searchNum;
	private String direction;

	public NumberSearch_CalebRollins(String[] list)
	{

    numArray = new int[list.length];

		for(int i=0; i<list.length; i++) {

      numArray[i] = (Integer.parseInt(list[i]));

    }	

	}
	
	public void sortNumArray()
	{
		Arrays.sort(numArray);
	}

	public int findNumber(int sNum, String dir)
	{
		sortNumArray();
		searchNum = sNum;
		direction = dir;

    if (direction.equals("-")) {

      if (searchNum < getSmallest(numArray)) {

        return getSearchNum();

      }

      else {

        return getLargestLessThanSearch(searchNum, numArray);

      }

    }

    if (direction.equals("=")) {

      return getClosest(searchNum, numArray);

    }

    if (direction.equals("+")) {

      if (searchNum > getLargest(numArray)) {

        return searchNum;

      }

      else {

        return getSmallestGreaterThanSearch(searchNum, numArray);

      }

    }
		
    return -1;
	}
	
	public int getLargest(int[] inRay) {
		
		int largest = 0;
		for (int i=0; i<inRay.length; i++) {
			
			if (inRay[i] >= largest) {
				
				largest = inRay[i];
			}
			
			
		}
		
		return largest;
	}
	
	public int getSmallest(int[] inRay) {
		
		int smallest= 9999;
		
		for (int i=0; i<inRay.length; i++) {
			
			if (inRay[i] <= smallest) {
				
				smallest = inRay[i];
			}
			
			
		}
		
		return smallest;
		
	}
	
	public int getSearchNum() {
		
		return searchNum;
	}

  public int getLargestLessThanSearch(int inSearch, int[] inRay) {

    int largest = 0;

    for (int i=0; i<inRay.length; i++) {

      if (inRay[i] >= largest && inRay[i] < inSearch) {

        largest = inRay[i];

      }


    }

    return largest;

  }

  public int getSmallestGreaterThanSearch(int inSearch, int[] inRay) {

    int smallest = getLargest(inRay);

    for (int i=0; i<inRay.length; i++) {

      if (inRay[i]<smallest && inRay[i] > searchNum) {

        smallest = inRay[i];

      }

    }

    return smallest;

  }

  public int getClosest(int inSearch, int[] inRay) {

    int closest = getSmallest(inRay);
    for (int i=0; i<inRay.length; i++) {
      if (inRay[i] >= closest && inRay[i] <= searchNum) {

        closest = inRay[i];

      }

    }

    return closest;
  }

	public String toString()
	{
		String output="";
		for(int num : numArray )
		{
			output+=num + " ";
		}
		return output;
	}
}