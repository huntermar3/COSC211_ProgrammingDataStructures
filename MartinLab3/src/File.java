/**
* Programmer: Hunter Martin
* Course: COSC 211, W'24
* Due Date: 2-1-24
*
*Description: class name file that has the private pathname.This class references our parent class Document.
*/

public class File extends Document {
	
	//instance variables
	private String pathname;
	
	//no-args constructor
	public File() {
	super() ;
	pathname = "" ;
	}
	
	//constructor that takes two arguments
	public File(String text, String pathname) {
	super(text);
	this.pathname = pathname ;
	}
	
	//getters for private data which in case is just pathname
	public String getPathName() {
	return pathname ;
	}
	
	//setters for data that can be changed
	public void setPathName(String pathname) {
	this.pathname = pathname ;
	}
	
	@Override
	public String toString() {
	return ("Pathname " + pathname + "\n" + "File Contents: " + super.toString() ) ;
	}

}
