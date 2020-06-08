package classwork;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Is your input a number or a word");
		String reply = input.next();
		if(reply.equals("number")) {
			System.out.println("Enter a number");
			int number = input.nextInt(), reversedInput = 0, remainder, originalInput;
			originalInput = number;
			while(number != 0) {
				remainder = number % 10;
				reversedInput = reversedInput * 10 + remainder;
				number  /= 10;
			}
			if(originalInput == reversedInput){
				System.out.println(originalInput + "is a palindrome");
			}
			else {
				System.out.println(originalInput + "is not a palindrome");
			}
		}
		else if(reply.equals("word")){
			System.out.println("Enter a word");
			String word= input.next();
			int l = word.length();
			char a;
			String b = "";
	        for(int i = 0;i < l;i++) {
	        	a = word.charAt(i);
	        	b = a + b;
	        }
	       if(word.equals(b)) {
	        		System.out.println("The word you entered is a palindrome");
	        	}
	       else {
	        		System.out.println("The word you entered is not a palindrome");
	        	}
	        }
		else {
			System.out.println("Incorrect input");
		}
		
	}

}
