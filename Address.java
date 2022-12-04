public class Address
{
  protected int street_Number;
  protected String street_Name, town_Name,postal_Code;
  
  public Address(int street_Number, String street_Name, String town_Name,String postal_Code)
  {
    this.street_Number = street_Number;
    this.street_Name = street_Name;
    this.town_Name =  town_Name;
    this.postal_Code=postal_Code;
  }
  
  public void setStreetNumber(int street_Number) 
  { 
    street_Number = street_Number;
  }
  
  public int getStreetNumber() 
  {
    return street_Number;
  }
  
  public void setStreetName(String street_Name )
  {
  street_Name = street_Name; 
  }
  
  public String getStreetName()
  {
    return street_Name; 
  }
  
  
  public void setTownName(String town_Name)
  {
     town_Name =  town_Name;
  }
  
  public String getTownName()
  {
    return town_Name;
  }
  
  public void setPostalCode(String postal_Code)
  {
    postal_Code=postal_Code;
  }
  
  public String getPostalCode()
  {
    return postal_Code;
  }
 
  
   public String toString()
  {
    String output;
    output =  + street_Number + ", " + street_Name + ", " + town_Name+","+postal_Code;
    return output;
   }
}