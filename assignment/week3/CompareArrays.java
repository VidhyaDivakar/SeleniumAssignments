package assignment.week3;

//A probram to compare two arrays and find the matching elements

public class CompareArrays {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int lengthOfa = a.length;
		
		int b[]= {1,2,8,4,9,7};
		int lengthOfb = b.length;
		
		//Used the print statement above the loop so that it will print only once
		System.out.println("The matching elements in array a and b are: ");
		// next for loop as we have two arrays to check
		for (int i = 0; i <lengthOfa; i++) {
			for (int j = 0; j < lengthOfb; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]+ " ");
				}
				
			}
			
		}

		
	}

}
