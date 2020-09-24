import java.util.*;
class MathOp
{
	void multiply(int a,int b)
	{
		int m= a * b;
		System.out.println("Multiplication="+m);
	}
	void multiply(float a,float b,float c)
	{
		float m= a * b *c;
		System.out.println("Multiplication="+m);
	}
	void multiply(int a[])
	{
		
		int  m=1;
		for(int i=0;i<a.length;i++)
		{
			m=m*a[i];
		}
		System.out.println("Multiplication="+m);
	}
	void multiply(int a,double b)
	{
		double m= a * b;
		System.out.println("Multiplication="+m);
	}
	
}
public class Q36{
	public static void main(String args[]){
	MathOp m1=new MathOp();
	Scanner sc = new Scanner(System.in);
	m1.multiply(10,2);
	m1.multiply(10.1f,2.2f,3.32f);
	int a[]={1,2,3,4,5};
	m1.multiply(a);
	m1.multiply(10,22.2);
	}
}
	