package inputMethod;

import java.util.Scanner;

public class Student 
{
	int roll;
	String name;
	String email;
	void getInfo()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Rollno");
		roll=sc.nextInt();
		System.out.println("Enter your name");
		name=sc.next();
		//System.out.println("Enter your Email id");
		//email=sc.next();
	}
	
	void display()
	{
	System.out.println("Name :" +name);
	System.out.println("Roll No. : "+roll);
	//System.out.println("Email id : "+email);
	}
	public static void main(String[] args)
	{
	
	Student obj1=new Student();
	Student obj2=new Student();
	System.out.println("calling getInfo with object1..........");
	obj1.getInfo();
	System.out.println("calling getInfo with object2..........");
	obj2.getInfo();
	
	System.out.println("calling display with object1..........");
	obj1.display();
	
	System.out.println("calling display with object2..........");
	obj2.display();
	
	Student obj3=new Student();
	
	for(int i=1;i<=3;i++)
	{
		obj3.getInfo();
		obj3.display();
	}
	}
	
}