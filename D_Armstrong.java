package hack;
import java.util.*;

public class D_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number=");
		int n=sc.nextInt();
	int sum =0;
	int temp=n;
	while(n>0) {
	int a=n%10;
	sum=(sum)+a*a*a;
	n=n/10;
		
	}
	if(temp==sum) {
	
	System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not Armstrang Number");
	}		

	}

}
