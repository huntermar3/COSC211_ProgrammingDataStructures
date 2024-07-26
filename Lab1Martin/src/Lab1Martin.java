import java.util.Scanner ; 
public class Lab1Martin {

	public static void main(String[] args) {
	//declarations
	int rows = 0 ;
	int columns = 0  ;
	char[][] grid ;
	
	Scanner input = new Scanner(System.in) ;
	
	heading(); 
	
	//ask the user the num of rows
	System.out.print("Please enter the amount of rows on the airplane ");
	rows = input.nextInt();
	
	//ask the user the num of columns
	System.out.print("Please enter the amount of columns on the airplane ") ;
	columns = input.nextInt();
	
	//creates a new array with rows and columns 
	grid = new char[rows][columns] ;
		
	//intialize the array w letters
	populate(grid) ;
	display(grid) ;
	
		
	//while loop to keep program going
	boolean takingSeats = true ;
	while(takingSeats) {
		//the seat the user selected
		System.out.print("Please make a selection on the seat you like. (type quit to leave) ") ;
		String seat = input.next();
			
		//First thing-if user inputs "quit" it breaks out of the loop and its over
		if(seat.equalsIgnoreCase("quit")) {
			System.out.print("Thanks! Bye. ") ; 
			takingSeats = false; 
		}
		else {
			//right now we have a string we need to split this two characters. We can use Integer.parseInt (didn't like that switched to charAt)
			int firstChar = seat.charAt(0) - '1' ;
			int secondChar = seat.charAt(1) - 'A' ;
							
			
			//put a X on spot they decided
			if(grid[firstChar][secondChar] == 'X') {
				System.out.print("Seat is taken. Please select a new seat. ");
			}
			else {
				grid[firstChar][secondChar] = 'X' ;
				display(grid) ;
			}
			
			
			//what if every slot is taking over by a X, lets use 2 for loops to check each individual index
			boolean allTakenSeats = true ;
			for(int i = 0 ; i < grid.length ; i++) {
				for(int j = 0 ; j < grid[i].length ; j++) {
					if(grid[i][j] != 'X') {
						
						//if no X then there must be a open seat
						allTakenSeats = false ;
						break ;
						}
				}
			
			if(allTakenSeats) {
				System.out.print("All seats are taken. Thanks. ");
				takingSeats = false; 
			}
			
			}
			
		}
		
		
	
	}
	}
	
		
		
		
		
		//populate the array w/ A,B,C...
		public static void populate(char[][] seats) {
			for(int i  =  0 ; i <  seats.length ; i++) {
				for(int j = 0 ; j < seats[i].length ; j++ ) {
					seats[i][j] = (char)('A' + j) ; }
		}
		}
		
		//heading for output
		public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211, W'24") ;
		System.out.println("Lab #: 1") ;
		System.out.println("Due date: 1-18-24") ;
		System.out.println() ;
		}
		
		//display the array 
		public static void  display(char[][] seats) {
		for(int i = 0 ; i < seats.length ; i++) {
			System.out.print((i + 1) + " ");
				for(int j = 0 ; j <  seats[i].length  ; j++) {
					System.out.print(seats[i][j] + "  ");
		}
		System.out.println();
		
		}
		
		}
		
}

/**
 * Programmer: Hunter Martin
Course: COSC 211, W'24
Lab #: 1
Due date: 1-18-24

Please enter the amount of rows on the airplane 7
Please enter the amount of columns on the airplane 5
1 A  B  C  D  E  
2 A  B  C  D  E  
3 A  B  C  D  E  
4 A  B  C  D  E  
5 A  B  C  D  E  
6 A  B  C  D  E  
7 A  B  C  D  E  
Please make a selection on the seat you like. (type quit to leave) 2E
1 A  B  C  D  E  
2 A  B  C  D  X  
3 A  B  C  D  E  
4 A  B  C  D  E  
5 A  B  C  D  E  
6 A  B  C  D  E  
7 A  B  C  D  E  
Please make a selection on the seat you like. (type quit to leave) 2E
Seat is taken. Please select a new seat. Please make a selection on the seat you like. (type quit to leave) 6D
1 A  B  C  D  E  
2 A  B  C  D  X  
3 A  B  C  D  E  
4 A  B  C  D  E  
5 A  B  C  D  E  
6 A  B  C  X  E  
7 A  B  C  D  E  
Please make a selection on the seat you like. (type quit to leave) 1A
1 X  B  C  D  E  
2 A  B  C  D  X  
3 A  B  C  D  E  
4 A  B  C  D  E  
5 A  B  C  D  E  
6 A  B  C  X  E  
7 A  B  C  D  E  
Please make a selection on the seat you like. (type quit to leave) QUIT
Thanks! Bye. 

******************** RUN 2 **********************************************
*Programmer: Hunter Martin
Course: COSC 211, W'24
Lab #: 1
Due date: 1-18-24

Please enter the amount of rows on the airplane 4
Please enter the amount of columns on the airplane 3
1 A  B  C  
2 A  B  C  
3 A  B  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 1A
1 X  B  C  
2 A  B  C  
3 A  B  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 1B
1 X  X  C  
2 A  B  C  
3 A  B  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 2A
1 X  X  C  
2 X  B  C  
3 A  B  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 2B
1 X  X  C  
2 X  X  C  
3 A  B  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 3A
1 X  X  C  
2 X  X  C  
3 X  B  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 3B
1 X  X  C  
2 X  X  C  
3 X  X  C  
4 A  B  C  
Please make a selection on the seat you like. (type quit to leave) 4A
1 X  X  C  
2 X  X  C  
3 X  X  C  
4 X  B  C  
Please make a selection on the seat you like. (type quit to leave) 4B
1 X  X  C  
2 X  X  C  
3 X  X  C  
4 X  X  C  
Please make a selection on the seat you like. (type quit to leave) 3C
1 X  X  C  
2 X  X  C  
3 X  X  X  
4 X  X  C  
Please make a selection on the seat you like. (type quit to leave) 4C
1 X  X  C  
2 X  X  C  
3 X  X  X  
4 X  X  X  
Please make a selection on the seat you like. (type quit to leave) 2C
1 X  X  C  
2 X  X  X  
3 X  X  X  
4 X  X  X  
Please make a selection on the seat you like. (type quit to leave) 1C
1 X  X  X  
2 X  X  X  
3 X  X  X  
4 X  X  X  
All seats are taken. Thanks. All seats are taken. Thanks. All seats are taken. Thanks. All seats are taken. Thanks. 
 */

	
