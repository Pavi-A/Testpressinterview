package org.sam;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int N = scanner.nextInt();
		        		int reversedNumber = 0;
		        while (N != 0) {
		            int digit = N % 10;
		            reversedNumber = reversedNumber * 10 + digit;
		            N /= 10;
		        }
             System.out.println("Reversed number: " + reversedNumber);

		       
		        scanner.close();
		    }
		


	}


