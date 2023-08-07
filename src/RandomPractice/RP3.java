package RandomPractice;


public class RP3 {
	public final static RP3 obj = new RP3();
	public static int value;
	public int temp;
	
	public void print() {
		System.out.println("Print method");
	}
	
	public static void printtwo() {
		System.out.println("Print two method");
	}
	
	public static void main(String[] args) {
		RP3.obj.value = 5;
		RP3.obj.temp = 10;
		
		RP3 ob = new RP3();
		RP3.value = 100;
		ob.print();
		ob.printtwo();
		
		System.out.println(RP3.obj.temp);
		System.out.println(ob.temp);
	}
	
	

	
}


