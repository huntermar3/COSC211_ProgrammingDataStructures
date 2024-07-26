/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-22-24
*
*Description: This is the circle class that is extending shape. 
*/
public class Circle extends Shape {
	//instance variables
	private double radius;
	
	//getter
	public double getRadius() {
	return radius;
	}
	
	//setter
	public void setRadius(double radius) {
	this.radius = radius;
	}
	
	public Circle() {
	radius = 1.0;
	}
	
	//1-args constructor
	public Circle(double specificRadius) {
	this.radius = specificRadius ;
	}
	
	//3-args constructor
	public Circle(double specificRadius, String color, double weight) {
	super(color,weight) ;
	this.radius = specificRadius ;
	}
	
	@Override
	public double getArea() {
	return (Math.PI * Math.pow(radius,2)) ;
	}
	
	@Override
	public double getPerimeter() {
	return (2 * Math.PI * radius) ;
	}
	
	public String toString() {
	return String.format("[Circle] radius = " + radius + "\tcolor = " + super.getColor()+ "\tweight = " + super.getWeight()) ;
	}
	
	}


