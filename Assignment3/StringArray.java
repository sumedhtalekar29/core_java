import java.util.Scanner;
class StringArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[2];
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the element");
			arr[i] = sc.next();
		}
		
		for(String x : arr)
		{
			System.out.print(" " +x);
		}
		System.out.println(" ");
	}
}