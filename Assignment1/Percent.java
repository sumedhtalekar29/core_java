import java.util.Scanner;
class Percent{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks in 5 subjects");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		System.out.println("Enter Total marks in 5 subjects");
		int mt = sc.nextInt();
		int sum = (m1+m2+m3+m4+m5);
		double per = sum*100/mt;
		System.out.println("Sum of 5 subjects = "+sum);
		System.out.println("Percent of 5 subjects = "+per);
		
	}
}