import java.util.*;
class Main 
{
    public static  class Car implements Brake , Engine
    {
        @Override
       public  void acclerate() 
        {
            System.out.print("The car is getting acclerated ") ;
        }
        @Override
      public void speedmeter() 
        {
            System.out.print("The car is at a high speed  ") ;
        }
        @Override
     public  void speedup() 
        {
            System.out.print("the care is increasign the speed ") ;
        }
        @Override
     public  void powerup() 
        {
            System.out.print("The car's horsepower is increasing ") ;
        }
        @Override
       public  void slowdown() 
        {
            System.out.print("The speed is decreasing") ;
        }
        
    }
    public interface Brake
    {
        void acclerate() ;
        void speedmeter() ;
    }
    public interface Engine
    {
        void speedup() ;
        void slowdown() ;
        void powerup() ;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Car car = new Car() ;
        car.slowdown();
        car.speedmeter();
        car.acclerate() ;

    }
}
