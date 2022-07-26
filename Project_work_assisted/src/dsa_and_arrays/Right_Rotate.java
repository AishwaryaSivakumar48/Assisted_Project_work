package dsa_and_arrays;

public class Right_Rotate {

	public static void main(String[] args) {
		int [] arr = new int [] {10,11,12,13,14,15,16};        
		int n = 4;     
		System.out.println("Array before rotation: ");    
	
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");     
			}   
		
		for(int i = 0; i < n; i++){    
			int j, end;    
		    end = arr[arr.length-1];  
		    for(j = arr.length-1; j > 0; j--){    
		    	arr[j] = arr[j-1];          
		    }    
		           
		    arr[0] = end;    
		    }    
		System.out.println();    
	    System.out.println("Array after right rotation: ");    
		
	    for(int i = 0; i< arr.length; i++){    
		System.out.print(arr[i] + " ");    
		        }    
		    } 
}

		
	
