import java.util.*;
class Main 
{
    public static class Comparision implements Comparator<Student>
    {
        @Override
        public int compare(Student s , Student y)
        {
            return Integer.compare(s.getCgpa() , y.getCgpa()) ;
        }

    }
    public static class Student
    {
        int cgpa ; 
        String name  ;
        public Student(String name  , int cgpa)
        {
            this.name  = name  ;
            this.cgpa =  cgpa ; 
        }
        public int getCgpa()
        {
            return this.cgpa  ;
        }
        public String getname()
        {
            return this.name ;
        }
    }
    public static void main(String[] args)
   {
     List<Student> list  = new ArrayList<Student>() ;
     list.add(new Student("Rohan" , 10)) ;
     list.add(new Student("rohit", 9)) ;
     list.add(new Student("Raghu" , 7)) ;
     Comparator<Student> sz  = new Comparision() ;
     Collections.sort(list , sz) ;
     for(Student sm  : list) 
     {
        System.out.println(sm.getname()+" "+sm.getCgpa()) ;
     }
   } 
}
