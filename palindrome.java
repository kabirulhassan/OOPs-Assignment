import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
            rev = rev + str.charAt(i);
        if(str.equals(rev))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a palindrome");
    }    
}
