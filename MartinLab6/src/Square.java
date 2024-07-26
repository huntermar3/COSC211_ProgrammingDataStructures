/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-22-24
*
*Description: This is the square class that is extending shape and implementing the interface Colorable
*/
public class Square extends Shape implements Colorable {
	private double side;
	
	//getter for side
	public double getSide() {
	return side;
	}
	
	//setter for side
	public void setSide(double side) {
	this.side = side;
	}
	
	public Square() {
	side = 1.0 ;
	}
	
	public Square(double specificSide) {
	this.side = specificSide;
	}
	
	public Square(double specificSide, String color , double weight) {
	super(color,weight) ;
	this.side = specificSide ;
	}
	
	@Override
	public void howToColor() {
	System.out.println("Color all four sides. ");
	}
	
	@Override
	public double getArea() {
	return side * side ;
	}
	
	@Override
	public double getPerimeter() {
	return side * 4;
	}
	
	public String toString() {
	return String.format("[Square] side = " + side + "\tcolor = " + super.getColor() + "\tweight = " + super.getWeight()) ;
	}
	
	}


