class Employee{
	static int empNo=0;
	double salary;
	static double totalSalary=0;
	Employee(double salary)
	{
		empNo=empNo+1;
		totalSalary=totalSalary+salary;
	}
	void show()
	{
		System.out.println("empno="+empNo);
		System.out.println("Total salary="+totalSalary);
	}
}
class Q38{
	public static void main(String args[]){
		Employee e1= new Employee(1000);
		Employee e2= new Employee(2000);
		Employee e3= new Employee(3000);
		Employee e4= new Employee(4000);
		e4.show();
	}
}

		