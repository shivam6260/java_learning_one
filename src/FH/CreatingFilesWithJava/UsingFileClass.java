package FH.CreatingFilesWithJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingFileClass  {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter File Name");
			String name = br.readLine();
			
			
			System.out.println("Enter the Path");
			String path = br.readLine();
			File file = new File(path + "\\" + name + ".txt");
			
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("File Created");
			}
			else
				System.out.println("File is already present there");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
