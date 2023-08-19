import java.util.*;
class Main
{
    public static class Child implements Mother , Father
    {
        @Override
        public void money()
        {
            System.out.println("I am a iitian") ;
        }
        @Override
        public void values()
        {
            System.out.println("I am rich women ") ;
        }
         @Override
        public void education()
        {
            System.out.println("hey") ;
        }
       
        }
    public static  interface Mother
    {
        void money() ;
        void values() ;
        void education() ;
    }
    public static interface Father
    {
        void money() ;
        void values() ;
        void education() ;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        Child s1  = new Child()  ;
        s1.money() ;
        s1.values() ;

    }
}
