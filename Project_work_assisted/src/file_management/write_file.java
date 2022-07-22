package file_management;
import java.io.FileWriter;
import java.io.IOException;

public class write_file {

	public static void main(String[] args) {
		String data="I am writing in the file using using java";
		try {
		FileWriter output= new FileWriter("test.txt"); 
		output.write(data);
		System.out.println("data written successfully");
		output.close();
		
	} catch (IOException ex) {
		System.out.println("File write error..");
		//ex.printStackTrace();
	}
		
	}

}
