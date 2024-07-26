/**
* Programmer: Hunter Martin
* Course: COSC 211, W'24
* Due Date: 2-1-24
*
*Description: class name Driver that actually runs our code. Prints out the sample output listed in description. Creates objects email and file derived from our parent class document.
*/

public class Driver {
	public static void main(String[] args) {
		//creating two of each object email and file
		Email email1 = new Email("the keyword super can be used in two ways in Java", "Tom", "Edward", "super keyword") ;
		Email email2 = new Email("This message is about running marathons" , "Speedy", "Gonzales", "races") ;
		File file1 = new File("Use Scanner to read from a Java text file", "input.txt") ;
		File file2 = new File("The name of participants in the last 10 marathon races", "run.txt") ;
		
		heading() ;
		
		//print out the info about these objects
		System.out.println(email1.toString()) ;
		System.out.println();
		System.out.println(email2.toString()) ;
		System.out.println();
		System.out.println(file1.toString()) ;
		System.out.println();
		System.out.println(file2.toString()) ;
		System.out.println();
		
		//shows the user which has the keyword java in it
		System.out.println("Which object contains Java?");
		if(contains(email1,"Java")) {
		System.out.println("email1");
		}
		if(contains(email2,"Java")) {
		System.out.println("email2");
		}
		if(contains(file1,"Java")) {
		System.out.println("file1");
		}
		if(contains(file2,"Java")) {
		System.out.println("file2");
		}
		}
		
	//methods that was given to us in the rubric
		public static boolean contains(Document doc, String target) {
		if(doc.toString().indexOf(target,0) >= 0) {
			return true;
			}
			else {
				return false;
			}
				}
		
		public static void heading() {
			System.out.println("Programmer: Hunter Martin") ;
			System.out.println("Course: COSC 211, W'24") ;
			System.out.println("Lab #: 3") ;
			System.out.println("Due date: 2-1-24") ;
			System.out.println() ;
			}

}

/**
Programmer: Hunter Martin
Course: COSC 211, W'24
Lab #: 3
Due date: 2-1-24

sender: Tom
recipient: Edward
title: super keyword
message: the keyword super can be used in two ways in Java

sender: Speedy
recipient: Gonzales
title: races
message: This message is about running marathons

Pathname input.txt
File Contents: Use Scanner to read from a Java text file

Pathname run.txt
File Contents: The name of participants in the last 10 marathon races

Which object contains Java?
email1
file1

*/

