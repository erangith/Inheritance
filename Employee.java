import java.util.ArrayList;
public class Employee extends Person
{

public ArrayList<Job> pastjobs=new ArrayList<Job>();
  
  
public Employee(String firstName, String lastName, int age, Address address,ArrayList<Job>pastjobs)
{
  super(firstName,lastName, age,address);
  this. pastjobs=pastjobs;
}

  public void setPastJobs(ArrayList<Job> pastjobs) {
        this.pastjobs=pastjobs;
    }

  public ArrayList<Job> getPastJobs(){
    return pastjobs;
    }
    
   public String toString() {
     String x =  "Employee Full name :" +  firstName +  " " + lastName + 
                "\nAge:" + age +"\nAddress:" + address  + "\nPast Jobs:";
     
     for(Job j: this.getPastJobs()){
       x += "\n\t" + j;
     }
     
     return x;
     
     
    }
 
}

                              