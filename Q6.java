package assignment_9;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("enter a word");
			String a = scan.next();
			if(a.length()<5)System.out.println("too short");
			else if(a.length()>5)System.out.println("too long");
			else {
				for(int i =a.length()-1;i>=0;i--) {
					System.out.print(a.charAt(i));
				}
			}
	}

}
