/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 3-28-24
*
*Description: This lab explores the concept of recursion. We first ask the user for number of rows they want to create a pyramid. We then write a simple recursive 
*method that returns the number of "pins" that is needed to draw it. We then actually draw the pyramid with the help of a helper method. 
*/
import java.util.*;
public class MartinLab8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//declarations
		int rows;
		String choice;
		
		heading();
		do {
			System.out.print("Enter the number of rows in the pyramid: ");
			rows = input.nextInt();
			
			//draws the pyramid
			printPyramid(rows);
			
			System.out.println();
			
			System.out.println("Number of pins in a pyramid with " + rows + " rows is " + NumberOfPins(rows));
			System.out.println();
			
			System.out.print("Do it again, yes (or no) ");
			choice = input.next();
			
		}while(!choice.equalsIgnoreCase("No")) ;
	}
	//recursive number of pins method
	public static int NumberOfPins(int rows) {
		//base case
		if(rows == 0) {
			return 0;
		}
		//base case
		else if(rows == 1) {
			return 1;
		}
		//where the recursive calls for num of pins
		else {
			rows += NumberOfPins(rows-1) ;
			return rows;
		}
	}
	
	
	//non-recursive printPyramid method that the main method takes 
	public static void printPyramid(int rows) {
		printPyramid(rows, 0) ;
	}
	//recursive method that outputs the pins, used to output neatly
	private static void printPyramid(int rows, int blanks) {
		//base case
		if(rows == 0) {
			return;
		}
		//wheres the recursive works
		else {
			//we must do the recursive call first since we want 1 star at the top
			printPyramid(rows - 1, blanks + 1);
			
			//blanks loop is first since the spaces go before the stars
			for(int i = 0 ; i < blanks; i++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < rows ; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
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

Enter the number of rows in the pyramid: 5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

Number of pins in a pyramid with 5 rows is 15

Do it again, yes (or no) yes
Enter the number of rows in the pyramid: 7
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
* * * * * * * 

Number of pins in a pyramid with 7 rows is 28

Do it again, yes (or no) no
*/
