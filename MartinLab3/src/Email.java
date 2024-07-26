/**
* Programmer: Hunter Martin
* Course: COSC 211, W'24
* Due Date: 2-1-24
*
*Description: class name email that has the private variable sender, recipient, title.This class references our parent class Document.
*/

public class Email extends Document {
	
	//instance variables 
	private String sender;
	private String recipient ;
	private String title ;
	
	//no args constructor
	public Email() {
	super() ;
	sender = "" ;
	recipient = "" ;
	title = "" ;
	}
	
	//constructor with the required 4 arguments 
	public Email(String text , String sender , String recipient, String title) {
	super(text) ;
	this.sender = sender ;
	this.recipient = recipient  ;
	this.title = title ;
	}
	
	//getters for all the private data which in this case is all the variables 
	public String getSenders() {
	return sender ;
	}
	
	public String getRecipient() {
	return recipient ;
	}
	
	public String getTitle() {
	return title;
	}
	
	//setters for data that can be changed
	public void setSenders(String sender) {
	this.sender = sender ;
	}
	
	public void setRecipient(String recipient) {
	this.recipient = recipient ;
	}
	
	public void setTitle(String title) {
	this.title = title ;
	}
	
	//toString method that is override
	@Override
	public String toString() {
	return ("sender: " + sender + "\n" + "recipient: " + recipient + "\n" + "title: " + title + "\n" + "message: " + super.toString());
	}

}
