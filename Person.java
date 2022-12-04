 public   class Person
{
  protected String firstName, lastName;
  protected int age;
  protected Address address;
  
  public Person(String firstName, String lastName, int age, Address address)
  {
    this. firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.address = address;
  }
  
 public void setFirstName(String firstName) 
  { 
    firstName = firstName;
  }
  
  public void setLastName(String lastName)
  {
   lastName = lastName; 
  }
  
  public void setAge(int age)
  {
    this.age = age;
  }
  
  public void setAddress(int street_Number, String street_Name, String town_Name,String postal_Code)
  {
    address = new Address(street_Number, street_Name, town_Name,postal_Code);
  }
  
  public String getFirstName() 
  {
    return firstName;
  }
  
  public String getLastName()
  {
    return lastName; 
  }
  
  public int getAge()
  {
    return age;
  }
  
  public String getAddress()
  {
    return address.toString();
  }
  
   public String toString()
  {
    String result;
    result = "Person Full Name: " + firstName + " " + lastName + "\nAge: " + age + "\nAddress:" + address;
    return result;
    
   }
 }