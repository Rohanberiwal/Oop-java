import java.util.*;
import java.util.ArrayList ;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.Duration;
import java.util.Iterator;

class Main
{
    
    static ArrayList<Member> list = new ArrayList<>();
    static ArrayList<Book> bookstorage = new ArrayList<>();
    static HashMap<Member, Integer  > finesMap = new HashMap<>();
    static ArrayList<Member> memberlist = new ArrayList<>(list);
    static HashMap<Member, Book> mybook = new HashMap<>() ;
    static HashMap<Book , Long > issuetime  = new HashMap<>() ;
    static HashMap<Member  , ArrayList<Book>> possiblebook =  new HashMap<>() ;
    //static ArrayList<Book> booklist = new ArrayList<>();
    static HashMap<Member , Book> returnbook = new HashMap<>() ;
    public static long array[] = new long [3];
    static Member member = new Member() ;
    static Member ms = new Member() ;
    static Book book = new Book()  ;
public static  class Book
{
    String title  ; 
    String Author  ;
    int  total_copies  ;
    int book_id ;
    public long issuetime  ;
    public long returntime  ;
    public String getTitle()
    {
        return title ;
    }
    public String getAuthor()
    {
        return Author ; 
    }
    public int getCopy()
    {
        return total_copies ;
    }
    public int getId()
    {
            return book_id  ;
    }
    public void setTitle(String title)
    {
        this.title = title ;
    }
    public void setAuthor(String Author)
    {
        this.Author  = Author ;
    }
    public void setCopy(int total_copies)
    {
        this.total_copies = total_copies;
    }
    public void setId(int book_id)
    {
        this.book_id =  book_id ; 
    }
    public long  getissuetime()
    {
        return issuetime ; 
    }
    public void setissuetime(long issuetime)
    {
        this.issuetime  = issuetime ;
    }
    public long getreturntime()
    {
        return returntime ;
    }
    public void setrettime(long returntime)
    {
        this.returntime  = returntime  ;
    } 

}
public static  class Member 
{
    String name  ;
    int age  ;
    BigInteger  phone_no   ;
    public int fine  ;
    public int count = list.size() +1;
    public int memberide  = count ;
    ArrayList<Book> booklist = new ArrayList<>();
    public String getName()
    {
        return name ;
    }
    public int getAge() 
    {
        return age  ;
    }
    public BigInteger getPhone() 
    {
        return phone_no ;
    }
    public void setName(String name)
    {
        this.name  = name ;
    }
    public void setAge(int age)
    {
     
        this.age = age ;
    }
    public void setPhone(BigInteger phone_no)
    {
        this.phone_no  = phone_no ;
    } 
    public int  getMemberide()
    {
        return memberide ;
    } 
    public void setMemberide(int memberide)
    {
        this.memberide = memberide ;
    }
    public int getfine()
    {
        return fine ;
    }
    public void setfine(int fine)
    {
        this.fine  = fine ;
    }
    public int memeberid()
    {
       count ++ ;
       return count  ;
    }
    public List<Book> getIssuedBooks() {
        return booklist;
    }

