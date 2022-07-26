package dsa_and_arrays;

import java.util.Arrays; 
class Order_Statistics {

    public static int kthSmallest(Integer [] arr,  
                                         int k)  
    { 
       
        Arrays.sort(arr); 
        return arr[k-1]; 
    }  
      
    // driver program 
    public static void main(String[] args)  
    { 
        Integer arr[] = new Integer[]{12,13,67,89,90,45,76,34,36}; 
        int k = 4; 
        System.out.print( "K'th smallest element is "+ 
                            kthSmallest(arr, k) );      
    } 
} 

	