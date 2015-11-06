package aulaArquivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("primitivos.dat"));
		
		while (sc.hasNext()) {
			if (sc.hasNextInt())
				System.out.println(sc.nextInt() * 10);
			else 
				System.out.println(sc.next());
		}
		sc.close();
		
	}

}
