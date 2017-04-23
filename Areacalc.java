
public class Areacalc {
	void square() //without return and without argument
	{
		int a=2;
		int squ;
		squ = a*a;
		System.out.println("Area of Square="+squ);
	}
	double triang() //with return and without argument
	{
		int b=3;
		int h=10;
		double triang=(b*h)/2;
		return triang;
	}
	int rect(int w, int h) // with return and with argument
	{
		int rect = w*h;
		return rect;
	}
	double circle(int r)//with return and with argument
	{
		double pi=3.14;
		double circle=pi*r*r;
		return circle;
	}
		
public static void main (String [] args)
{
	Areacalc a1=new Areacalc();
	a1.square();
	double triang =a1.triang();
	System.out.println("Area of Triangle="+triang);
	int rect=a1.rect(10, 20);
	System.out.println("Area of Rectangle="+rect);
	double circle =a1.circle(5);
	System.out.println("Area of Circle="+circle);
}
}