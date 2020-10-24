package assignment_9;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		System.out.println("enter the address");
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String fn = Character.toUpperCase(a.charAt(0))+a.substring(1,a.indexOf("_"));
		String ln = Character.toUpperCase(a.charAt(a.indexOf("_")+1))+a.substring(a.indexOf("_")+2,a.indexOf("@"));
		String dom = a.substring(a.indexOf("@")+1, a.indexOf("."));
		String topLevDom = a.substring(a.indexOf(".")+1);
		
		System.out.println("First name: "+fn+"\nLast name: "+ln+"\nDomain: "+dom+"\nTop-Level Domain: "+topLevDom);

	}

}
