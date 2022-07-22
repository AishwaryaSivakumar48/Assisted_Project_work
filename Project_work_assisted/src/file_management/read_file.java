package file_management;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file {

	public static void main(String[] args) {
		try {
		      File myFile = new File("test.txt");
		      Scanner myReader = new Scanner(myFile);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}

}
