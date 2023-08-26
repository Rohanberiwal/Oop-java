import java.util.*;
public class Liberarian
    {
        Scanner ls = new Scanner(System.in) ;
        public  void register()
        {
            System.out.print("Name :");
            String Name  = ls.nextLine() ;
            System.out.print("Age :");
            int Age = sc.nextInt() ;
            System.out.print("Phone no :") ;
            int phone  = sc.nextInt() ;

        }
    }
class Main 
{
    public static void exit()
    {
        System.out.print("Thanks for visiting!") ;
    }
    public static void main(String args[])
    {
        System.out.print("Library Portal Initialized….") ;
        System.out.print("\n") ;
        System.out.print("\n") ;
        System.out.println("1. Enter as a librarian") ;
        System.out.println("2. Enter as a member") ;
        System.out.println("3. Exit") ;
        Scanner sc = new Scanner(Systme.in) ;
        int choice =  sc.nextInt() ;
        if(choice==1)
        {
            Liberarian lb = new Liberarian() ;
            System.out.println("1. Register a member ") ;
            System.out.println("2. Remove a member") ;
            System.out.println("3. Add a book ") ;
            System.out.prinln("4. Remove a book ") ;
            System.out.println("5. View all members along with their books and fines to be paid") ;
            System.out.println("6.View all books ") ;
            System.out.println("7. Back") ;
            System.out.prinln("enter the choice") ;
            int interchoice  = sc.nextInt() ;
            if(interchoice==1)
            {
                lb.register() ;
            }
            else if(interchocie==2)
            {
                lb.removemember()
            }
            else if(intechoice==3)
            {
                lb.add() ;

            }
            else if(interchoice ==4)
            {
                lb.removebook() ;
            }
            else if(interchoice==5)
            {
                lb.view() ;
            }
            else if(interchoice==6)
            {
                lb.viewbook() ;

            }
            else if(interchoice==7)
            {
                lb.back() ;
            }
            else 
            {
                System.out.print("Invlaid choice") ;
            }

                              
        }
        else if(choice==2)
        {
            member() ;
        }
        else 
        {
            exit()  ;
        }
    }
}
