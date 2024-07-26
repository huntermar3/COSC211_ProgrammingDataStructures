/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 3-14-24
*
*Description: This lab introduces concepts of binary IO. In this part we take the encrypted file and decrypted it.
*/
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MartinLabPt2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;
		int key = 0;
		heading();
		do {
			System.out.print("Enter an input (or encrypted) file name ") ;
			String fileName = input.nextLine();

			//we need to create a file
			File file = new File(fileName);

			System.out.print("Enter an output (or unencrypted) file name ");
			String fileOutName = input.nextLine() ;

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
			try(
					DataInputStream fin = new DataInputStream(new FileInputStream(fileName)) ;
					DataOutputStream fout = new DataOutputStream(new FileOutputStream(fileOutName));
					)
			{
				while(fin.available() != 0) {
					byte newData = fin.readByte();
					fout.writeByte(newData - key);
				}
				System.out.println("File is decrypted successfully");
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
		}while(!keepGoing) ;
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

Enter an input (or encrypted) file name lab7EE.txt
Enter an output (or unencrypted) file name lab7D.txt
Bad input file name, TRY AGAIN

Enter an input (or encrypted) file name lab7E.txt
Enter an output (or unencrypted) file name lab7D.txt
Enter the secret key A
Invalid key - the key must be an integer, TRY AGAIN 
Enter an input (or encrypted) file name lab7E.txt
Enter an output (or unencrypted) file name lab7D.txt
Enter the secret key 5
File is decrypted successfully

lab7E.txt
N%|nqq%jshw~uy%ymnx%knqj%zxnsl%Hfjxfw%hnumjwHfjxfw%hnumjw%nx%sfrji%fkyjw%Ozqnzx%Hfjxfw1%|mt%zxji%ny%ns%mnx%uwn{fyjhtwwjxutsijshjOzqnzx%Hfjxfw%|fx%f%Wtrfs%ljsjwfq%|mt%uqf~ji%f%rfotw%wtqj%ns%jxyfgqnxmnslymj%Wtrfs%JrunwjYmnx%nx%f%y~uj%tk%xzgxynyzynts%hnumjwNs%xzgxynyzynts%hnumjw%f%hmfwfhyjw%kwtr%ymj%uqfnsyj}y%nx%wjuqfhji%|nymfstymjw%hmfwfhyjw3

lab7D.txt
I will encrypt this file using Caesar cipher

Caesar cipher is named after Julius Caesar, who used it in his private
correspondence

Julius Caesar was a Roman general who played a major role in establishing
the Roman Empire

This is a type of substitution cipher

In substitution cipher a character from the plaintext is replaced with
another character.

 */


