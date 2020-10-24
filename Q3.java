package assignment_9;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=s.next();
		if(word.length()%2!=0) {
			if(word.length()>=3) {
				System.out.println(word.charAt(word.length()/2));
			}else if(word.length()==1) {
				for(int i=0;i<3;i++) {
					System.out.print(word.charAt(0));
				}
			}
		}else {
			if(word.length()==2) {
			System.out.println(word+word);
			}else if(word.length()>=4) {
					int a = word.length()/2;
					System.out.println(word.substring(a-1, a+1));		
				}
			

	}

}}
