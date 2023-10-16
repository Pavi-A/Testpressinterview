package org.sam;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class LargestValue {

	public static void main(String[] args) {
		     
		        int[] numbers = {54, 546, 548, 60};

		     
		        String[] numberStrings = new String[numbers.length];
		        for (int i = 0; i < numbers.length; i++) {
		            numberStrings[i] = Integer.toString(numbers[i]);
		        }

		     
		        Comparator<String> customComparator = new Comparator<String>() {
		            @Override
		            public int compare(String str1, String str2) {
		                String s1 = str1 + str2;
		                String s2 = str2 + str1;
		                return s2.compareTo(s1); 
		            }
		            
		        };
		      
		        Arrays.sort(numberStrings, customComparator);

		    
		        StringBuilder largestValue = new StringBuilder();
		        for (String numberString : numberStrings) {
		            largestValue.append(numberString);
		        }

		      
		        BigInteger result = new BigInteger(largestValue.toString());

		     
		        System.out.println("Largest Value: " + result);
		    }
		

		    }
		


	


