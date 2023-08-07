package FH.JavaInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastReader {
	BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(
            new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}


public class FastReaderClass {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int pos = 0;
		    int neg = 0;
		    for(int i = 0;i<n;i++)
		    {
		        if(arr[i] == 0)
		        continue;
		        if(arr[i] > 0)
		        pos++;
		        else
		        neg++;
		    }
		    int a = 0;
		    int b = 0;
		    if(pos > 0)
		    a = pos - 1;
		    int asum = (a * (a - 1))/2;
		    
		    if(neg > 0)
		    b = neg - 1;
		    int bsum = (b * (b - 1))/2;
		    System.out.println(asum + bsum);
		}
		
	}
}
