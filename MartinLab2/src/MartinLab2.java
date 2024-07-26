/**
 * Programmer: Hunter Martin
 * Course: COSC 211, W'24
 * Due date: 1-25-24
 * 
 * Description: This lab is two parts. The first part ask user to type in a sentence and then split that 
 * sentence into individual words and store them into an array using split. Returns number of characters, number of
 * words, longest word, and in ascending order. Part 2 of the lab demonstrates BigInteger, and demonstrates how to 
 * use different mathematical processes.
 */

import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;
public class MartinLab2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in) ;
	
	//declarations
	String word;
	heading() ;
	do{
		System.out.print("Please enter a line of text. To quit type quit please. ");
		word = input.nextLine() ;
		System.out.println();
		
		if(!word.equalsIgnoreCase("quit")) {
			//show the user how many characters are in whatever phase they entered
			System.out.println("The number of characters: " + word.length()) ;
	
			//split the phase and store them into an array and then print out num of words
			String[] words = word.split("\\s+");
			System.out.println("The number of words is: " + words.length) ;
		
			//finding the longest word in the array of words
			String longest = "" ;
			for(int i = 0 ; i <  words.length ; i++) {
				if(words[i].length() > longest.length()) {
					longest = words[i] ;
				}	
			}
			System.out.println("The longest word is: "+ longest) ;
	
			//display the words in ascending order, we can print with arr tostring method
			Arrays.sort(words);
			System.out.println("Words in ascending order: " + Arrays.toString(words)) ;
		}
		else {
			System.out.print("Thank you! Bye!");
			System.out.println();
		}
			
		} while (!word.equalsIgnoreCase("quit")); 

	
	
	//part 2 of the lab starts here 
	heading2() ;
	
	//biggest long value 
	BigInteger biggestLong = BigInteger.valueOf(Long.MAX_VALUE) ;
	System.out.println("The biggest possible long value is: "+ biggestLong) ;
	
	//take sqrt and add one
	BigInteger n = biggestLong.sqrt().add(BigInteger.ONE) ;
	
	headerForPart2() ;
	
	//find the first 10 squares > than biggestLong
	for(int i = 0 ; i < 10 ; i++) {
		BigInteger squared = n.pow(2) ;
		System.out.println(n + "\t\t" + squared);
		//we increment this num because n is just going to be just one more
		n = n.add(BigInteger.ONE) ;
	}
	
	}
	//required heading for project
	public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211, W'24") ;
		System.out.println("Lab #: 2, part 1") ;
		System.out.println("Due date: 1-25-24") ;
		System.out.println() ;
	}
	
	//required heading for part 2 of the project
	public static void heading2() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211, W'24") ;
		System.out.println("Lab #: 2, part 2") ;
		System.out.println("Due date: 1-25-24") ;
		System.out.println() ;
	}
	
	//header for part 2 to make my code look a little nicer
	public static void headerForPart2() {
		System.out.println("n\t\t\tn^2") ;
		System.out.println("----------------------------------");
	}
	
	}

/**
 * Programmer: Hunter Martin
Course: COSC 211, W'24
Lab #: 2, part 1
Due date: 1-25-24

Please enter a line of text. To quit type quit please. Hello to all

The number of characters: 12
The number of words is: 3
The longest word is: Hello
Words in ascending order: [Hello, all, to]
Please enter a line of text. To quit type quit please. The fat cat sat on the mat in front of the door

The number of characters: 47
The number of words is: 12
The longest word is: front
Words in ascending order: [The, cat, door, fat, front, in, mat, of, on, sat, the, the]
Please enter a line of text. To quit type quit please. quit

Thank you! Bye!
Programmer: Hunter Martin
Course: COSC 211, W'24
Lab #: 2, part 2
Due date: 1-25-24

The biggest possible long value is: 9223372036854775807
n			n^2
----------------------------------
3037000500		9223372037000250000
3037000501		9223372043074251001
3037000502		9223372049148252004
3037000503		9223372055222253009
3037000504		9223372061296254016
3037000505		9223372067370255025
3037000506		9223372073444256036
3037000507		9223372079518257049
3037000508		9223372085592258064
3037000509		9223372091666259081
 */
	
