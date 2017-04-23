
public class Calculator {
	//without return and without arg.
	void add()
	{
		int a =10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}
	//without return and with arg.
	void sub(int a, int b)
	{
		int sub=b-a;
		System.out.println(sub);
	
	}
	//with return and without arg.
	int mul()
	{
		int a=2;
		int b=3;
		int mul=a*b;
		return mul;
					
	}
	//with return and with arg.
	int div(int a, int b)
	{
		int div =a/b;
		return div;
	}
	public static void main (String [] args)
	{
		Calculator a1=new Calculator();
		a1.add();
		a1.sub(20, 2);
		int mul=a1.mul();
		System.out.println(mul);
		int div=a1.div(15, 3);
		System.out.println(div);
		
	}
	
}
