package FH.WritingInFilesWithJAVA;

import java.io.*;

public class UsingFileWriterClass {
	
	// If the file is present then overwrites it
	// If file is not present , create the file and writes on it
//	Writer fileWriter = new FileWriter("c:\\data\\output.txt", true);  // appends to file
//	Writer fileWriter = new FileWriter("c:\\data\\output.txt", false); // overwrites file
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		
		try {
			FileWriter fwriter = new FileWriter("C:\\Users\\lenovo\\Documents\\coke.txt", true);
			fwriter.write(text);
			fwriter.close();
			System.out.println("File is created successfully with the content.");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
