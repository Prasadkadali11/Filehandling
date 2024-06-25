package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Program1 {

	public static void main(String[] args) throws IOException {
		File fs = new File("./sample.text");
		if(!fs.exists())
		fs.createNewFile();
		
		FileInputStream fv = new FileInputStream(fs);
		int asciCode;
		while((asciCode = fv.read()) != -1) {
			System.out.print((char)asciCode);		
		}
		fv.close();
	}

}
