class GretestNumber
{
	public static void main(String args[])
	{
		int a=2, b=3, c=4,d;
		d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("grtest value : "+d);
	}
}