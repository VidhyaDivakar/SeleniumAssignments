package assignment.week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int lengthOftext1 = text1.length();
		int lengthOftext2 = text2.length();
		
		for (int i = 0; i < 1; i++) {
				
		if (lengthOftext1 == lengthOftext2)  
		continue;
		
		else {			
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			} 
		}
	
		{
		char [] text1Array = text1.toCharArray();
		
		Arrays.sort(text1Array);
		
		char [] text2Array = text2.toCharArray();
		
		Arrays.sort(text2Array);
		// compares two arrays and checks if the text are same 
		if (Arrays.equals(text1Array, text2Array))  {
				
			System.out.println("The given strings are Anagram.");
				}
		
		else {
					System.out.println("The given strings are not an Anagram.");
			}
		
	    }
	
	}
	
}

	
	
				

	
	


