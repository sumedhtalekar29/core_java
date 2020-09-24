import java.util.Scanner;
class Product{
	int pid;
	int price;
	int quantity;
	Product(int pid,int price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
		
		//System.out.println(pid+" "+price+" "+quantity);
	}
	static int total (Product a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i].price * a[i].quantity;
		}
		return sum;
	}
		
	
}
class ProductDemo{
	public static void main(String args[])
	{
		int l;
		int m;
		int n;
		Scanner sc = new Scanner(System.in);
		Product a[]= new Product[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter values");
			l=sc.nextInt();
			m=sc.nextInt();
			n=sc.nextInt();
			Product p= new Product(l,m,n);
			a[i]=p;
		}
		
		int max=0;
		int maxp=0;
		max=a[0].price;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i].price>=max)
			{
				maxp=a[i].pid;
			}
		}
		System.out.println("PID of product with high price is "+maxp);
		
		int r=Product.total(a);
		System.out.println("Total amount is "+r);
		
		
		
		
	}
}

		