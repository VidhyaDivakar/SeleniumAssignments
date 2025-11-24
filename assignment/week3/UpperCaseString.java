package assignment.week3;

import java.util.Iterator;

public class UpperCaseString {

	public static void main(String[] args) {
		String test = "changeme";
		
		int lengthOftest = test.length();
		{
		char [] testArray = test.toCharArray();
		System.out.println("The odd index values in Array 'testArray' are: ");
		
		for (int i = 0; i<lengthOftest ; i++) {
			// this will find the odd index values, divides all the i values (0,1,2,3,4,5,6) by 2 
			// and % function finds the reminder, so all the odds does not have zero has the reminder
			if(i%2 != 0) {
		System.out.print("- "+ testArray[i]);
			
		}
		}
	
		}
	}
}
