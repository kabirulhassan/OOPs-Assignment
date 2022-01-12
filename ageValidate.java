import java.util.*;
class AgeException extends Exception 
{
    public AgeException(String str) 
    {
         super(str);
    }
}
class Age
{
    public static void main(String args[])throws AgeException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        try
        {
            if(age<18) 
                throw new AgeException("Invalid age");
            else
                System.out.println("Valid age");
        }
        catch(AgeException ageException)
        {
            System.out.println(ageException);
        }
    }
}