    public void addIssuedBook(Book book) {
        booklist.add(book);
    }
    public void removeIssuedBook(Book book) {
        booklist.remove(book);
    }
    public void showbook()
    {
        System.out.println("**Avaible Books**") ;
        System.out.print("\n");
        for(Book book : bookstorage)
        {
            if(book.getCopy()>0)
            {
                System.out.println("********") ;
                System.out.println("Title : "+book.getTitle()) ;
                System.out.println("Author : "+book.getAuthor()) ;
                System.out.println("No of Copies : "+book.getCopy()) ;
                System.out.println("BookId : "+book.getId()) ;
                System.out.print("********") ;
                 System.out.print("\n");
            }
            else if(bookstorage.size()== 0)
            {
                System.out.print("There is no registered book in the queue") ;
            }
        }
    }
    
public void issue(int important, Member ms) {
    System.out.println("Available books:");
    for (Book book : bookstorage) {
        if (book.getCopy() > 0) {
            System.out.println("*******************");
            System.out.println("Name: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Copies: " + book.getCopy());
            System.out.println("Id number: " + book.getId());
            System.out.println("*******************");
        }
    }

    Scanner iss = new Scanner(System.in);
    System.out.println("Enter the book id:");
    int idbook = iss.nextInt();
    System.out.println("Enter the name of the book:");
    String namebook = iss.next();

    for (Book book : bookstorage) {
        if (book.getId() == idbook && book.getTitle().equals(namebook) && book.getCopy() > 0 && ms.getfine()==0) {
            if (member.getIssuedBooks().size()<2) {
                System.out.println("Book Issued!!");
                array[0] = System.currentTimeMillis() ;
                book.setissuetime(array[0]);
                System.out.println(book.getissuetime());
                book.setCopy(book.getCopy() - 1);
                booklist.add(book);
                possiblebook.put(ms, booklist);
                //issuetime.put(book , array[0]);
            } else {
                System.out.println("You cannot issue more than 2 books.");
            }
        }
    }
    if (possiblebook.containsKey(ms)) {
            //List<Book> bookl = booklist.get(member);

            System.out.println("Books issued to " + " (ID: " + important + "):");

            for (Book book : ms.booklist) {
                System.out.println("  Book Title: " + book.getTitle() + " (ID: " + book.getId() + ")");
            }
        } else {
            System.out.println("No books issued ");
        }
    
}


  public void mybooklist(Member ms) {
    System.out.println("******* Your Issued Books ********");
    int count = 0;

    for (Map.Entry<Member, ArrayList<Book>> entry : possiblebook.entrySet()) {
        Member mem = entry.getKey();
        ArrayList<Book> books = entry.getValue();

        if (mem.getMemberide() == ms.getMemberide()) {
            for (Book book : books) {
                System.out.println("*******************");
                System.out.println("Name: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Copies: " + book.getCopy());
                System.out.println("Id number: " + book.getId());
                System.out.println("*******************");
                count++;
            }
        }
    }

    if (count == 0) {
        System.out.println("You have not issued any books.");
    }
}



     
    
    public void returnbook(Member ms  , int important)
    {
        Scanner sct = new Scanner(System.in);
        System.out.println("enter the book id ");
        int bookidnumber =  sct.nextInt() ;
        System.out.println("enter the book name");
        String bookName  = sct.next() ;
        for (Map.Entry<Member, ArrayList<Book>> entry : possiblebook.entrySet()) {
        Member mem = entry.getKey();
        ArrayList<Book> booklist = entry.getValue();

        if (mem.getMemberide() == ms.getMemberide()  ) {
            System.out.println("Your issued books ");
            for (Book book : booklist) {
                System.out.println("*******************");
                System.out.println("Name: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Copies: " + book.getCopy());
                System.out.println("Id number: " + book.getId());
                System.out.println("*******************");
                count++;
            }
            for(Book book  : ms.booklist)
            {
            if(book.getId() ==bookidnumber  && book.getTitle().equals(bookName))
            {
                System.out.println("Book returned from <id> "+ important);
                ms.booklist.remove(book) ;
                book.setCopy(book.getCopy()+1);
                array[1] = System.currentTimeMillis() ;
                int diff  =(int)(array[1]-book.getissuetime());
               // System.out.println(diff) ;
                int fine  = (diff-10)/1000 ;
                int total  = fine*3 ;
                //System.out.println(fine) ;
                if(total>0)
                {
                System.out.println("fine : "+ total + " Rupees ") ;
                mem.setfine(total) ;
                }
                else 
                {
                    mem.setfine(0) ;
                    
                }
                finesMap.put(mem , total) ;
                break  ;
            }
        }
        }
        
    }
              
        
    }
    public void payfine(Member ms) {
    for (Map.Entry<Member , Integer> entry : finesMap.entrySet()) {
        Member key = entry.getKey() ;
        if (ms.getMemberide() == key.getMemberide()) {
            System.out.println("Your fine "+ms.getfine()+ " Rupees is paid");
            ms.setfine(0) ;
            finesMap.put(ms,  0);
            break; 
        }
    }
    }



}


public static class Liberarian
    {

