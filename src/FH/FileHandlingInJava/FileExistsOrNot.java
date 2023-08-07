package FH.FileHandlingInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExistsOrNot {

	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String dirpath = "C:\\Users\\lenovo\\Documents\\Story.txt";
        File f = new File(dirpath);
        
        if (f.exists()) {
            System.out.println("Is writable:"
                               + f.canWrite());
            System.out.println("Is readable" + f.canRead());
            System.out.println("Is a directory:"
                               + f.isDirectory());
            System.out.println("Is a File: " + f.isFile());
            System.out.println("File Size in bytes "
                               + f.length());
        }
        
        System.out.println("File name :" + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path:"
                           + f.getAbsolutePath());
        System.out.println("Parent:" + f.getParent());
        System.out.println("Exists :" + f.exists());
    }
	
//	public static void main(String args[])
//    {
//        // Getting the file by creating object of File class
//        File f = new File("C:\\Users\\lenovo\\Downloads\\Resume.pdf");
// 
//        // Checking if the specified file exists or not
//        if (f.exists())
// 
//            // Show if the file exists
//            System.out.println("Exists");
//        else
// 
//            // Show if the file does not exists
//            System.out.println("Does not Exists");
//    }
}
