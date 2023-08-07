package FH.JavaInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//                
// It is BufferedReader class

// Buffer Reader class use to take Input from Users

/*
 * Following are the Major Differences between Scanner and BufferedReader Class in Java

BufferedReader is synchronous while Scanner is not. 

BufferedReader should be used if we are working with multiple threads.

BufferedReader is a bit faster as compared to scanner because the scanner does the 
parsing of input data and BufferedReader simply reads a sequence of characters.
 */

public class BufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
//		 String str = bfn.readLine();
//		 int tc = Integer.parseInt(str);
//		 System.out.println(tc);
//		 while(tc-- > 0)
//		 {
//			 String temp = bfn.readLine();
//			 System.out.println(temp);
//			 long a = Long.parseLong(bfn.readLine());
//			 double d = Double.parseDouble(bfn.readLine());
//			 System.out.println(a + " " + d);
//		 }

		// To take Array as a Input
//		int n = Integer.parseInt(bfn.readLine());
//		int[] arr = new int[n];
//
//		String line = bfn.readLine();
//		String[] strs = line.trim().split(" ");
//
//		for (int i = 0; i < n; i++) {
//			arr[i] = Integer.parseInt(strs[i]);
//		}
//
//		for (int i : arr)
//			System.out.println(i);
		
//		String temp = bfn.readLine();
//		System.out.println(temp);
		
		
	}

}
