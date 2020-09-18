class SwapNumber
{
	public static void main(String args[])
	{
		System.out.println("before swaping");
		int x = 10;
		int y = 20;
		System.out.println("value of x " + x);  
        System.out.println("value of y " + y);  
		System.out.println("after swaping");
		 x = x + y;  
         y = x - y;  
         x = x - y;  
		System.out.println("value of x " + x);  
        System.out.println("value of y " + y); 
	}
}