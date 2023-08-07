package FH.DeleteFileUsingJava;

import java.io.File;

public class DeleteFileUsingFileClass {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\lenovo\\Documents\\Shivam.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}
	}

}
