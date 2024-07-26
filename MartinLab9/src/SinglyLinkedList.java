/**
 * Description: Define a class that represents a list of integers. We explore the topic of linked lists. We use a lot of different methods
 * to see what we can actually do with a linked list. 
 *
 * Programmer: Hunter Martin
 * Course: COSC 211, Winter '24
 * Date: 3-26-24 
 */
public class SinglyLinkedList {
	// data members
	private Node head;
	// constructor
	public SinglyLinkedList() {
		head = null;
	}
	// add a node at the beginning of the list
	public void addFirst (int value) {
		head = new Node (value,head);
	}
	// remove the first node from the list 
	// this method assumes the node class is not an inner class
	public boolean removeFirst () {
		// is list empty?
		if (head == null)
			return false;
		head = head.getNext();
		return true;
	}
	// add to the end of list
	public void addLast (int value) {
		// is list empty
		if (head == null)
			addFirst(value);
		else {
			Node current = head;
			while (current.getNext() != null)
				current = current.getNext();
			current.setNext( new Node(value));
		}
	}
	// output the list
	public void print () {
		Node current = head;
		while (current != null) {
			// grab the value and print it
			System.out.print(current.getData() + " ");
			// advance to the next node
			current = current.getNext();
		}
		System.out.println();
	}
	// search the list for a target value. Return true
	// if target is in the list, and false otherwise
	public boolean find (int target) {
		Node current = head;
		while (current != null) {
			if (current.getData() == target)
				return true;
			current = current.getNext();
		}
		return false;
	}
	
	public int size() {
		//if we dont have a variable for head its changes the entire list
		Node curr = head;
		int size = 0;
		while(curr != null) {
			size += 1;
			
			//go to next node
			curr = curr.getNext();
		}
		return size;
	}
	
	public String toString() {
		Node curr = head;
		String str = "[" ;
		while(curr != null) {
			
			//concat each value
			str += curr ;
			
			//this is to prevent the comma and the extra space
			if(curr.getNext() != null) {
				str += " , ";
			}
			//go to the next node
			curr = curr.getNext();
		}
		if(curr == null) {
			str += "]" ;
		}
		return str;
	}
	
	public boolean removeLast() {
		
		//we are going to use previous to cut the pointer pointing to the last node
		Node prev = null ;
		Node curr = head;
		if(head == null) {
			return false;
		} 
		
		//transvering through the list
		while(curr.getNext() != null) {
			prev = curr;
			curr = curr.getNext();
		}
		
		prev.setNext(null);
		return true;
	}
	public void increment(int n) {
		Node curr = head;
		while(curr != null) {
			
			//grab the data that is already in the node
			int total = curr.getData();
			
			//add whatever the user said to add
			total += n;
			
			//set the new data of the node
			curr.setData(total);
			
			//iterate to the next node
			curr = curr.getNext();
		}
	}
	
	public void printBackwards() {
		
		//we need to check if something is even in the list
		if(head != null) {
			printBackwards(head);
		}
	}
	
	public void printBackwards(Node h) {
		//we need to do this recursively
		//if we want to print backwards we should probably call the recurs. call first
		
		Node curr = h;
		if(curr.getNext() != null) {
			printBackwards(curr.getNext());
		}
		System.out.print(curr.getData() + "   ");
		
	}

}

