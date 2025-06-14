package oop;


class Test
{
    int x;
    Test(int i) { x = i; }
    Test()      { x = 0; }
}
  
class Main
{
    public static void main(String[] args)
    {
        Test t = new Test(5);
        change(t);
  
        
        System.out.println(t.x);
		System.out.println(t.hashCode());
    }
    
    // O/p = 5
    public static void change(Test t)
    {
        // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main
		System.out.println(t.hashCode());
        t = new Test();
		System.out.println(t.hashCode());
        t.x = 10;
    }
  
    // o/p = 10; 
    // This change() doesn't change the reference, it only
    // changes member of object referred by reference
//    public static void change(Test t)
//    {
//        t.x = 10;
//    }
}


public class JavaIsPassByValue {
	public static void swap(Integer i, Integer j) {
		Integer temp = new Integer(i);
		i = j;
		j = temp;
		System.out.println("i = " + i + ", j = " + j + " Inside swap method");
	}

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		swap(i, j);
		System.out.println("i = " + i + ", j = " + j);
	

	/*
	 * Understanding the exercise : 1.Let us refer to Integer reference I in main as
	 * I-main and Integer J as J-main.
	 * 
	 * 2.Let us refer to Integer reference I in Function as I-copy and Integer J as
	 * J-copy .
	 * 
	 * 3.We pass I-main and J-main but as java is call by value it creates copies of
	 * I-main as I-copy and J-main as J-copy.
	 * 
	 * 4.Now J-copy and I-copy have only one thing in common to their main
	 * counterpart is the objects they holds.
	 * 
	 * 5.Now after reference variable temp is created and assigned a value same is
	 * value of I-copy. we assign i=j. This statement basically does this
	 * I-copy=J-copy which means reference I-copy is simply referring/Holding to
	 * whatever Object J-copy is referring/Holding. Since the only change/impact
	 * I-copy and J-copy can have on I-main and J-main is via object modification
	 * which is not done here Our references in main are still intact .
	 * 
	 * 6.The second statement j=temp does this J-copy=temp means reference J-copy is
	 * simply referring/Holding to whatever Object temp is referring/Holding . Since
	 * the only change/impact I-copy and J-copy can have on I-main and J-main is via
	 * object modification which is not done here Our references in main are still
	 * intact .
	 * 
	 * 7.Result no change and no swap.
	 */

	
		int x = 5;
		change(x);
		System.out.println(x); // o/p = 5
		int[] arr = { 1, 2, 3 };
		change(arr);
		System.out.println(arr[0]); // o/p 10
		
		int[] brr = {4,5,6};
		System.out.println(arr[0]);
	}

	public static void change(int x) {
		x = 10;
	}

	public static void change(int[] x) {
		x[0] = 10;
	}
	
	public static void swap(int[] arr,int[] brr) {
		arr = brr;
	}

}





/*
 * Stack is a memory place where the methods and the local variables are stored.
 * (variable references either primitive or object references are also stored in
 * the stack). Heap is a memory place where the objects and its instance
 * variable are stored.
 */

// Pass by Value Example
class Operation2 {
	static int data = 50;
	Integer val = 100;
	String str;
	
	public Operation2()
	{
		str = new String("Shivam");
	}

	void change(Operation2 op) {
		op.val = 10000;// changes will be in the instance variable
		op.data = op.data + 100;// changes will be in the instance variable
		op.str = "Simran";// changes will be in the instance variable
	}

	public static void main(String args[]) {
		Operation2 op = new Operation2();

		System.out.println("before change " + op.data);
		System.out.println("before change " + op.val);
		op.change(op);// passing object
		System.out.println("after change " + op.data);
		System.out.println("after change " + op.val);
		System.out.println("after change " + op.str);

	}
}


/*
 * Local variable are stored in Stack only so the original value is copied in
 * this case and change is happen in copied part. Original remain same
 * and String and wrapper class are Immutable class
 */


class Operation3{
	public static void change(Integer a) {
		a = 500;
	}

	public static void change(String s) {
		s = "Simran";
	}

	public static void main(String[] args) {
		Integer a = 10;
		change(a);
		System.out.println(a);

		// String s = "Shivam";
		String s = new String("Shivam");
		change(s);
		System.out.println(s);
	}
}


