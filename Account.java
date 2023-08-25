import java.util.*;

public class Main 
{
  public static void Name(Account a )
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("user-name ") ;
    String n = sc.nextLine() ;
    a.setName(n);


  }
  public static void Address(Account a )
  {
    Scanner se = new Scanner(System.in) ;
    System.out.println("Address of user  ") ;
    String ad = se.nextLine() ;
    a.setAddress(ad);


  }
  public static void  Balance (Account a )
  {
    Scanner sw = new Scanner(System.in) ;
    System.out.println("Balance   ") ;
    int x  = sw.nextInt() ;
    a.setBalance(x);


  }
  public static void  Accountnumber(Account a )
  {
    Scanner sh = new Scanner(System.in) ;
    System.out.println("account number ") ;
    int n = sh.nextInt() ;
    a.setAnumber(n);
  }

  
  public static void main(String args[])
  {

    Account A=new Account();
    Name(A);
    Address(A);
    Balance(A);
    Accountnumber(A);
        System.out.println("Name :"+A.getName());

        if(A.getBalance()<500)
    {
      System.out.println("You have a balance of less than 500 ") ;
      System.out.println("5 rs dedected for voilating the terms and conditions");
      int s = A.getBalance() ;
      s = s -5 ;
      A.setBalance(s); 

    }
    else 
    {
      System.out.print(" your balance is >500 ");
    }



    
  }
  
  
}


class Account
  {
    String name ;
    String address ;
    int balance ;
    int anumber ;
    public String getName()
    {
      return name ;
    }
    public String getAddress()
    {
      return address ;
    }
    public int getBalance()
    {
      return balance ;
    }
    public int getAnumber()
    {
      return anumber;
    }
    public void setName(String name)
    {
      this.name = name;
    }
    public void setAddress(String address)
    {
      this.address = address ;
    }
    public void setBalance(int balance)
    {
      this.balance = balance ;
    }
    public void setAnumber(int anumber)
    {
      this.anumber = anumber ;
    }
  }
