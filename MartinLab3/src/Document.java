/**
* Programmer: Hunter Martin
* Course: COSC 211, W'24
* Due Date: 2-1-24
*
*Description: class name document that has the private variable text that we are going to want for further classes. This will be our parent class.
*/

public class Document {
	//instance variables 
	private String text ;
	
	//no-args constructor 
	public Document() {
	this.text = "" ;
	}
	
	//constructor with just one argument
	public Document(String text) {
	this.text = text ;
	}
	
	@Override
	public String toString() {
	return text;
	}
}

