import java.util.*;

  class Student

{

     String name;
     int rollno;
	 int age; 
     int score;
     void set(String name , int rollno,int age,int score)
    {
     this.name = name;
     this.rollno  = rollno;
	 this.age = age;
	 this.score = score;
    }

     void show()
    {
         System.out.println(name+" "+rollno+" "+age+" "+score);
    }

 }

      public class Q40
    {

     public static void main(String args[])

    {
              
          Scanner scanner = new Scanner(System.in);
		  System.out.println("How many Student you want");
          int count = scanner.nextInt();
          Student s1[] = new Student[count];

         for(int i=0;i<s1.length;i++)
           {

            System.out.println("nEnter your name = ");
            String name = scanner.next();
 
             System.out.println("Enter your rollno = ");
            int rollno = scanner.nextInt();

            System.out.println("Enter your age = ");
            int age = scanner.nextInt();

            System.out.println("Enter your score = ");
            int score = scanner.nextInt();

             Student p = new Student();

              p.set(name,rollno,age,score);

              s1[i] = p;

             }
          

     for(int i = 0 ; i<s1.length ; i++)

 {	
 if(s1[i].score >=0 && s1[i].score <=50)
 {
	System.out.println("Category one score [0-50]");
	s1[i].show();
 }
else if(s1[i].score >50 && s1[i].score <=65)
   {
     System.out.println("\nCategory one score [50-65]");
     s1[i].show();
   }             
else if(s1[i].score >65 && s1[i].score <=80)
{
   System.out.println("\nCategory one score [65-80]");
   s1[i].show();
}      

else if(s1[i].score >80 && s1[i].score <=100)
{
	System.out.println("\nCategory one score [80-100]");
	s1[i].show();
 }      
else
{
	System.out.println("Not valid in score");
    s1[i].show();

 }

}
      
}


}



