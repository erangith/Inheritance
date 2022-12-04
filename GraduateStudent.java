import java.util.ArrayList;
public  class  GraduateStudent extends Student 
{
 
 protected ArrayList listpublications=new ArrayList<String>();
  
  
  public GraduateStudent(String firstName, String lastName, int age, Address address, int studentID,ArrayList<Publication> listpublications)
  {
    super(firstName, lastName, age, address, studentID);

   this. listpublications = listpublications;
  }
  
  
   public void setPublications(ArrayList<String>listpublication) 
   {
  
     this.listpublications =listpublications; 
   }
    
  
  
  public ArrayList<Publication>getPublications(){
    return listpublications;
  }
  
  public String toString()
  {
    String result;
    result = "Graduate student Full Name: " + firstName + " " + lastName + "\nAge: " + age + "\nAddress" + address + "\nStudent ID: " + studentID + "\nPublications: " + listpublications;
    return result;
  }
}   
      
      
      
      
       
          
          
          
          
          
          
          
          