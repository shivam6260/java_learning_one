package FH.CreatingFilesWithJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class UsingFileOutputStreamClass {
public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter File Name");
			String name = br.readLine();
			
			
			System.out.println("Enter the Path");
			String path = br.readLine();
			FileOutputStream fos = new FileOutputStream(
	                path + "\\" + name + ".txt");
			System.out.println("File Created");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
