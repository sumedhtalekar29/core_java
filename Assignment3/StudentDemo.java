class Student{
	private int rno;
	private String name;
	void setData(int no,String sname){
			rno=no;
			name=sname;
	}
	void showData() {
		System.out.println(rno+" "+name);
	}
}

class StudentDemo{
	public static void main(String args[]){
		Student s1=new Student();
		s1.setData(101,"abc");
		s1.showData();
	}
}
