package searching;

import java.util.Arrays;

public class Binary_search {

	public static void main(String[] args) {
		 
		       
		        int intArray[] = {10,20,30,40,50,60};
		        
		        System.out.println("The input Array : " + Arrays.toString(intArray));
		    
		        int key = 30;  
		        System.out.println("The key to be searched:" + key);
		     
		        int serach_result = Arrays.binarySearch(intArray,key);  
		        
		        if (serach_result < 0)  
		            System.out.println("Key is not found in the array!");  
		        else 
		            System.out.println("Key is found at index: "+serach_result + " in the array.");  
		    }  
		}  

	