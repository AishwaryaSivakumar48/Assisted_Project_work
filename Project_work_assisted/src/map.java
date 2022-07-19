import java.util.*;
public class map {
		
		 public static void main(String args[])
		    {
		        
		        Map<String, Integer> hmap
		            = new HashMap<String, Integer>();
		  
		        hmap.put("A", new Integer(45));
		        hmap.put("B", new Integer(22));
		        hmap.put("C", new Integer(53));
		        hmap.put("D", new Integer(94));
		        System.out.println("Working with map interface ");
		      
		        for (Map.Entry<String, Integer> me :
		             hmap.entrySet()) {
		  
		            // Printing keys
		            System.out.print(me.getKey() + ":");
		            System.out.println(me.getValue());
		            
		        
		        }
		        Hashtable<Integer,String> htab=new Hashtable<Integer,String>();  
			      
		        htab.put(4,"Alice");  
		        htab.put(5,"Rose");  
		        htab.put(6,"Jack");  
		        htab.put(7,"Jim");  

			      System.out.println("\nThe elements of HashTable are ");  
			      for(Map.Entry n:htab.entrySet()){    
			       System.out.println(n.getKey()+" "+n.getValue());    
			      }
			      TreeMap<Integer,String> Tmap=new TreeMap<Integer,String>();    
			      Tmap.put(8,"Apple");    
			      Tmap.put(9,"Carrot");    
			      Tmap.put(10,"Cabbage");       
			      
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(Map.Entry l:Tmap.entrySet()){    
			       System.out.println(l.getKey()+" "+l.getValue());    
			      }    

			      
			      

		    }
		}