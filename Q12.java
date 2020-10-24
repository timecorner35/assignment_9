package assignment_9;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.next();
		
		if(word.contains("x")||word.contains("X")) {
			word = word.replace("x", "");
			word = word.replace("X", "");
		}
		System.out.println(word);
	}

}
