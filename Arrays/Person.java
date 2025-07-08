public class Person {
  private String firstName;
  private String lastName;
  private int age;

  public Person(String fr, String la , int age ){
    this.firstName = fr;
    this.lastName = la;
    this.age = age;
  }

  public void displayPerson(){
    System.out.print("Last name: " + lastName);
    System.out.print(", First name: " + firstName);
    System.out.println(", Age: " + age);
  }

  public String getLast(){
    return lastName;
  }

}
