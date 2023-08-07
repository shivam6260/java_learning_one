package FH.ReadingFilesWithJava;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReaderClass {
	public static void main(String[] args) throws IOException
	{
	     File file = new File("C:\\Users\\lenovo\\Documents\\Story.txt");
	     if(file.exists())
	     {
	    	 System.out.println("File Found");
	    	 FileReader fr1 = new FileReader(
			            "C:\\Users\\lenovo\\Documents\\Story.txt");
	    	 String str = "";
	    	 int temp;
	    	 while( (temp = fr1.read()) != -1 )
	    	 {
	    		 str = str + (char)temp;
	    	 }
	    	 System.out.println(str);
		     String[] arr = str.trim().split(" ");
		     for(String s : arr)
		    	 System.out.println(s);
	    	 
	     }
	     else
	     {
	    	 System.out.println("File not found");
	     }
	}
}
