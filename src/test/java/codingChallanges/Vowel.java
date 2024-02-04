package codingChallanges;

public class Vowel {

	public static void main(String[] args) {

		// First I create a object from the string class and I passed the value

		String vowel = new String("Welcome to globalTek");
		for (int i = 0; i < vowel.length(); i++) {
			if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o'
					|| vowel.charAt(i) == 'u') {
				System.out.println(vowel.charAt(i));
			}
		}

	}

}
