// abstrtact class constructor are not allowed 
//static mehtod are those which cannot be overrideen 
// abstract method are pointless 
// multiple inhertiance is still not allowed using the abstrasct class  '
// static variable are object independent , they dont require any objects 
 // interfaces may have static final variable 
// type of interface is allowed during the object creation  
// interfaces can extends multiple interfaces
// annotation is also a intefaces the internal working 
// default inside is used so that therer is no breaking of the code and the continuity remians the same 
// static method are never inherited 
// static method must have a boyd always 



// basic interface question s
import java.util.*;
class main
{
    public static void main(String agrs[])
    {
        Scanner  sc  = new Scanner(System.in) ;
        boolean done  = false ;
        while(done!=true)
        {
            try
            {
                System.out.println("enter a number");
                int s  = sc.nextInt() ;

            }
            catch(InputMismatchException s )
            {
                System.out.println("Somehting went wrong");
                System.out.println("enter again");
            }
            finally
            {
                System.out.print("This will always execte") ;
                done =  true   ;
            }
        }
    }
}
// abstract class 
import java.util.*;
class main
{
    public static abstract class parent
    {
        public String name  ;
        abstract void carrer() ;
        abstract void car() ;
    }
    public static class Son extends parent  
    {
        @Override
        public void carrer() 
        {
            System.out.println("Hi i am a software eng") ;

        }
        @Override
        public void car()
        {
            System.out.println("I own a bmw car") ;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Hi") ;
        Son s  = new Son() ;
        s.name   = "Rohan" ;
        System.out.println("NAME "+s.name) ;
        s.carrer() ;
        s.car() ;
    }
}
// using the constructors 
import java.util.*;
class main
{
    public static abstract class parent
    {
        public String name  ;
        abstract void carrer() ;
        abstract void car() ;
    }
    public static class Son extends parent  
    {
        public Son(String name)
        {
            super() ;
            this.name   = name  ;
        }
        @Override
        public void carrer() 
        {
            System.out.println("Hi i am a software eng") ;

        }
        @Override
        public void car()
        {
            System.out.println("I own a bmw car") ;
        }
    }
    public static void main(String args[])
    {
        System.out.println("Hi") ;
        Son s  = new Son("Rohan") ;
       // s.name   = "Rohan" ;
        System.out.println("NAME "+s.name) ;
        s.carrer() ;
        s.car() ;
    }
}

 import java.util.*;
class main
{
    public interface engine 
    {
        public void clean() ;
        public void start() ;
        public void stop() ;
    }
    public static class Car 
    {
        String name  ;
        int age   ;
        public Car(String name , int age) 
        {
            this.name =  name ; 
            this.age  = age ;
        }
    }
    public static class bmw extends Car implements engine 
    {
        public bmw(String name  , int age)
        {
            super("bmw", 2) ;
            
        }
        @Override
        public void clean() 
        {
            System.out.println("cleaned");
        }
         @Override
        public void start () 
        {
            System.out.println("started");
        }
         @Override
        public void stop() 
        {
            System.out.println("stopped");
        }

    }
    public static void main(String agrs[])
    {
        bmw b = new bmw("bmw",2 ) ;
        b.clean() ;
        b.start() ;
        b.stop() ;
    }
}

// question on poly 
import java.util.*;
class main
{
    public static class Car
    {
        String name  ;
        String brand  ;
        public Car(String name  , String brand)
        {
            this.name  = name  ;
            this.brand =  brand ;
        }

    }
    public interface move
    {
        public void moving() ;
        public void stop() ;
    }
    public interface media
    {
        public void play() ;
        public void stopmed() ;
    }
    public static class bmw extends Car implements move , media
    {
        public bmw()
        {
            super("x1" ,"bmw") ;
        }
       @Override
       public void moving()
       {
        System.out.println("This is moving") ;
       }
        @Override
       public void stop()
       {
        System.out.println("This is stoping") ;
       }
        @Override
       public void play()
       {
        System.out.println("hi radio media") ;
       }
        @Override
       public void stopmed()
       {
        System.out.println("bye from radio ") ;
       }

    }
    public static class audi extends Car implements media , move 
    {
        public audi()
        {
            super("audi" ,"audi") ;
        }
        @Override
       public void moving()
       {
        System.out.println("audi audi audi ") ;
       }
        @Override
       public void stop()
       {
        System.out.println("stop stop ") ;
       }
        @Override
       public void play()
       {
        System.out.println("radio started") ;
       }
        @Override
       public void stopmed()
       {
        System.out.println("stopped radio ") ;
       }

    }
    public static void main(String args[])
    {
        audi au  = new audi() ;
        bmw ax   = new bmw() ;
        au.play() ;
        au.stopmed() ;
        ax.moving() ;
    }
}
// concrete method inside the interfaces 
import java.util.*;
class main
{
    public static class Car
    {
        String name  ;
        String brand  ;
        public Car(String name  , String brand)
        {
            this.name  = name  ;
            this.brand =  brand ;
        }

    }
    public interface move
    {
        public void moving() ;
        public void stop() ;
        static void hello()
        {
            System.out.println("This is hello from the interface move") ;
        }
    }
    public interface media
    {
        public void play() ;
        public void stopmed() ;
    }
    public static class bmw extends Car implements move , media
    {
        public bmw()
        {
            super("x1" ,"bmw") ;
        }
       @Override
       public void moving()
       {
        System.out.println("This is moving") ;
       }
        @Override
       public void stop()
       {
        System.out.println("This is stoping") ;
       }
        @Override
       public void play()
       {
        System.out.println("hi radio media") ;
       }
        @Override
       public void stopmed()
       {
        System.out.println("bye from radio ") ;
       }

    }
    public static class audi extends Car implements media , move 
    {
        public audi()
        {
            super("audi" ,"audi") ;
        }
        @Override
       public void moving()
       {
        System.out.println("audi audi audi ") ;
       }
        @Override
       public void stop()
       {
        System.out.println("stop stop ") ;
       }
        @Override
       public void play()
       {
        System.out.println("radio started") ;
       }
        @Override
       public void stopmed()
       {
        System.out.println("stopped radio ") ;
       }
       public void  hel()
       {
        move.hello();
       }

    }
    public static void main(String args[])
    {
        audi  au  = new audi() ;
        bmw ax   = new bmw() ;
       
        au.play() ;
        au.stopmed() ;
        ax.moving() ;
       au.hel() ;
    }
}


// array list 
import java.util.*;
class Main 
{
    public static  class CustomArray
    {
        private int[]  data  ;
        private static int dsize  = 100 ;
        private int size  = 0 ;

