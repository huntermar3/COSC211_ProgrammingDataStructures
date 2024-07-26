/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 3-14-24
*
*Description: This lab introduces concepts of binary IO. In this lab we created a txt file with words and we encrypted the text file. 
*/
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MartinLab7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		heading() ;
		int key = 0;
		do {
			System.out.println();
			System.out.print("Enter an input file name ") ;
			String fileName = input.nextLine();
			//we need to create a file
			File file = new File(fileName);
			System.out.print("Enter an output file name ");
			String fileOutName = input.nextLine() ;
			//if the user enter the correct fileName
			if(file.exists()) {
				try {
					System.out.print("Enter the secret key ");
					key = input.nextInt();
				}
				catch(InputMismatchException j) {
					System.out.print("Invalid key - the key must be an integer, TRY AGAIN ");
					input.nextLine();
					System.out.println();
					keepGoing = false;
					continue;
				}
			}
			//creating a datainput/output stream
			try(
					DataInputStream fin = new DataInputStream(new FileInputStream(fileName)) ;
					DataOutputStream fout = new DataOutputStream(new FileOutputStream(fileOutName));
					)
			{
				while(fin.available() != 0) {
					byte newData = fin.readByte();
					fout.writeByte(newData + key);
				}
				System.out.println("File is encrypted successfully");
				keepGoing = true;
			}
			catch(FileNotFoundException j) {
				System.out.println("Bad input file name, TRY AGAIN") ;
				System.out.println() ;
				keepGoing = false;
			}
			catch(EOFException j) {
			}
			catch(IOException j) {
			}
		} while(!keepGoing) ;
	}

	public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211 Winter'24") ;
		System.out.println("Lab#: 7");
		System.out.println("Due date: 3-14-2024") ;
		System.out.println() ;
	}


}
/*
 * Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 7
Due date: 3-14-2024


Enter an input file name lab77.txt
Enter an output file name lab7E.txt
Bad input file name, TRY AGAIN


Enter an input file name lab7.txt
Enter an output file name lab7E.txt
Enter the secret key 5.7
Invalid key - the key must be an integer, TRY AGAIN 

Enter an input file name lab7.txt
Enter an output file name lab7E.txt
Enter the secret key 5
File is encrypted successfully

lab7.txt
I will encrypt this file using Caesar cipher

Caesar cipher is named after Julius Caesar, who used it in his private
correspondence

Julius Caesar was a Roman general who played a major role in establishing
the Roman Empire

This is a type of substitution cipher

In substitution cipher a character from the plaintext is replaced with
another character.

lab7E.txt
N%|nqq%jshw~uy%ymnx%knqj%zxnsl%Hfjxfw%hnumjwHfjxfw%hnumjw%nx%sfrji%fkyjw%Ozqnzx%Hfjxfw1%|mt%zxji%ny%ns%mnx%uwn{fyjhtwwjxutsijshjOzqnzx%Hfjxfw%|fx%f%Wtrfs%ljsjwfq%|mt%uqf~ji%f%rfotw%wtqj%ns%jxyfgqnxmnslymj%Wtrfs%JrunwjYmnx%nx%f%y~uj%tk%xzgxynyzynts%hnumjwNs%xzgxynyzynts%hnumjw%f%hmfwfhyjw%kwtr%ymj%uqfnsyj}y%nx%wjuqfhji%|nymfstymjw%hmfwfhyjw3

 */


