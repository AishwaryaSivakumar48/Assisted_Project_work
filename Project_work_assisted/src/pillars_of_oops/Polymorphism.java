package pillars_of_oops;


class Polymorphism {
	  public void area() {
	    System.out.println("Find area ");
	  }
	public void area(int r) {
	    System.out.println("Area of Circle = "+3.14*r*r);
	  }
	 
	public void area(double b, double h) {
	    System.out.println("Area of Triangle ="+0.5*b*h);
	  }
	public void area(int l, int b) {
	    System.out.println("Area of Rectangle="+l*b);
	  }
	 
	  public static void main(String[] args) {
		  Polymorphism myShape = new Polymorphism();  // Create a Shapes object
	     
	    myShape.area();
	    myShape.area(5);
	    myShape.area(6.0,1.2);
	    myShape.area(6,2);
	     
	  }
 }