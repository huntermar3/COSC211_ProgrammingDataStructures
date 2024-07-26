/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-15-24
*
*Description: This lab take 10 integers and stores them into an array list. We find duplicates and remove them from the list. We find the min
*and max values within the array list. 
*/

import java.util.Scanner ;
import java.util.ArrayList;
import java.util.Collections;

public class MartinLab4 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//declarations
	ArrayList<Integer> numsList = new ArrayList<>() ;
	int nums ;
	String choice = "" ;
	
	heading() ;
	
	boolean keepGoing = true ;
	while(keepGoing) {
	
	//intro entering 10 integers
	System.out.print("Please enter 10 integers. ") ;
	for(int i = 0 ; i < 10 ; i++) {
		nums = input.nextInt();
		numsList.add(nums) ;
	}
		
	//output the sum
	System.out.println("The sum of the integer: " + sum(numsList)) ;
		
	//remove all the duplicates
	removeDuplicate(numsList) ;
	System.out.print("The distinct integers are: ") ;
	for(int i = 0 ; i < numsList.size() ; i++) {
		System.out.print(numsList.get(i) + " ") ;
	}
		
	System.out.println();
	
	//smallest num / largest num in the arraylist
	int min = Collections.min(numsList) ;
	int max = Collections.max(numsList) ;
	System.out.println("The largest integer is: " + max) ;
	System.out.println("The smallest integer is: " + min) ;
	
	//to continue or discontinue the program
	System.out.print("Would you like to do it again, yes or no? ") ;
	choice = input.next() ;
		
	//if the user says no
	if(choice.equalsIgnoreCase("no")) {
		keepGoing = false;
	}
		System.out.println();
		
		//when working with arraylist we must clear the list after using it
		numsList.clear();
		}
		}
		

//methods used in program
public static int sum(ArrayList<Integer> list) {
	int sum = 0 ;
	for(int i = 0 ; i < list.size() ; i++) {
		sum += list.get(i) ;
		}
		return sum ;
		}
	
	//method for removing duplicates 
public static void removeDuplicate(ArrayList<Integer> list) {
	ArrayList<Integer> temp = new ArrayList<>();
	for(int i = 0 ; i < list.size() ; i++) {
		if(!temp.contains(list.get(i))) {
			temp.add(list.get(i)) ;
			}
				}
			list.clear();
	for(int j = 0 ; j < temp.size() ; j++) {
		list.add(temp.get(j)) ;
		}
		}
		
public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211 Winter'24") ;
		System.out.println("Lab#: 4");
		System.out.println("Due date: 2-15-2024") ;
		}


	}

/*
 * Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 4
Due date: 2-15-2024
Please enter 10 integers. 18 5 7 18 6 5 6 18 10 5
The sum of the integer: 98
The distinct integers are: 18 5 7 6 10 
The largest integer is: 18
The smallest integer is: 5
Would you like to do it again, yes or no? YES

Please enter 10 integers. 8 15 7 18 7 5 6 8 8 100
The sum of the integer: 182
The distinct integers are: 8 15 7 18 5 6 100 
The largest integer is: 100
The smallest integer is: 5
Would you like to do it again, yes or no? yeS

Please enter 10 integers. 20 20 20 20 20 20 20 20 20 20
The sum of the integer: 200
The distinct integers are: 20 
The largest integer is: 20
The smallest integer is: 20
Would you like to do it again, yes or no? No
 */


