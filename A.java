package hack;

public class A {
	public static void main() {
		int temp=a;
		a=b;
		b=temp;
	}
	static int a=10;
	static int b=20;
	public static void main(String args[]) {
		main();
		System.out.println(a+ " " +b);
		
	}

}
