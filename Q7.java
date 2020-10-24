package assignment_9;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word");
		String a = scan.next();
		if(a.length()%2==0) {
			System.out.println(a.substring(0, a.length()/2));
		}else System.out.println("invalid");

	}

}
