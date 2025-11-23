package assignment.week3;

public class ReverseString {

	public static void main(String[] args) {
		String companyName="TestLeaf";
//		Use appropriate method to convert the String into a character array.
		char[] charArray = companyName.toCharArray();
		int lengthOfString = companyName.length();
		for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);}
		{
			//Reverse loop to print revere string
		for (int i = lengthOfString-1; i >=0; i--) {
			System.out.println(charArray[i]);
		}
	}
	}
}
	
