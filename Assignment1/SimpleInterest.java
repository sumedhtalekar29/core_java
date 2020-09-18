import java.util.Scanner;
class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of p");
		float p = sc.nextFloat();
		System.out.println("enter the value of r");
		float r = sc.nextFloat();
		System.out.println("enter the value of t");
		float t = sc.nextFloat();
		
		//float p , r , t, si;
		float si = (p*r*t/100);
		
		System.out.println("simple interest : " +si);
	}
}