package assignment_9;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("Do you have US driving licene?");
		String dl = s.next();
		if(dl.equalsIgnoreCase("no")) {
			System.out.println("invalid data");
			System.exit(0);
		}

	}

}
