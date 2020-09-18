import java.util.Scanner;
class Circle{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r = sc.nextInt();
		Double a;
		Double c;
		a= Math.PI*(r*r);
		c=Math.PI*(2*r);
		System.out.println("Area of circle = "+a);
		System.out.println("Circumference of circle = "+c);
	}
}