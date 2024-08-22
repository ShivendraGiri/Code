package hack;
import java.util.*;


public class D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr = new int[2][3];
arr[0][0]=101;
arr[0][1]=102;
arr[0][2]=103;
arr[1][0]=204;
arr[1][1]=205;
arr[1][2]=206;
System.out.println("Printing a 2D array Using For loop");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println(arr[i][j]);
		System.out.println(" ");
}
	System.out.println("");


	}

}
}