        public CustomArray() 
        {
            this.data  = new int[dsize] ;
        }
        public void add(int num)
        {
            if(this.isfull())
            {
                resize() ;
            }
            data[size++] = num ;
        }
        public boolean isfull()
        {
            return size == data.length ;
        }
        public void resize()
        {
           int temp[]  = new int[data.length*2] ;
           for(int i = 0 ; i<data.length ; i++)
           {
                temp[i] = data[i] ;
           }
        }
        @Override
        public String toString()
        {
            return "custom arraylist "+Arrays.toString(data) ;
        }

    }
    public static void main(String args[])
    {
            CustomArray arr = new CustomArray() ;
            arr.add(10) ;
            arr.add(30) ;
            System.out.println(arr.toString()) ;
    }
}

// comparable interface 
import java.util.*;
class Main 
{

    public static class Student implements Comparable<Student>
    {
        String name  ;
        int marks ; 
        public Student(String name)
        {
            this.name = name  ;
        }
        @Override
        public int  compareTo(Student s)
        {
            int diff = this.marks-s.marks ;
            if (diff ==0 )
            {
                System.out.println("eqaul marks") ;
            }
            else if(diff<0)
            {
                System.out.println("Student "+s.getName()) ;
            }
            else 
            {
                System.out.println("Student "+this.getName()) ;
            }
            return 0 ;
        }
        public String getName()
        {
            return name  ;
        }
    }
    public static void main(String[] args)
    {
        Student rohan  = new Student("Rohan") ;
        Student raghu  = new Student("raghu") ;
        rohan.marks = 100 ;
        raghu.marks  = 90 ;
        rohan.compareTo(raghu);
    }

}
// more 
import java.util.*;
class Main
{
    public static void main(String agrs[])
    {
        int a = 0 ;
        int b  = 5 ;
        try 
        {
            int c  = b/a  ;
        }
        catch(ArithmeticException e)
        {
            System.out.printf("The answer for this cannot be determined") ;
        }
        finally
        {
            System.out.println("This is always exec" ) ;
        }
    }
}
// get meassege is inbuilt 
import java.util.*;
class Main
{
    public static void main(String agrs[])
    {
        int a = 0 ;
        int b  = 5 ;
        try 
        {
            int c  = b/a  ;
        }
        catch(ArithmeticException e)
        {
            System.out.printf(e.getMessage()) ;
        }
        finally
        {
            System.out.println("This is always exec" ) ;
        }
    }
}

// exception basic 
import java.util.*;
class Main
{
    public static void main(String agrs[])
    {
        int a = 0 ;
        int b  = 5 ;
        
            try
            {
                int c  = b/a  ;

            }
            catch(ArithmeticException e )
            {
                System.out.println("this is not fair ") ;
                throw new ArithmeticException("How can u divide iot by zero ? ");

            }
        
    }
}
// customs 
import java.util.*;
class Main 
{
    public static class Customs<T>
    {
        private Object key  ;
        private Object value  ;
        int size  = 10 ;
        int  count =  0 ;
        Map<Object , Object> hashMap = new HashMap<>();
        public  Customs(Object key  , Object  value)
        {
            this.key = key  ;
            this.value = value  ;
        }
        public void adder(Object key  , Object value)
        {
           hashMap.put(key , value) ;
            count ++ ;
        }
        public void remove(int key)
        {
            hashMap.remove(key, value) ;
            count = count -1; 

        }
        public void  counter()
        {
            System.out.println(count) ;
        }
        public void printer()
        {
            for (Map.Entry<Object , Object> entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        }
        
    }
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in) ;
            int a  = sc.nextInt()  ;
            int b  = sc.nextInt()  ;
            Customs<Integer> s  = new Customs<Integer>(a,b) ;
            try
            {
                int c  = b/a  ;

            }
            catch(ArithmeticException e )
            {
                throw new ArithmeticException("Are u sure this is correct ? ");
            }
            finally
            {
                System.out.println("hi ") ;
            }
    }
}
//tutorials 2
import java.util.*;
class Main 
{
    public static class Square 
    {
        int side  ;
        public Square(int side)
        {
            this.side = side  ;
        }
        public void area()
        {
            System.out.println((this.side)*(this.side)) ;
        }
        public void perimeter()
        {
            System.out.println((this.side)*4) ;
        }
    }
    public static void main(String args[])
    {
        Square s = new Square(4)  ;
        s.area();
        s.perimeter();
    }
}
// stone , papeer , scissor tutr -2 
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        int rock  = 0 ;
        int paper  =1  ;
        int sci = 2 ;
        Random rm = new Random();
        int num = rm.nextInt(3);
        Scanner sc  = new Scanner(System.in) ;
        int val = sc.nextInt() ;
        if(num == val )
        {
            System.out.print("Tie") ;
        }
        else if(val==1 && num ==0 )
        {
            System.out.println("Lose") ;
        }
        else if(val ==2 && num ==0 )
        {
            System.out.println("lose") ;

        }
        else 
        {
            System.out.println("You won") ;
        }
        
    }

}

