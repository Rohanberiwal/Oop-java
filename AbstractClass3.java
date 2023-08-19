import java.util.*;

class Main 
{
    public static  class Car implements Engine , Tires , Media{
        @Override
        public void high()
        {
            System.out.println("the tiers are large") ;
        }
        @Override
        public void low()
        {
            System.out.println("the tires are low") ;
        }
        @Override
        public void loud ()
        {
            System.out.println("volume high ") ;
        }
        @Override
        public void close()
        {
            System.out.println("Volume low") ;
        }
        @Override
        public void powerup()
        {
            System.out.println("the power is high ") ;
        }
        @Override
        public void powerdown()
        {
            System.out.println("the power is low") ;
        }
    }
    public interface Tires 
    {
        void high() ;
        void low() ;

    }
    public interface Media 
    {
        void loud() ;
        void close() ;

    }
    public interface Engine 
    {
        void powerup() ;
        void powerdown() ;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        Car  car = new Car() ;
        car.high() ;
        car.low() ;

    }
}
