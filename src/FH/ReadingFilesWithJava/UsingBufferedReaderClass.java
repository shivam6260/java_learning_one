package FH.ReadingFilesWithJava;

import java.io.*;

public class UsingBufferedReaderClass {
	public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\Users\\lenovo\\Documents\\Story.txt");
        BufferedReader br
            = new BufferedReader(new FileReader(file));
        
        String st;
        String res = "";
        while ((st = br.readLine()) != null)
        {
        	res = res + st;
        	res = res + " ";
        }
        System.out.println(res.trim());
    }

}
