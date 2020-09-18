import java.util.Scanner;
class FahrenheittoCelsius
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Fahrenheit temperature");
        double f = sc.nextDouble();
        double c = 5*(f-32)/9;
        System.out.println("Celsius temperature is = "+c);
	}
}