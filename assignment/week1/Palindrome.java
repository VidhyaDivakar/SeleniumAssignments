package assignment.week1;

//This program checks if a given number is a palindrome.
//A palindrome is a number that reads the same backward as forward, such as 121 or 12321.
public class Palindrome {

    public static void main(String[] args) {
        int input = 123321;
        int output = 0;
        // Using a for loop to reverse the digits of the input number.
        for (int i = input; i > 0; i = i / 10) {
            // The below line extracts the last digit of 'i' and appends it to 'output'.
            int reminder = i % 10;
            output = output * 10 + reminder;
        }
        if (output == input)
            System.out.println("Output: It is Palindrome (because the number reads the same backward and forward)");
        else {
            System.out.println("Output: It is not a Palindrome (since the reversed number, is not the same as original)");
        }
    }
}