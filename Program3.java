package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		File fb = new File("./sample.text");
		if(!fb.exists())
		fb.createNewFile(); 
		
		FileReader fr = new FileReader(fb); 
		int asciCode;
		while((asciCode = fr.read()) != -1) {
			System.out.print((char)asciCode);		
		}
		fr.close();
		


	}

}
