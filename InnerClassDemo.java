class outer {
	int x = 10;
	
	void test() {
		Inner inner = new Inner();
		inner.display();		
	}
	
	class Inner{
		void display() {
		// int y = 100;
		System.out.println("Value of x:"+x);
		}
		
	}
	
	void showxy() {
		// System.out.println(x + " "+y);
	}
	
}

public class InnerClassDemo {

	public static void main(String[] args) {
		outer out = new outer();
		out.test();
		out.showxy();
	}

}
