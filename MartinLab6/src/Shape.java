/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-22-24
*
*Description: This is the abstract class shape that implements the interface comparable
*/
public abstract class Shape implements Comparable <Shape> {
	//instance variables
	private String color;
	private double weight ;
	//no-args constructor
	
	public Shape() {
	color = "white" ;
	weight = 1.0 ;
	}
	
	//two args constructor
	public Shape(String newColor, double newWeight) {
	this.color = newColor;
	this.weight = newWeight;
	}
	
	//getter for private data which is all the variables in this case
	public String getColor() {
	return color;
	}
	
	public double getWeight() {
	return weight;
	}
	
	//setters for data that can be changed which in this case is all the variables
	public void setColor(String color) {
	this.color = color ;
	}
	
	public void setWeight(double weight) {
	this.weight = weight;
	}
	
	public abstract double getArea() ;
	public abstract double getPerimeter();
	
	@Override
	public int compareTo(Shape other) {
		if(getArea() > other.getArea()) {
			return 1;
		}
		else if(getArea() < other.getArea() ) {
			return 1 ;
		}
		else {
			return 0;
		}
		}
	
	public static Shape max(Shape o1 , Shape o2 ) {
		if(o1.compareTo(o2) == 1) {
			return o2;
		}
		else {
			return o1;
		}
		}
		}


