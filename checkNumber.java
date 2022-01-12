import java.util.*;
class CheckNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String s = sc.nextLine();
        boolean flag = s.length() == 10;
        if(flag)
            for(int i=0;i<s.length();i++)
            {
                if(!Character.isDigit(s.charAt(i)))
                {
                    flag = false;
                    break;
                }
            }
        if(!(s.charAt(0)=='9'||s.charAt(0)=='8'||s.charAt(0)=='7'||s.charAt(0)=='6'))
            flag = false;
        if(flag)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
