
public class Rectangle extends findAreaAndPerimeter {
	
	
	int length = 12; // length of the rectangle
	int breath = 5;; // breath of the rectangle

	@Override
	public void findArea() { // it will find the areaOfRectangle
		
		double areaOfrectangle = length * breath; 
		System.out.println(areaOfrectangle); // prints the areaOfRectangle
		
	}

	@Override
	public void findPerimeter() { // it will find the perimeterOfRectangle
		
		double perimeterOFRectangle = 2 * (length + breath);
		System.out.println(perimeterOFRectangle); // prints the perimeterOfRectangle
	
		
		
	}
	
	

}
