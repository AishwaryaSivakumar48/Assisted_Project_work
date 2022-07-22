package pillars_of_oops;

public class class_obj_demo
{
  int width, height;
  int getArea()
  {
    return width*height;
  }
  public static void main(String[] args)
  {
	  class_obj_demo obj = new class_obj_demo();
    obj.width = 10;
    obj.height= 20;
    int area = obj.getArea();
    System.out.println("Area of the house = " + area);
  }
}

	
	
	

	
		
		
		
		
		
