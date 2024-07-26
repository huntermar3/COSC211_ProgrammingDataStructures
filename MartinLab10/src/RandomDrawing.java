/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 4-11-24
*
*Description: This lab explores the topic of generic classes. We created a box which was an arraylist and we use generics for different types 
*of boxes. 
*
*/

import java.util.*;
public class RandomDrawing<T> implements Cloneable {
	//instance variables 
	private ArrayList<T> box;
	
	//no-args constructor
	public RandomDrawing() {
		box = new ArrayList<T>() ;
	}
	
	//add something to the box
	public void add(T item) {
		//use java arraylist api to add something with type "T"
		box.add(item);
	}
	
	public boolean isEmpty() {
		//array list has a bulit in function
		return box.isEmpty();
	}
	
	public T drawItem() {
		//if the box is empty return null
		if(isEmpty()) {
			return null;
		} else {
			
			//find the size of the box
			int size =  box.size() ;
			//pick a random number within the bounds of the length of the box
			int random = (int) (Math.random() * size)  ;
			
			//use java api for "remove" to remove a certain element before we return it to the user
			return box.remove(random) ;
		}
	}
	
	//toString method that prints the list 
	public String toString() {
		//we are going to concat to this string
		String str = "" ;
		if(box == null) {
			return str;
		} else {
			for(int i = 0 ; i < box.size() ; i++) {
				str += box.get(i) + " " ;
			}
			return str;
		}
	}
	
	//the clone method that creates a hard copy
	@Override
	public RandomDrawing<T> clone() {
		try {
		RandomDrawing<T> boxClone = (RandomDrawing<T>)super.clone();
		boxClone.box = new ArrayList<>(this.box) ;
		return boxClone;
		} 
		catch(CloneNotSupportedException j) {
			return null;
		}
	}
}
