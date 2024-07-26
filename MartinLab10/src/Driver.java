/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 4-11-24
*
*Description: This is the driver that test the methods we created in randomdrawing. Not going to lie this took me much longer than I antipcated. 
*
*/
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		//declarations
		Scanner input = new Scanner(System.in);
		String choice;

		//the two required objects of type RandomDrawing
		RandomDrawing<Integer> listInts = new RandomDrawing<>();
		RandomDrawing<String> listStrings = new RandomDrawing<>();
		heading();

		//adding values from sample output
		listInts.add(35);
		listInts.add(12);
		listInts.add(100);
		listInts.add(10);
		listInts.add(72);

		//adding values from sample output
		listStrings.add("Nancy");
		listStrings.add("Cathy");
		listStrings.add("Tom");
		listStrings.add("David");
		listStrings.add("Anna");
		listStrings.add("Adam");


		//tell the user whats inside the box
		System.out.println("The contents of the integer box (toString method): "); ;
		System.out.println(listInts.toString());
		System.out.println();
		

		//tell the user what is in the box
		System.out.println("The contents of the string box (toString method): ") ;
		System.out.println(listStrings.toString());
		System.out.println();
	
		
		do {
			//we have to clone the box 
			RandomDrawing<Integer> cloneInts = listInts.clone();
			RandomDrawing<String> cloneStrings = listStrings.clone();

			//doing the drawing
			System.out.println("Drawing from the integer box: ");
			while(!cloneInts.isEmpty()) {
				System.out.print(cloneInts.drawItem() + "  ");
			}
			System.out.println();
			System.out.println();

			//doing the drawing for the string box 
			System.out.println("Drawing from the string box: ") ;
			while(!cloneStrings.isEmpty()) {
				System.out.print(cloneStrings.drawItem() + "  ");
			}
			System.out.println();
			System.out.println();

			//ask user to go again
			System.out.print("Would you like to do it again? ");
			choice = input.next();

		}while(choice.equalsIgnoreCase("yes"));
	}
	
	public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211 Winter'24") ;
		System.out.println("Lab#: 10");
		System.out.println("Due date: 4-11-2024") ;
		System.out.println() ;
	}
	
}
/*
 * Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 10
Due date: 4-11-2024

The contents of the integer box (toString method): 
35 12 100 10 72 

The contents of the string box (toString method): 
Nancy Cathy Tom David Anna Adam 

Drawing from the integer box: 
100  72  12  10  35  

Drawing from the string box: 
Adam  Nancy  Tom  David  Anna  Cathy  

Would you like to do it again? yes
Drawing from the integer box: 
10  35  100  72  12  

Drawing from the string box: 
Nancy  Anna  Adam  Tom  Cathy  David  

Would you like to do it again? yes
Drawing from the integer box: 
72  35  12  100  10  

Drawing from the string box: 
Nancy  Anna  David  Cathy  Adam  Tom  

Would you like to do it again? no

 */

