package file_management;
import java.io.File;
import java.io.IOException;
public class create_file{
	public static void main(String[] args) throws IOException {
		File myFile=new File("test.txt"); 
		try { 
		if (myFile.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("File already exists");
		}
		
	}catch (IOException ex) {
		System.out.println("file error..");
	}
}
}