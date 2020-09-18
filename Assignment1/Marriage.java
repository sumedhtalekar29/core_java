import java.util.Scanner;
class Marriage{
	public static void main (String args[]) {
			int age;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter gender");
			char g=sc.next().charAt(0);
			System.out.println("Enter age");
			age=sc.nextInt();
			if(g=='m' || g=='M')
			{
				if(age>21)
				{
					System.out.println("eligible for marriage");
				}
				else
				{
					System.out.println("not eligible for marriage");
				}
			}
			else if(g=='f' || g=='F')
			{
				if(age>18)
				{
					System.out.println("eligible for marriage");
				}
				else
				{
					System.out.println("not eligible for marriage");
				}
			}
			
	}
			
	
}
			