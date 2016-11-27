import java.util.Scanner;

public class circle extends findAreaAndPerimeter{
	
	
	int r = 12; // radius of the circle;
	
	
	@Override
	public void findArea(){ // it will find the areaOfCircle
		
		double areaOfCircle = 22/7 * r * r; 
		System.out.println(areaOfCircle); // prints the areaOfCircle
	      
	}

	@Override
	public void findPerimeter(){ // it will find the perimeterOfCircle
		
		double perimeterOfCircle = 2 * 22/7 * r;
		System.out.println(perimeterOfCircle); // prints the perimeterOfCircle
		
		
	}

}
