import java.util.*;
class Main 
{
    public static class ZerostarPoint extends Exception 
    {
        public ZerostarPoint(String message)
        {
            super(message) ;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in) ;
        try 
        {
            String pin  = sc.next() ;
            int size  = pin.length() ;
            char[] array = pin.toCharArray();
            System.out.println(" "+size) ;
            for(int i  = 0  ; i<size ;  i++)
            {
               
                if(array[i] == '0')
                {
                    throw new ZerostarPoint("this is not a valid number overall then ") ;
                }

            }

        }
        catch(InputMismatchException e)
        {
            throw new InputMismatchException("This is Invalid input") ;
            
        }
        catch(ZerostarPoint e)
        {
            System.out.println(" "+e.getMessage()) ;
        }
    }
}
