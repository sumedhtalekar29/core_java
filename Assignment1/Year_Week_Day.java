import java.util.Scanner;
public class Year_Week_Day 
{
    public static void main(String args[])
    {
        int n, y, m, d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days");
        n = s.nextInt();
        y = n / 365;
        n = n % 365;
        System.out.println("Number of years:"+y);
        m = n / 12;
        n = n % 12;
        System.out.println("Number of weeks:"+m);
        d = n;
        System.out.println("Number of days:"+d);
    }
}