package concatenation;

import java.util.Scanner;

public class PalindromeTest {
	
	public static void main(String[] args) 
	{
	 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your String:");
	String str=sc.next();
	String revstr="";
	 
	for(int i=str.length()-1;i>=0;--i){
	revstr =revstr+str.charAt(i);
	}
	 
	System.out.println(revstr);
	 
	if(revstr.equalsIgnoreCase(str)){
	System.out.println("The string is Palindrome");
	}
	else{
	System.out.println("Not Palindrome");
	}
	 
	}
	
}
