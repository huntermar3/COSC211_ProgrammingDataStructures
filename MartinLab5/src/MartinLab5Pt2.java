/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-22-24
*
*Description: This lab is a part 2 to lab 5 where we create a new file and wrote contents to that file. In this part we will do the opposite
*and recieve data from a txt file and print them to the screen with 5 numbers being read at a time on the screen.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections ;

public class MartinLab5Pt2 {
public static void main(String[] args) {
	//declarations
	String fileName = "" ;
	ArrayList<Integer> nums = new ArrayList<>() ;
	Scanner input = new Scanner(System.in) ;
	
	heading() ;
	boolean keepGoing = true;
	while(keepGoing) {
		//prompt the user to enter a file name
		System.out.print("Enter an input file name ") ;
		fileName = input.next() ;
		
		try {
			File file1 = new File(fileName) ;
			Scanner fileScanner = new Scanner(file1) ;
			if(file1.exists()) {
				
				//if it exist we want read the contents of the file and store them into an arraylist
				while(fileScanner.hasNextInt()) {
					nums.add(fileScanner.nextInt()) ;
				}
				//we need to sort the arraylist we just filled
				Collections.sort(nums);

				//loop through the arraylist and print the nums within the list
				for(int i = 0 ; i < nums.size() ; i++) {
					if(i % 5 == 0) {
						System.out.println();
						System.out.print(nums.get(i) + "\t") ;
					} else {
						System.out.print(nums.get(i) + "\t") ;
					}
				}
				keepGoing = false;
			}
		} catch (FileNotFoundException e) {
			System.out.print("Bad file name, try again ");
			keepGoing = true;
		}
			}
		}

public static void heading() {
	System.out.println("Programmer: Hunter Martin") ;
	System.out.println("Course: COSC 211 Winter'24") ;
	System.out.println("Lab#: 5");
	System.out.println("Due date: 2-22-2024") ;
	System.out.println() ;
}
		}

/*
 * Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 5
Due date: 2-22-2024

Enter an input file name lab5BB.txt
Bad file name, try again Enter an input file name lab5C.txt
Bad file name, try again Enter an input file name lab5B.txt

9	52	74	194	229	
301	386	486	499	572	
632	664	668	699	756	
786	813	884	917	920	
993	

Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 5
Due date: 2-22-2024

Enter an input file name lab5A.txt

2	30	46	54	109	
179	195	377	403	512	
519	534	657	733	741	
876	956	

*/
