/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-22-24
*
*Description: This lab creates a new txt file and prompts the user ask them how many numbers to fill the file with. We fill the file using a PrintWriter.
*the numbers are created by using math.random.
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException ;
public class MartinLab5 {
public static void main(String[] args) throws IOException {
	//declarations
	String fileName = "" ;
	Scanner input = new Scanner(System.in);
	
	heading() ;
	boolean keepGoing = true;
	do {
		//prompt user to type an output file name 
		System.out.print("Enter an output file name: ");
		fileName = input.next() ;

		//creates a printWriter 
		File file = new File(fileName) ;
		PrintWriter fileWriter = new PrintWriter(file) ;

		//prompt user to ask how many numbers in this certain file
		System.out.print("How many numbers to write to the file ");
		int n = input.nextInt() ;

		//for loop to write the random numbers on the file
		//5 numbers on each line
		for(int i = 0 ; i < n ; i++) {

			if(i % 5 == 0) {
				fileWriter.println();
				fileWriter.print((int)(Math.random() * 1000) + 1) ;
				fileWriter.print("\t");
			} else {
				fileWriter.print((int)(Math.random() * 1000) + 1) ;
				fileWriter.print("\t");
			}
		}

		//close the printWriter when done.
		fileWriter.close() ;
		
		System.out.print("Would you like to do it again? yes or no ");
		String choice = input.next();
		if(choice.equalsIgnoreCase("no")) {
			keepGoing =false;
		}
	} while(keepGoing) ;
	}

public static void heading() {
	System.out.println("Programmer: Hunter Martin") ;
	System.out.println("Course: COSC 211 Winter'24") ;
	System.out.println("Lab#: 5");
	System.out.println("Due date: 2-22-2024") ;
	System.out.println() ;
}
		}

/**
 * Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 5
Due date: 2-22-2024

Enter an output file name: lab5A.txt
How many numbers to write to the file 17
Would you like to do it again? yes or no YES
Enter an output file name: lab5B.txt
How many numbers to write to the file 21
Would you like to do it again? yes or no no

lab5A.txt
403	741	657	54	956	
876	109	512	2	519	
534	46	195	733	30	
377	179	

lab5B.txt
486	74	668	499	786	
699	194	632	993	756	
229	664	884	813	386	
917	301	572	9	920	
52
*/
