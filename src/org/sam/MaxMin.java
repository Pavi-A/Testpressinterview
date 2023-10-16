package org.sam;

public class MaxMin {

	public static void main(String[] args) {
		        int[] numbers = {54, 546, 548, 60};

		        // Find the maximum and minimum elements in the array
		        int max = findMax(numbers);
		        int min = findMin(numbers);

		        // Print the maximum and minimum elements
		        System.out.println("Maximum element: " + max);
		        System.out.println("Minimum element: " + min);
		    }

		    // Function to find the maximum element in the array
		    public static int findMax(int[] arr) {
		        if (arr.length == 0) {
		            throw new IllegalArgumentException("The array is empty.");
		        }
		        int max = arr[0];
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }
		        return max;
		    }

		    // Function to find the minimum element in the array
		    public static int findMin(int[] arr) {
		        if (arr.length == 0) {
		            throw new IllegalArgumentException("The array is empty.");
		        }
		        int min = arr[0];
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		            }
		        }
		        return min;
		    }
		}


	

