package assignment_9;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		tipCalculator(false, 0, 0, null);
		
}

	public static void tipCalculator(boolean isSplit,int numberOfPeople, double checkAmount, String serviceQuality) {
	Scanner scan=new Scanner(System.in);
		
		System.out.println("Split:");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("yes")) {
			isSplit=true;
		}
		
		System.out.println("Number of people:");
		numberOfPeople=scan.nextInt();
		
		System.out.println("Check amount:");
	    checkAmount=scan.nextDouble();
		
		System.out.println("Service Quality:");
		serviceQuality=scan.next();
		
		double totalTip=0;
		double totalPay=0;
		double totalPerPerson=0;
		double tipPerPerson=0;
		
		// WRITE YOUR CODE HERE
		System.out.print("Number of people entered: ");
		int i = 1;
		while(i<=numberOfPeople) {

		System.out.print("&");
		i++;}
		System.out.println();
		if(serviceQuality.equalsIgnoreCase("poor")) {
		totalTip=checkAmount*0.05;
		}if(serviceQuality.equalsIgnoreCase("fair")) {
		totalTip=checkAmount*0.1;
		}else if(serviceQuality.equalsIgnoreCase("good")) {
		totalTip=checkAmount*0.15;
		}else if(serviceQuality.equalsIgnoreCase("great")) {
		totalTip=checkAmount*0.2;
		}else if (serviceQuality.equalsIgnoreCase("excellent")) {
				totalTip=checkAmount*0.25;}
if(isSplit){
	System.out.println("Total to pay: "+(checkAmount+totalTip));
	System.out.println("Total tip: "+totalTip);
	System.out.println("Total per person: "+((checkAmount+totalTip)/numberOfPeople));
	System.out.println("Tip per person: "+(totalTip/numberOfPeople));
	return;
}
System.out.println("Total to pay: "+(checkAmount+totalTip));
System.out.println("Total tip: "+totalTip);
}

		
	}
