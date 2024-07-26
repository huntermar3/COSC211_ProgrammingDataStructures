/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 3-28-24
*
*Description: This lab explores the concept of recursion. We convert decimal numbers into its corresponding binary representation.
*Key thing with recursion is if it involves math, write down the formula its much easier to write a recursive method if you have the formula.
*/
import java.util.*;
public class MartinLab8pt2 {

	public static void main(String[] args) {
		//declarations
		Scanner input = new Scanner(System.in);
		String choice;
		
		heading();
		do {
			//prompt user to type number
			System.out.print("Enter a whole number: ");
			int num = input.nextInt();

			System.out.println(num + " in binary is: " + dec2Bin(num));
			System.out.println();
			System.out.print("Do it again, yes(or no)? ");
			choice = input.next();
		}
		while(!choice.equalsIgnoreCase("No"));
	}

	public static String dec2Bin(int n) {
		//empty string we are going to concat to it
		String bin = "" ;
		//base case
		if(n == 0) {
			return "0" ;
		} else {
			//the recursive call is first because when we convert the decimal number to binary we actually read it backwards
			bin = dec2Bin(n/2);
			int remainder = n % 2;
			return bin + remainder;
		}
	}

	public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211 Winter'24") ;
		System.out.println("Lab#: 8");
		System.out.println("Due date: 3-28-2024") ;
		System.out.println() ;
	}
}
/*
 * Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 8
Due date: 3-28-2024

Enter a whole number: 25
25 in binary is: 011001

Do it again, yes(or no)? yes
Enter a whole number: 71
71 in binary is: 01000111

Do it again, yes(or no)? no
*/