package practice;

import java.io.FileReader;

public class ReadFileStream {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("abc.txt");
		
		String data = "";
		int val = fr.read();
		while(val != -1) {
			data = data + (char)val;
			val = fr.read(); 
		}
		System.out.println(data);
		fr.close();

	}

}
