import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string for reverse it.");
		String inp = sc.nextLine();
				
		String rev = "";
		for(int i=inp.length()-1; i>=0; i--) 
                {    rev = rev + inp.charAt(i);    }          						
                
		System.out.println(rev);
}
}