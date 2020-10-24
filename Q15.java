package assignment_9;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String a=s.next();
		int counter1 = 0;
		int counter2 = 0;
		if(a.contains("cat")) {
			String b = a;
			while(b.contains("cat")) {
				
				counter1++;
				b = b.substring(b.indexOf("cat")+3);
			}}
			while(a.contains("dog")) {
				counter2++;
				a = a.substring(a.indexOf("dog")+3);
			}
		if(counter1!=counter2)System.out.println("false");
		else if(counter1==0||counter2==0)System.out.println("false");
		else System.out.println("true");

			
		}
		
		
		}
		


