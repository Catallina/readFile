package readFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class readFile {
	
	public void read() {
		try {
			String fileName = "src//readFile//file.txt";
			String content = new String(Files.readAllBytes(Paths.get(fileName)));
			System.out.println(content);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
