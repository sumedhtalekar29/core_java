class Person
{
	int age;
	String name;
	Person()
	{
		age=18;
	}
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	void show()
	{
		System.out.println("Age="+age);
		
		System.out.println("Namme="+name);
	}
}

public class Q37{
	public static void main(String args[]){
		Person p=new Person();
		Person p1=new Person(20,"abc");
		p1.show();
		p.show();
	}
}
		
		