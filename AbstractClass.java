import java.util.*;
class Main 
{
    public static abstract class Parent
    {
        abstract void carrer() ;
        abstract void patner()  ;
    }
    public static  abstract class   Daughter extends Parent 
    {
        String name ;
        @Override
       public void carrer()
        {
            System.out.println("The carrer is doctor  ") ;
        }
        @Override
       public  void patner()
        {
            System.out.println("I  live with my husband  ") ;
        }
    }
    public static  abstract class Son extends Parent{
        String name  ;
        @Override
      public   void carrer()
        {
            System.out.println("The carrer is software enginner ") ;
        }
        @Override
      public   void patner()
        {
            System.out.println("I like to live alone ") ;
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        Son s = new Son() ;
        s.carrer()  ;
        s.patner() ;
        Daughter d = new Daughter() ;
        d.carrer() ;
        d.patner() ;

    }
}
