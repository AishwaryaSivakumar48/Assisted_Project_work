package file_management;

import java.io.File;

public class delete_file {

	public static void main(String[] args) {
		File myFile = new File("test.txt"); 
	    if (myFile.delete()) { 
	      System.out.println("Deleted the file: " + myFile.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	}

}