/// this is the differentation  , integrartion solver 
public class Main {
    public static double differentiate(Function<Double, Double> function, double x, double h) {
        double xPlusH = x + h;
        double y1 = function.apply(x);
        double y2 = function.apply(xPlusH);
        return (y2 - y1) / h;
    }

    public static void main(String[] args) {
        // Define your function as a lambda expression tion<Double, Doublor an instance of Funce>
        Function<Double, Double> f = x -> x * x;

        double x = 2.0; // The point at which you want to compute the derivative
        double h = 0.001; // Step size
        double derivative = differentiate(f, x, h);
        
        System.out.println("Derivative at x = " + x + " is " + derivative);
    }
}
// smartphone and normal phone 
import java.util.*;
class Main 
{
    public static  class Phone
    {
        int number  ;
        public Phone(int number)
        {
            this.number  = number ;
        }
        public void  call()
        {
            System.out.println("Call connected") ;
        }
    }
    public static class smart extends Phone
    {
        public smart(int number)
        {
            super(number) ;
        }
        public void camera()
        {
        System.out.println("Camera on") ;
        }
         public void cal()
        {
        System.out.println("cal on ") ;
        }
         public void Wifi()
        {
        System.out.println("connected ") ;
        }
         public void Phonecall()
        {
        System.out.println("Dailing") ;
        }
    }
    public static void main(String agrs[])
    {
        Scanner sc = new Scanner(System.in) ;
        smart s  = new smart(987) ;
        s.cal() ;
        s.Phonecall() ;
        s.camera() ;
        s.call() ;
    }
}
// comparable and equals
import java.util.*;

class Main {
    public static class Student implements Comparable<Student> {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student otherStudent) {
            // Compare students based on their names
            int nameComparison = this.name.compareTo(otherStudent.name);
            
            if (nameComparison == 0) {
                // If names are the same, compare based on age
                return Integer.compare(this.age, otherStudent.age);
            }
            
