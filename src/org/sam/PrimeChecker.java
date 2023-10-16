package org.sam;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a prime number
        boolean isPrime = isPrimeNumber(number);

        // Print the result
        if (isPrime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
