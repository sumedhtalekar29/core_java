class A
	{
		A()
		{
			this(10,20);
			System.out.println("In non-para of A");	//3
		}
		A(int a)
		{
			System.out.println("In single para of A");  //1
		}
		A(int a1,int a2)
		{
			this(30);
			System.out.println("In double para of A");  //2
		}
	}

	class B extends A
	{
		B()
		{
			this(10);
			System.out.println("In non-para of B");   //5
		}
		B(int b)
		{
			System.out.println("In para of B");  //4
		}
	}

	class Q47
	{
		public static void main(String[] args)
		{
			B obj=new B();
		}
	}