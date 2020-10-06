

class Employee{
	
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Empoyee [empId=" + empId + ", name=" + name + "]";
	}
	
}

public class Q50 {

	public static void main(String[] args) {
		
		Employee obj = new Employee(01, "Sumedh");
		System.out.println(obj);
	}

}