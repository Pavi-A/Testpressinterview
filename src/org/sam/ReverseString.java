package org.sam;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();
		        if (inputString.length() >= 1 && inputString.length() <= 100 && inputString.matches("^[a-z]+$")) {
		            String reversedString = new StringBuilder(inputString).reverse().toString();
		            System.out.println("Reversed string: " + reversedString);
		        } 
		        scanner.close();
		    }
		


	}


