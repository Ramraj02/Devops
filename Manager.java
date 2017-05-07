
public class Manager {
public static void main (String[]args)
{
	TwoWheeler a=new TwoWheeler();
	System.out.println("Cost of Two Wheeler"+a.getCost());
	System.out.println("Speed of Two Wheeler"+a.getSpeed());
	ThreeWheeler b=new ThreeWheeler();
	System.out.println("Cost of Three Wheeler"+b.getCost());
	System.out.println("Speed of Three Wheeler"+b.getSpeed());
	FourWheeler c=new FourWheeler();
	System.out.println("Cost of Four Wheeler"+c.getCost());
	System.out.println("Speed of Four Wheeler"+c.getSpeed());
	
}

	
	
}
