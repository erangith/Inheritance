//Dadayakkara Dewege Poorna
//Inheritance to set up a logical class hierarchy.

import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class Persons
{
  public static void main(String[] args) throws Exception
  {
    Address address1, address2, address3, address4, address5;
    Employee employee1, employee2;
    Student student;
    Person person;
    GraduateStudent graduateStudent;
    Job job1,job2,job3;
    Publication publication1,publication2;
    
    address1 = new Address(150, "University avenue","Wolfville","b4P2R6");
    address2 = new Address(303, "Highland Avenue", "Wolfville","b4P3R6");
    address3 = new Address(421, "flower avenue", "Wolfville","b4P5R6");
    address4 = new Address(904, "rose tree avenue", "Wolfville","b4P6R6");
    address5 = new Address(123, "Acadia avenue", "Wolfville","b4P7R6");
    
    student = new Student("Sashen", "Dilhara", 19, address1, 100123453);
    
    person = new Person("Kevin", "Peterson", 38, address2);
    
    job1=new Job("cleaning job",2300);
    job2=new Job("IT JOB",2300);
    job3=new Job("Painting job",4000);
    
    publication1=new Publication("nature","sunday times",23,new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2013"));
    publication2=new Publication("sports","Oxford world",24,new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2003")); 
    
    ArrayList<Publication>k1=new ArrayList<Publication>();
    
    k1.add(publication1);
    k1.add(publication2);
    
    ArrayList<Job>t1=new ArrayList<Job>();
    
    t1.add(job1);
    t1.add(job2);
    t1.add(job3);
    
     ArrayList<Job>t2=new ArrayList<Job>();
    
    t2.add(job1);
    t2.add(job2);
    t2.add(job3);
     
    
    graduateStudent = new GraduateStudent("Hasith", "Fernando", 28 , address5, 10034567,k1);
    
    employee1 = new Employee("Vishwa", "fernando", 35, address3,t1);
    employee2 = new Employee("Himash", "fernando", 82, address4,t2);
    
    System.out.println(employee1 + "\n");
    System.out.println(employee2 + "\n");
    System.out.println(student + "\n");
    System.out.println(person + "\n");
    System.out.println(graduateStudent + "\n");
  }
}