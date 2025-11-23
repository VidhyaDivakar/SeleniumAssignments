package assignment.week3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] set = {1,4,3,2,8,6,7};
		int lengthOfset = set.length;
		
		Arrays.sort(set); //{1,2,3,4,6,7,8}
		//this loop has i values 1,2,3,4,5,6,7,8; The length of the array is 7; so the loop runs untill i=7
		//since the array index starts from 0, 
		for (int i = 1; i <= lengthOfset; i++) {
			//array[i - 1] = array[1 - 1] = array[0] = 1; if checks i= or != array[0]; which is 1=1, so the loop continues untill
			// it finds a mismatch		
			if (i!=set[i-1]) {			
			System.out.println("The missing number is : " + i);
			break;					
			
		}			
				
	}

}
}