        Scanner ls = new Scanner(System.in) ;
        public void register()
        {
            Member m1  = new Member() ;
            System.out.print("Name") ;
            String name =  ls.nextLine() ;
            m1.setName(name) ;
            System.out.print("Age");
            int ag = ls.nextInt() ;
            m1.setAge(ag) ;
            System.out.print("Phone ") ;
            BigInteger  ph = ls.nextBigInteger() ;
            m1.setPhone(ph);
            Boolean registerflag = true ;
            Iterator<Member> listIterator = list.iterator();
            while (listIterator.hasNext()) {
            Member mem = listIterator.next();
            if (mem.getPhone().equals(ph)) {
                System.out.println("Phone number already registered.");
                registerflag = true ;
                break; 
            }
        }

        if (registerflag!=false) {
            System.out.println("Member Successfully Registered with Id number: " + m1.getMemberide());
            list.add(m1);
        }

        }
        public  void addbook()
        {
            boolean flagtocheck = true ;
            Book book1 = new Book() ;
            System.out.print("Name") ;
            String n= ls.nextLine() ;
            book1.setTitle(n);
            System.out.print("Author ") ;
            String t = ls.nextLine() ;
            book1.setAuthor(t);
            System.out.print("Copies");
            int cpy  = ls.nextInt();
            book1.setCopy(cpy);
            System.out.print("Book_Id");
            int book_id = ls.nextInt() ;
            book1.setId(book_id);
           // System.out.println("Book Added Successfully!") ;
            for(Book book :bookstorage)
            {
                if(book.getId()==book_id)
                {
                   flagtocheck = false;
                }
                else 
                {
                   flagtocheck = true  ;
                }
            }
            if(flagtocheck==true)
            {
                System.out.println("Book Added Successfully!") ;
                bookstorage.add(book1) ;
            }
            else 
            {
                System.out.println("The book id Already exist");
            }
        }
        public void removebook()
        {
            System.out.print("enter the ID of the book ") ;
            int ide   = ls.nextInt() ;
            Book removed = null;
        for (Book book : bookstorage) {
            if (book.getId() == ide) {
                removed = book;
                break;
            }
        }
        
        if (removed != null) {
            bookstorage.remove(removed);
        }
        System.out.println("List of Avaible Books ") ;
        // Print the updated book list
        for (Book book : bookstorage) {
            System.out.println("***************** ") ;
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getCopy());
            System.out.println("ID: " + book.getId());
            System.out.println("*****************") ;
            System.out.println();
        }
    }
       
