package ListingTigaDua;

import java.util.*;

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//get first input 
		System.out.print("What is your name?\n");
		String name = in.nextLine();
		
		//get second input
		System.out.print("How old are you?\n");
		int age = in.nextInt();
		
		//display output on console 
		System.out.println("Hello, " + name + ". New Year, you will be " + (age + 1));
		in.close();
	}
}

