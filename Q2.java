package assignment_9;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		int price = 0,  screenPlus= 0, cpuPlus = 0, ramPlus = 0, storagePlus = 0, screenSizePlus = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("select screen size");
		String scr = scan.next();
		if(scr.equals("13.3"))screenPlus=200;
		else if(scr.equals("15"))screenPlus=300;
		else if(scr.equals("17"))screenPlus=400;
		
		System.out.println("select cpu type");
		String cpu = scan.next();
		if(cpu.equalsIgnoreCase("i3"))cpuPlus = 150;
		else if(cpu.equalsIgnoreCase("i5"))cpuPlus = 250;
		else if(cpu.equalsIgnoreCase("i7"))cpuPlus = 350;
		System.out.println("select ram size");
		int  ram = scan.nextInt();
		ramPlus = (ram/4)*50;
		
		System.out.println("select storage type");
		String sto = scan.next();
		System.out.println("enter memory size");
		int size = scan.nextInt();
		
		if (sto.equalsIgnoreCase("hdd"))storagePlus = size/500*50;
		if(sto.equalsIgnoreCase("ssd"))storagePlus = size/500*100;
	
		System.out.println("enter screen resolution");
		String sc = scan.next();
		if(sc.equalsIgnoreCase("fullhd"))screenPlus = 100;
		if(sc.equalsIgnoreCase("4k")) screenPlus = 200;
		
		
		System.out.println("laptop price is: $"+(200+screenPlus+cpuPlus+ramPlus+storagePlus+screenSizePlus));

	}

}
