package codingChallanges;

public class Reverse_String {

	public static void main(String[] args) {

		// How to reverse the string without in build method?
		// First I initializing my variable.
		String reverse = "Infosys";
		// Then with the help of variable I call the char array method
		// and store into the char array variable.
		char[] newRev = reverse.toCharArray();
		// Then I create the for loop to decrement the value.
		// This way I can reverse the any kind of string.
		for (int i = newRev.length - 1; i >= 0; i--) {
			System.out.print(newRev[i]);
		}

	}

}
