import java.util.Scanner;
class DiagonalMatrix
{
	public static void main(String args[])
	{
		int sum=0, counter=0;
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.println("Enter the ele");
				arr[i][j] = sc.nextInt();
				counter = arr[j][i];
				System.out.println(counter);
			}
		}
		
		for(int x[]: arr)
		{
			for(int y : x)
			{
				System.out.print(" "+y);
				sum = sum+y;
			}
			System.out.println(" ");
				
		}
		System.out.println("sum is: "+sum);
	}
}