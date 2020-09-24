class Overload
{
	static void data(int i, int j) 
	{
		System.out.println(i+" "+j);
	}
	
	static void data(float i, float j, float p)
	{
		System.out.println(i+ " "+j+" "+p );
	}
	
	static void data(double q)
	{
		System.out.println(q);
	}
	
	static void data(int r)
	{
		System.out.println(r);
	}
	
	static void data(Integer[] inputArray)
	{
		 for (Integer element : inputArray)
		 System.out.println(element);
	}
}

public class Overloading 
{
	public static void main(String[] args) 
	{
		Overload.data(10, 20);
		Overload.data(10.2f, 20.3f,30.1f);
		Overload.data(10.00);
		Overload.data(10);
		
		 Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Overload.data(integerArray);
	}
}
