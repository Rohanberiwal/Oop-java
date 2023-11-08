import java.util.*;
class Main 
{
    public static class InputError extends Exception
    {
        public InputError(String message)
        {
            super(message) ;
        }
    }
    public static void main(String[]  args)
    {
        try
        {
            Scanner sc = new Scanner(System.in) ;
            int nums  = sc.nextInt() ;
            if(nums==0)
            {
                throw new InputError(" This is not valid ") ;
            }

        }
        catch(InputMismatchException e )
        {
            throw new InputMismatchException(" This is inccorect ") ;
        }
        catch(InputError e )
        {
            System.out.println(""+e.getMessage())  ;
        }
    }
}
