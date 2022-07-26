package dsa_and_arrays;

import java.util.ArrayList;

public class Range_queries {

	public static int findSum(int L, int R)
	{
	   
	    ArrayList<Integer>arrlist=new ArrayList<Integer>();
		   arrlist.add(3);
		   arrlist.add(15);
		   arrlist.add(29);
		   arrlist.add(90);
		   arrlist.add(1);
		   arrlist.add(56);
	    int i = 0;
	    int x = 2;
	    while (i <= R)
	    {
	    	arrlist.add(i + x);
	 
	        if (i + 1 <= R)
	        	arrlist.add(i + 1 + x);
                x *= -1;
                i += 2;
	    }
	 
	  
	    int sum = 0;
	 
	    for(i = L; i <= R-1; ++i)
	       sum += arrlist.get(i);
	       return sum;
	}
	 
	
	public static void main(String[] args)
	{
	     
	    int L = 0, R = 5;
	 
	    System.out.println(findSum(L, R));
	}
	}
	 