            return nameComparison;
        }
    }

    public static void main(String args[]) {
        Student s1 = new Student("rohan", 19);
        Student s2 = new Student("Raghu", 20);
        Student s3 = s1;
        
        System.out.println(s3.equals(s1));
        System.out.println(s1.equals(s1));
        System.out.println(s1.equals(s2));
        
        // Now, let's use compareTo
        int comparisonResult = s1.compareTo(s2);
        if (comparisonResult < 0) {
            System.out.println("s1 comes before s2");
        } else if (comparisonResult > 0) {
            System.out.println("s2 comes before s1");
        } else {
            System.out.println("s1 and s2 are equal");
        }
    }
}

// deep and shallow copy 
import java.util.*;
class Main 
{
    public static class Car implements Comparable<Car>
    {
     String name ; 
     int number  ;
     public Car(String name  , int age)
    {
        this.name  = name ;
        this.number   = number  ;
    }
    @Override
    public int compareTo(Car s1)
    {
        if(s1.name == this.name && s1.number  == this.number)
        {
            return 1 ;
        }
        return  0 ;
    }

    }
    public static void main(String args[])
    {
        Car c  = new Car("audi" , 5) ;
        Car c1   = new Car("aston" , 5) ;
        Car c3 = c ;
        System.out.println(c1.equals(c3)) ;
        System.out.println(c.equals(c3)) ;
        System.out.println(c3.equals(c)) ;

    }
}
// clonable 
import java.util.*;
class Main
{
    public static class Student implements Cloneable 
    {
        int age ;
        String name  ;
        public Student(int age , String name)
        {
            this.age  = age ; 
            this.name   =name  ;
        }
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

    }
    public static  void main(String args[]) throws CloneNotSupportedException
    {
        Student s  = new Student(2, "Rohan") ;
        Student s2 = new Student(5 , "aman") ;
        try 
        {
           Student s3 = (Student)s.clone() ;
           System.out.println("Name "+s3.name+"age "+s3.age) ;
        }
        catch (CloneNotSupportedException e)
        {
            throw new CloneNotSupportedException("The cloning cannot be done") ;
        }
        finally
        {
            System.out.println("This is not important") ;
        }
    }
}
// easy linkedlist yusing the generics 

import java.util.*;
class Main 
{
    public static  class  Linked
    {
        int data  ;
        int data2 ;
        int size  ;
        String next ;
        HashMap<Integer ,   Integer> ls  = new HashMap<>() ;
        
        public void add(int data , int data2)
        {
            ls.put(data  , data2) ;
            size ++ ;
            next = null; 
        }
        public void count()
        {
           System.out.println(size) ;
        }
        public void printer(int data)
        {
            System.out.println(ls.get(data));
        }
    }
    public static void main(String[] agrs)
    {
        Linked lm  = new Linked() ;
        lm.add(1,2) ;
        lm.add(1,2) ;
        lm.add(1,2) ;
        lm.count() ;
        lm.printer(1) ;
          

    }
}
// conainer 
import java.util.*;
class Main 
{
    public static class Container
    {
        int data  ;
        int size = 0 ;
        int dsize =10 ;
        int datax[] = new int[dsize] ;
        public void add(int num)
        {
            datax[size] = num ; 
            size ++ ;
        }
        public void remove(int num)
        {
            for(int i = 0 ; i<size ; i++)
            {
                if (datax[i]==num)
                {
                    datax[i] = 0 ;
                    size -- ;
                    System.out.println("removed "+num) ;
                }
            }
        }
        public void  checker()
        {
            System.out.println(size) ;
        }

    }
    public static void main(String args[])
    {
        Container c = new  Container() ;
       
            c.add(1) ;
            c.add(2) ;
            c.add(3) ;
            c.checker() ;
            c.remove(2) ;
         
       
    }
}
// generic implementation 
import java.util.*;
class Main 
{
    public static class Container<T>
    {
        Object data  ;
        int size = 0 ;
        int dsize =10 ;
        Object datax[] = new Object[dsize] ;
        public void add(T num)
        {
            datax[size] = num ; 
            size ++ ;
        }
        public void remove(T num)
        {
            for(int i = 0 ; i<size ; i++)
            {
                if (datax[i]==(Object)(num))
                {
                    datax[i] = 0 ;
                    size -- ;
                    System.out.println("removed "+num) ;
                }
            }
        }
        public void  checker()
        {
            System.out.println(size) ;
        }

    }
    public static void main(String args[])
    {
        Container<Integer> c = new  Container<Integer>() ;
        c.add(1) ;
        c.add(3) ;
        c.checker() ;
        Container<String> x  = new Container<String>() ;
        x.add("Rohan") ;
        x.add("aman") ;
        x.add("rohit") ;
        x.checker() ;
       
    }
}
