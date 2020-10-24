package assignment_9;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.next();
		if(word.length()>=5) {
			int a =word.length()/2;
			System.out.println(word.substring(a-1, a+2));
		}else System.out.println("invalid");

	}

}
