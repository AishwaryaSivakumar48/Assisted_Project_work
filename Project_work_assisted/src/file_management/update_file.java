package file_management;

import java.io.FileWriter;
import java.io.IOException;

public class update_file {

	public static void main(String[] args) {

        try {
        	FileWriter output= new FileWriter("test.txt"); 
        	output.write("updated context");
        	output.close();
        }
        catch(IOException e) {
        	  System.out.println("Success...");    
        }

	}

}
