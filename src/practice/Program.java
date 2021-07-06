package practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		
			FileOutputStream fos = new FileOutputStream("abc.txt");
			String data="hello";
			byte[] b=data.getBytes();
			fos.write(b);
			fos.close();
			
			
		
		
		

	}

}
