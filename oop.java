import java.util.*;
class Main
{
  public static void detail(Car c)
  {
    System.out.println(" "+c.name);
    System.out.println(c.age);
    System.out.println(c.price);
  }
  public static class Car
  {
    String name ;
    int age ;
    int price ;

    public String getName()
    {
      return name ;
    }
    public int  getAge()
    {
      return age ;
    }
    public int  getPrice()
    {
      return price ;
    }
    public void setName(String name)
    {
      this.name = name ;
    }
    public void setAge(int age)
    {
      this.age = age ;
    }
    public void setPrice(int price)
    {
      this.price = price;
    }

  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    Car c = new Car() ;
    c.setName("maruti") ;
    c.setAge(12) ;
    c.setPrice(20000) ;
    if(c.getName() =="maruti")
    {
      detail(c);
  }
}
}
// 2nd oops code priavte name

import java.util.*;
class Main 
  {
    static void printing(Bank bk)
    {
      System.out.println(" name "+bk.name) ;
      System.out.println(" age "+bk.age) ;
      System.out.println(" banknumber "+bk.banknumber) ;
      
    }
    public static class Bank
      {
        String name ;
        private int age ;
        private int money ;
       private  int banknumber ;
      }
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in) ;
      Bank bk = new Bank() ;
      printing(bk) ;
    }
  }

// 3rd code for oops 
import java.util.*;
class Main
{
  public static class Student
  {
    String name  ;
    int age ;
    int grade  ;
    public Student(String name  , int age , int grade)
    {
      this.name = name ;
      this.age = age ;
      this.grade = grade ;
      System.out.print("name :"+this.name);
       System.out.print("age :"+this.age);
        System.out.print("grade  :"+this.grade);
    }
    public String getname()
    {
      return name ;
    }
    public int getage()
    {
      return age ;
    }
    public int getgrade()
    {
      return grade ;

    }
    public void setname(String name)
    {
      this.name = name ;
    }
       public void setage(int age)
    {
     this.age = age ;
    }
       public void setgrade(int grade)
    {
      this.grade  = grade ;
    }
  }
  public static void main(String args[])
  {
    //Scanner sc = new Scanner() ;
    Student s = new Student("rohan",19,2) ;
   
  }
} 
