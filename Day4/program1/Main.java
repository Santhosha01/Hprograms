package Day4.program1;

import java.util.Scanner;

public class Main{
  public static void main(String args[]) {
	  boolean start=true;
	  while(start) {
	  System.out.println("1.Circle \n2.Square \n3.Rectangle \n4.Exit");
	  System.out.println("Enter the Shape Name");
	  Scanner sc=new Scanner(System.in);
	  String shape=sc.nextLine();
	  if(shape.equalsIgnoreCase("circle")) {
		  System.out.println("Enter the radius");
		  int radius=sc.nextInt();
		  Shape s=new Circle(shape,radius);
	      System.out.println("Area of the "+shape+" is "+s.calculateArea());  
	  }
	  else if(shape.equalsIgnoreCase("square")) {
		  System.out.println("Enter the side");
		  int side=sc.nextInt();
		  Shape s=new Square(shape,side); 		  
		  System.out.println("Area of the "+shape+" is "+s.calculateArea());
	  }
	  else if(shape.equalsIgnoreCase("rectangle")){
		  System.out.println("Enter the length");
		  int length=sc.nextInt();
		  System.out.println("Enter the breadth");
		  int breadth=sc.nextInt();
		  Shape s=new Rectangle(shape,length,breadth);
		  System.out.println("Area of the "+shape+" is "+s.calculateArea());
	  }
	  else {
		  start=false;
		  System.out.println("---------Thank you-------------");
	  }
	  }
  }
}
