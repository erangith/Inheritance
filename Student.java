public  class Student extends Person
{
  protected int studentID;
  
  public Student(String firstName, String lastName, int age, Address address, int studentID)
  {
    super(firstName, lastName, age, address);
   this.studentID = studentID;
  }
  
  public void setStudentID(int studentID)
  {
    studentID = studentID;
  }
  
  public int getStudentID()
  {
    return studentID;
  }
  
  public String toString()
  {
    String result;
    result = "Student Full Name: " + firstName + " " + lastName + "\nAge: " + age + "\nAddress:" + address + "\nStudent ID: " + studentID;
    return result;
  }
}