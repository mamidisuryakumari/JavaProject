package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyClass {
	
	public static  void main(String[] args) {
		File file = new File("myfile.text");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Surya kumari");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
