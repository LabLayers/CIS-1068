/*
 * CIS 1068 - Professor Pirmann
 * Supplied Code for Lab 9
 * 
 * @author Victor Lourng
 * 
 * ONLY ADJUST CODE WITH A COMMENT. OR SOMETHING NECESSARY TO IMPLEMENT THE ALGORITHMS. 
 * DO NOT CHANGE ANY OF THE EXISTING FRAMEWORK FOR TESTING UNLESS EXPLICITLY TOLD TO.
 */

import java.util.Random;
import java.util.Arrays;

public class Lab9{

	public static void main(String args[]){
		
		Random rand = new Random();
		
		// Creates an array of size 1000, then randomizes the array by increasing each int by a factor of 0 to 4. This mean that the highest nuber is 4999.
		//creates an array of size 1,000 in random increasing order. [DO NOT CHANGE THIS]
		int[] arr = new int[1000];
		int length = arr.length;
		
		
		for(int i = 1; i <= length; i++){
			arr[i-1] = rand.nextInt(5) + (5 * (i-1));	
		}
		// ----------------------------------------------
		
		
		//SECTION 1 - test 1st Algorithm 10,000 times and print out average comparisons[YOU MUST IMPLEMENT] 
		//as well as average runtime. [implemented for you]
		
		//CREATE SUM VARIABLE HERE TO RECORD TOTAL NUMBER OF COMPARISONS  *REPLACE*
		long duration_sum1 = 0;
		long comparisons_sum1 = 0;
		
		for(int i = 0; i < 10000; i++){
			int index = rand.nextInt(1000);
			
			long startTime = System.nanoTime();
			
			// USE METHOD HERE.		*REPLACE*
			long comparisons = Method1(arr,index);
			
			long duration = System.nanoTime() - startTime;
			
			comparisons_sum1 += comparisons;
			duration_sum1 += duration;
		}
		
		//PRINT OUT AVERAGE COMPARISONS HERE.	*REPLACE*
		long average_comparisons1 = comparisons_sum1 / 10000;
		System.out.println("Average number of comparisons for 1st algorithm: " + average_comparisons1);

		long average_duration1 = duration_sum1 / 10000;
		System.out.println("Average time in nanoseconds that the 1st algorithm took: " + average_duration1);
		// ---------------------------------------------------------------------------------------
		
		
		System.out.println();		//FORMATTING LINE
		
		
		//SECTION 2 - test 2nd Algorithm 10,000 times and print out average comparisons[YOU MUST IMPLEMENT].
		// as well as average runtime. [implemented for you]
		
		//CREATE SUM VARIABLE HERE TO RECORD TOTAL NUMBER OF COMPARISONS 	*REPLACE*s
		long duration_sum2 = 0;
		long comparisons_sum2 = 0;

		for(int i = 0; i < 10000; i++){
			int index = rand.nextInt(1000);
			
			long startTime = System.nanoTime();
			
			//USE METHOD HERE		*REPLACE*
			long comparisons = Method2(arr,index);

			long duration = System.nanoTime() - startTime;
			comparisons_sum2 += comparisons;
			duration_sum2 += duration;
		}
		
		//PRINT OUT AVERAGE COMPARISONS HERE.	*REPLACE*
		long average_comparisons2 = comparisons_sum2 / 10000;
		System.out.println("Average number of comparisons for 2nd algorithm: " + average_comparisons2);

		long average_duration2 = duration_sum2 / 10000;
		System.out.println("Average time in nanoseconds that the 2nd algorithm took: " + average_duration2);
		// ---------------------------------------------------------------------------------------
		
		
		System.out.println(); 		//FORMATTING LINE
		
		
		//SECTION 3 - test 3rd Algorithm 10,000 times and print out average comparisons[YOU MUST IMPLEMENT]
		// as well as average runtime. [implemented for you]
		
		//CREATE SUM VARIABLE HERE TO RECORD TOTAL NUMBER OF COMPARISONS 	*REPLACE*
		
		long duration_sum3 = 0;
		long comparisons_sum3 = 0;

		
		for(int i = 0; i < 10000; i++){
			int index = rand.nextInt(1000);
			
			long startTime = System.nanoTime();

			//USE METHOD HERE		*REPLACE*
			long comparisons = Method3(arr,index);

			long duration = System.nanoTime() - startTime;
			comparisons_sum3 += comparisons;
			duration_sum3 += duration;
		}
		
		//PRINT OUT AVERAGE COMPARISONS HERE. 	*REPLACE*
		long average_comparisons3 = comparisons_sum3 / 10000;
		System.out.println("Average number of comparisons for 3rd algorithm: " + average_comparisons3);

		long average_duration3 = duration_sum3 / 10000;
		System.out.println("Average time in nanoseconds that the 3rd algorithm took: " + average_duration3);
		// ---------------------------------------------------------------------------------------
	}
	
	
	//ALGORITHM METHODS SHOULD BE IMPLEMENTED DOWN HERE. 
	public static long Method1 (int[] arr, int query) {
		long comparisons = 0;
		for (int index = 0; index < arr.length; index++) {
			comparisons++;
			if (arr[index] == query) {
				return comparisons;
			}
		}
		
		// If not found
		return comparisons;
	}
	
	public static long Method2 (int[] arr, int query) {
		long comparisons = 0;

		for (int index = 0; index < arr.length; index+=100) {
			comparisons++;
			if (index >= query) {
				int[] arr2 = Arrays.copyOfRange(arr, index, index+100);
				comparisons += Method1(arr2, query);
				return comparisons;
			}
		}
		
		// If not found
		return comparisons;
	}
	
	public static long Method3 (int[] arr, int query) {
		long comparisons = 1;
		
		int min = 0;
		int max = arr.length*5 -1;


		while (min <= max) {
			int guess = min + ((max-min)/2); // (int)Math.floor(max/2);
			comparisons++;
			if (guess < query) {
				min = guess + 1;
			} else if (guess > query) {
				max = guess - 1;
			} else { //  (guess == query) {
				return comparisons;
			}
		}
		
		// If not found
		return comparisons;
	}
}
