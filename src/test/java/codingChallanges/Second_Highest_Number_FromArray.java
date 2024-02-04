package codingChallanges;

import java.util.Arrays;

public class Second_Highest_Number_FromArray {
	
	// How to find out the second highest number from array?

		public static void main(String[] args) {
	    // Ans: First I have to initialize the array.
			int[] num = { 20, 100, 40, 50, 70, 90, 60 };
			// Then I have to sort the number. If there are any unorganized number there.
			Arrays.sort(num);
			System.out.println(Arrays.toString(num));
			// With the help of array variable find out the length. Then -2 and 
			// store the into  the int variable. 
			//so that I can get the result of second highest number.
			int highest = num[num.length - 2];
			System.out.println(highest);

		}

	}


