
public class Datatypes {
static int a = 15;
int b=39;
public static void main (String [] args)
{
	System.out.println(a);//print Static Global variable
	Datatypes a1=new Datatypes();// create object for non-static variable 
	System.out.println(a1.b);//print non-static variable b using object a1
	a1.b=21;//initialize variable b using object a1
	Datatypes a2=new Datatypes();//again create another object for non-static variable
	System.out.println(a2.b);//print non-static b using a2 object 
	System.out.println(a1.b);//print non-static variable b using new value
		
}
}
