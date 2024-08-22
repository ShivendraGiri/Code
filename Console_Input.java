package hack;

import java.io.Console;
class Console_Input
{
	public static void main(String args[]) {
		Console in = System.console();
		System.out.print("Enter any Integer:");
		int i = Integer.parseInt(in.readLine());
		System.out.println("Integer :" +i);
		System.out.print("Enter any Float:");
		float f= Float.parseFloat(in.readLine());
		System.out.println("Float:"+f);
		System.out.print("Enter any String:");
		String s= in.readLine();
		System.out.println("String :"+s);
		System.out.print("Enter any Character:");
		char ch = (in.readLine()).charAt(0);
		System.out.println("Character:" +ch);
		System.out.print("Enter Password:");
		char pass[]=in.readPassword();
		String spass = String.valueOf(pass);
		System.out.println("Password :" +spass);
	}
}