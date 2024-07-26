/*
*Programmer: Hunter Martin
*Course: COSC 211 Winter'24") 
*Due Date: 2-22-24
*
*Description: This lab explores the topic of abstract classes and interfaces. We create a abstract class named shape. And we create an interface
*called colorable. 
*/
public class Driver {

	public static void main(String[] args) {
		heading();
		Shape [] shapes = {new Square(2), new Circle(5,"green",20), new
		Square(5,"blue",10), new Circle()};
			// display the area, perimeter, and color message
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("\nShape"+i);
			System.out.printf("Area is %.2f\n" , shapes[i].getArea());
			System.out.printf("Perimeter is %.2f\n" ,
			shapes[i].getPerimeter());
			if (shapes[i] instanceof Colorable)
			((Colorable)shapes[i]).howToColor();
			}
	// display the max circle
	System.out.println();
	
	Circle circle = (Circle) Shape.max(shapes[3], shapes[1]);
	System.out.println("The max circle's radius is " +
	circle.getRadius());
	System.out.println(circle);
				
	// display the max square	
	System.out.println();
	Square square = (Square) Shape.max(shapes[0], shapes[2]);
	System.out.println("The max square's side is " +
	square.getSide());
	System.out.println(square);
	}
		
	public static void heading() {
		System.out.println("Programmer: Hunter Martin") ;
		System.out.println("Course: COSC 211 Winter'24") ;
		System.out.println("Lab#: 6");
		System.out.println("Due date: 3-07-2024") ;
		System.out.println() ;
	}

	}

/*
 *Programmer: Hunter Martin
Course: COSC 211 Winter'24
Lab#: 6
Due date: 3-07-2024


Shape0
Area is 4.00
Perimeter is 8.00
Color all four sides. 

Shape1
Area is 78.54
Perimeter is 31.42

Shape2
Area is 25.00
Perimeter is 20.00
Color all four sides. 

Shape3
Area is 3.14
Perimeter is 6.28

The max circle's radius is 5.0
[Circle] radius = 5.0	color = green	weight = 20.0

The max square's side is 5.0
[Square] side = 5.0	color = blue	weight = 10.0
 */

