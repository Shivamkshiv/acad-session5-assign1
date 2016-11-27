
public class mainClass { 
	
	public static void main(String[] args) {
		
	    circle Circle = new circle(); // Circle object
	    System.out.println("Circle Details :"); 
	    Circle.findArea();  // it will print
	    Circle.findPerimeter(); // the circle details(Area and Perimeter)
	    
	    System.out.println("");
	    System.out.println("********************************"); // separator 
	    System.out.println("");
	    
	    Rectangle rectangle = new Rectangle(); // rectangle object
	    System.out.println("Rectangle Details :");
	    rectangle.findArea(); // it will print
	    rectangle.findPerimeter(); // the Rectangle details(Area and Perimeter)
	    
	    System.out.println("");
	    System.out.println("**********************************");// separator 
	    System.out.println("");
	    
	    Triangle triangle = new Triangle(); // triangle object
	    System.out.println("Triangle Details :");
	    triangle.findArea(); // it will print 
	    triangle.findPerimeter(); // the triangle details (Area and Perimeter)
	    
	   
	    
	    
		
	}

}
