package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		File fa = new File("./sample.text");
		if(!fa.exists())
		fa.createNewFile();
		
		Scanner sc = new Scanner(fa);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}
