package assignment.week1;

public class IsPrimeNumber {

    public static void main(String[] args) {
        int n = 28;
        // It assumes the number is prime at the start (true).
        // Its value changes only if we find evidence that the number is not prime.
        boolean isPrimeNumber = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        if (isPrimeNumber) {
            System.out.println("The number is a Prime Number");
        } else {
            System.out.println("The number is not a Prime Number");
        }
    }
}
