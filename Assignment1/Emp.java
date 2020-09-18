import java.util.Scanner;
class Emp
{
	public static void main(String a[])
	{
		double B_salary, G_salary, HRA, DA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary of emp");
		B_salary = sc.nextDouble();
		
	   if(B_salary<10000)
	   {
		   HRA=0.1*B_salary;
		   DA=0.9*B_salary;
	   }
	   else
	   {
		   HRA=2000;
		   DA=0.98*B_salary;
	   }
	   
	   G_salary = B_salary + HRA + DA;
	   System.out.println("gross salary : "+G_salary);
	}
}
	