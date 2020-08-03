package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class FileNotFoundException1 {
	public static void main(String[] args)  {
		System.out.println("Hello");
		try {
		FileInputStream abc=
		new FileInputStream("C:\\Usehjkkjrs\\kripa\\Desktop\\abc.txt");   //-->when the path of file will be correct the gives File avilable otherwise gives file not found
		System.out.println("File avilable");
	}catch(FileNotFoundException ex) {
		System.out.println("File not found");
	}
		System.out.println("Hii");
	}
}
