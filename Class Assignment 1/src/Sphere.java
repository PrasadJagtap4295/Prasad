/*Q1. Write a java program to find volume and surface area of a sphere using multiple classes?
Notes :
     Surface Area of Sphere = 4 * Math.PI * radius* radius
     Volume of Sphere = 4/3 * Math.PI * radius * radius * radius
     Use constructor to set radius
     User Scanner to take user input*/


import java.util.Scanner;
public class Sphere {
	public static void main (String args[]) { 	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Sphere Radius=  ");
		Radius.radius=scan.nextDouble();
		SphereArea.area();
		SphereVolume.volume();
		scan.close();
	}
}
  class Radius {
	  
	  static double radius;
	  
  }

