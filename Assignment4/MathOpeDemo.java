
import java.util.Scanner;
class MathOpe
{
	static int sum(int i,int j)
	{
		return i+j;
	}
	
	static int sub(int i,int j)
	{
		return i-j;
	}
	
	static int mul(int i,int j)
	{
		return i*j;
	}
	
	static int pow(int i,int j)
	{
        int result = 1;
        while (j != 0)
        {
            result = result*i;
            --j;
        }
		return result;
	}
	
	static void show(int res)
	{
		System.out.println("result :"+res);
	}
}

class MathOpeDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two ele");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int s = MathOpe.sum(i,j);
		int s1 = MathOpe.sub(i,j);
		int s2 = MathOpe.mul(i,j);
		int s3 = MathOpe.pow(i,j);
		MathOpe.show(s);
		MathOpe.show(s1);
		MathOpe.show(s2);
		MathOpe.show(s3);
	}
}