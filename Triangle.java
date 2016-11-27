
public class Triangle extends findAreaAndPerimeter {
	
	int a = 10; // side a of the triangle 
	int b = 20; // side b (base) of the triangle
	int c = 10; // side c of the triangle 
	int h = 12; // height of the triangle

	@Override
	public void findArea() { // it will find the areaOfTriangle
		double areaOfTriangle = 1/2 * b * h ;
		System.out.println(areaOfTriangle); // prints the areaOfTriangle
		
	}

	@Override
	public void findPerimeter() { // it will find the perimeterOfTriangle 
		
		double perimeterOfTriangle = a + b + c;
		System.out.println(perimeterOfTriangle); // prints the perimeterOfTriangle 
		
	}
	
	

}
