import java.util.*;
class Main 
{
    public static class Car
    {
        int amount ; 
        String name ; 
        public Car(String name , int amount)
        {
            this.name  = name  ;
            this.amount   = amount ; 
        }
        public void driver()
        {
           System.out.print("car is moving ") ;
        }
        public int getage() {
            return 0;
        }
    }
    public static class sedan extends Car 
    {
        int age ;
        public sedan(String name  , int amount ,int age)
        {
            super(name , amount ) ;
            this.age = age ;
        }
        public int getage() 
        {
            return this.age ;
        }
        public void forty()
        {
            System.out.println("The car is moving at 40kmph") ;
            super.driver() ;
        }
        @Override 
        public void driver()
        {
            this.forty() ;
        }
    }
    public static void main(String[] args)
    {
        Car c  = new Car("bmw",10000) ;
        Car m  = new sedan("bmw",10,100) ;
        System.out.println(" "+c.getage()) ;
        m.driver() ;
    }
}
