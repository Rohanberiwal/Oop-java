import java.util.*;
class  Main 
{
    public static class a{
        public interface nestedinterface 
        {
           void shoutout() ;
           
        }
    }
    public static class B implements a.nestedinterface
    {
        @Override
       public  void shoutout()
        {
            System.out.println("heyyy!") ;
        }
    }
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        B b = new B() ;
        b.shoutout() ;

    }
}
