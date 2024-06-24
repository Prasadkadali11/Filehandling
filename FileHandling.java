package filehandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\filehandling");
		if(f.exists());
		f.delete();
		System.out.println(f.createNewFile());

	}

}
