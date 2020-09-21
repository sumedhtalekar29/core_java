class Student1{
	private int rno;
	private String name;
	 static int count =0;
	void setData(int no,String sname){
			rno=no;
			name=sname;
	}
	void showData() {
		System.out.println(rno+" "+name);
		count++;
            System.out.println("no of stud object ="+count);
	}
}

class StudentDemo1{
	public static void main(String args[]){
		Student1 s1=new Student1();
		s1.setData(101,"abc");
		s1.showData();
		Student1 s2=new Student1();
		s2.setData(102,"xyz");
		s2.showData();
	}
}