        public void removemember()
        {
            if(list.size()==0)
            {
                System.out.println("The registration List is empty ");
            }
            else 
            {
            System.out.print("enter the Phonenumber  of person ") ;
            BigInteger  bs   = ls.nextBigInteger() ;
            boolean Flag= false;
            for (Member member : list) {
            if (member.getPhone().equals(bs)) {
                Flag = true;
                break ;
            }
            else 
            {
            Flag = false ;
            }
        }
            Iterator<Member> iterator = list.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (member.getPhone().equals(bs)) {
                iterator.remove(); 
                System.out.println("The member with <member ID > "+ member.getMemberide()+ " is removed ");
            }
        }
        if(Flag != true)
        {
            System.out.print("The phone number not found ");
        }

        }
        
     
        }
        // Function to view all books starts here
        public void viewbook() 
        {
            if (bookstorage.isEmpty())
            {
                System.out.print("There is not book added in the queue ") ;
            }
            else if(bookstorage.isEmpty()!=true)
            {
           for(Book b : bookstorage)
           {
                System.out.println("*******************");
                System.out.println("Name : "+b.getTitle()) ;
                System.out.println("Author : "+b.getAuthor()) ;
                System.out.println("copy : "+b.getCopy()) ;
                System.out.println("Id : "+b.getId()) ;
                System.out.println("*******************");
           }
        }
        
        }
        public void view() {
        for (Map.Entry<Member, ArrayList<Book>> entry : possiblebook.entrySet()) {
            Member member = entry.getKey();
            ArrayList<Book> books = entry.getValue();
            int fine = finesMap.getOrDefault(member, 0);

            if (fine > 0) {
                System.out.println("Member: " + member.getName() + " (ID: " + member.getMemberide() + ")");
                System.out.println("Fines: " + fine + " Rupees");

                System.out.println("Books with Fines:");
            
                System.out.println();
            }
            else 
            {
                System.out.println("No fine on any member ");
            }
        }
    }
        //ls.close() ;
    }
    // choice 3 starts here
    public static void exit()
    {
        System.out.print("Thanks for visiting!") ;
    }
    
    public static void error() 
    {
        System.out.println("Invalid credentials ");
    }
    //main starts here 
    public static void main(String[] args)
    {   boolean flag = false ;
        while(true)
        {
        System.out.print("\n");
        System.out.println("Library Portal Initialized….") ;
        System.out.print("\n") ;
        System.out.print("\n") ;
        System.out.println("1. Enter as a librarian") ;
        System.out.println("2. Enter as a member") ;
        System.out.println("3. Exit") ;
        Scanner sc = new Scanner(System.in) ;
        int choice =  sc.nextInt() ;
        if(choice==1)
        {
            while(true)
            {
            Liberarian lb = new Liberarian() ;
            System.out.println("\n");
            System.out.println("1. Register a member ") ;
            System.out.println("2. Remove a member") ;
            System.out.println("3. Add a book ") ;
            System.out.println("4. Remove a book ") ;
            System.out.println("5. View all members along with their books and fines to be paid") ;
            System.out.println("6.View all books ") ;
            System.out.println("7. Back") ;
            System.out.println("\n");
            System.out.println("enter the choice") ;
            int interchoice  = sc.nextInt() ;
            
            if(interchoice==1)
            {
                lb.register() ;
            }
            else if(interchoice==2)
            {
                lb.removemember() ;
            
            }
            else if(interchoice==3)
            {
               
                lb.addbook() ;

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
             
            break ;
             
            }
            else 
            {
                System.out.print("Invalid choice") ;
            }
            }

                             
        }
        else if(choice==2)
        {
            int important = 0;
            Scanner cd = new Scanner(System.in) ;
            boolean  fl  = false  ;
            System.out.println("Enter Your credentails") ;
            System.out.println("enter name") ;
            String creadname  = cd.nextLine() ;
            System.out.println("enter the Phone number ");
            BigInteger bg =  cd.nextBigInteger() ;
           // printmember() ;
          // boolean fl = false; // Initialize to false
for (Member member : list) {
    if (member.getPhone().equals(bg) && member.getName().equals(creadname)) {
        fl = true; 
        System.out.println("Welcome! " + member.getName() + "  member id " + (member.getMemberide()));
        important = member.getMemberide();
        System.out.println("\n");
        break; 
    }
    if (!fl) {
    fl = false;
    error(); 
}
}

            
            if(fl == true )
            {
            while(true)
            {
            Scanner lm = new Scanner(System.in) ;
            System.out.println("1. List Available Books") ;
            System.out.println("2. List My Books") ;
            System.out.println("3. Issue book") ;
            System.out.println("4. Return book") ;
            System.out.println("5. Pay Fine") ;
            System.out.println("6. Back") ;
            System.out.println("\n");
            System.out.println("enter ");
            int memchoice =  lm.nextInt() ;
            if(memchoice ==1)
            {
                ms.showbook() ;
            }
            else if (memchoice == 2)
            {
                ms.mybooklist(ms) ;
            }
            else if(memchoice==3)
            {
                important  = member.getMemberide() ;
                ms.issue(important ,ms) ;
            }
            else if (memchoice ==4)
            {
                important  = ms.getMemberide();
                ms.returnbook(ms , important);
              
            }
            else if(memchoice ==5)
            {
              ms.payfine(ms) ;
            }
            else if(memchoice ==6)
            {
               break ;
            }
            else 
            {
                System.out.print("Invalid number ");
            }
            }
            } 
            
              
    }
      else if(choice==3) 
        {
            exit()  ;
            break ; 
        }
        else 
        {
            System.out.print("Invlaid choice") ;
           ;
        }
    }
      
        
    }//while 
   
}//public static void main /main 
