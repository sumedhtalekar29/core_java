import java.util.Scanner;
class Circle{
	private int r;
	private double a;
	void init()
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter radius");
			r=sc.nextInt();
			
	}
	void calculateArea() 
	{
		a=Math.PI*r*r;
	}
	void display() 
	{
		System.out.println("Radius = "+r);
		System.out.println("Area = "+a);
	}
}
class CircleDemo{
	public static void main (String args[]){
		Circle c = new Circle();
		c.init();
		c.calculateArea();
		c.display();
	}
}
