class Employee{
	private int empId;
	private String empName;
	Employee(){		
		this(101,"abc");
		
	}
	Employee(int empId,String empName){
		
		this.empId = empId;
		this.empName = empName;
		
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class ThisConstDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		e.show();
		
	}
}