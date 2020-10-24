package assignment_9;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		System.out.println("enter the address");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		if(a.contains("_")) {
			System.out.println(a.substring(a.indexOf("_")+1,a.indexOf("@"))+"_"+a.substring(0,a.indexOf("_"))+a.substring(a.indexOf("@")));
		}else System.out.println(a);

	}

}
