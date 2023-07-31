import java.util.*;
class Fractioncalss 
{
    public static void Scanner()
    {
        
    }
    public static void add(Fraction f , Fraction s)
        {
            Double dsum = (f.dem1)*(s.dem2) ;
            Double nsum = ((f.dem1)*(s.num2)) + ((s.dem2)*(f.num1)) ;
            System.out.println(" "+nsum) ;
            System.out.println("---") ;
            System.out.println(" "+dsum) ;
        }
        public static void subtract(Fraction f , Fraction s)
        {
            Double dsum = (f.dem1)*(s.dem2) ;
            Double nsum = ((f.dem1)*(s.num2)) - ((s.dem2)*(f.num1)) ;
            System.out.println(" "+nsum) ;
            System.out.println("---") ;
            System.out.println(" "+dsum) ;
        }
        public static void multiple(Fraction f , Fraction s)
        {
            Double dsum = (f.dem1)*(s.dem2) ;
            Double nsum = (f.num1)*(s.num2);
            System.out.println(" "+nsum) ;
            System.out.println("---") ;
            System.out.println(" "+dsum) ;
        }
        public static void divide(Fraction f , Fraction s)
        {
            Double dsum = (f.dem1)*(s.num2) ;
            Double nsum = ((s.dem2)*(f.num1)) ;
            System.out.println(" "+nsum) ;
            System.out.println("---") ;
            System.out.println(" "+dsum) ;
        }
    public static class Fraction
    {
        Double num1 ;
        Double dem1 ;
        Double num2 ;
        Double dem2  ;
        
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("welcome to fraction class ") ;
        System.out.println("Choose the operation  ") ;
        System.out.println("1. ADD") ;
        System.out.println("2. MULTIPLY ") ;
        System.out.println("3. DIVIDE  ") ;
        System.out.println("4. SUBTRACT ") ;
        int choice = sc.nextInt() ;
        Fraction f = new Fraction() ;
        System.out.print("enter numerator ") ;
        f.num1 = sc.nextDouble() ;
        System.out.print("enter denomintor  ") ;
        f.dem1 = sc.nextDouble() ;
        System.out.print("\n");
        Fraction s = new Fraction() ;
        System.out.print("enter numerator ") ;
        s.num2 = sc.nextDouble() ;
        System.out.print("enter denomintor  ") ;
        s.dem2 = sc.nextDouble() ;
        if(choice==1)
        {
            add(f,s) ;
        }
        else if(choice ==2)
        {
            multiple(f,s);
        }
        else if(choice ==3)
        {
           divide(f,s) ;
        }
        else 
        {
          subtract(f,s);

        }

    }

}
