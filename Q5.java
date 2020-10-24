package assignment_9;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String word1 = scan.next();
		String word2 = scan.next();
		if(word1.length()==3&&word2.length()==3) {
			for(int i = 0 ;i<3;i++) {
				System.out.print(word1.charAt(i));
				System.out.print(word2.charAt(i));
			}
		}else System.out.println("cannot merge");

	}

}
