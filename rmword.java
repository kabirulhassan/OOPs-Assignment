import java.util.*;
class Rmword
{   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        System.out.print("Enter the word to be removed: ");
        String word=sc.nextLine();
        str = str.trim();
        str+= " ";
        String z = "",w="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                w=w+str.charAt(i);
            }
            else
            {
                if(!w.equals(word))
                {
                    z=z+w+" ";
                }
                w="";
            }
        }
        System.out.println("final string is: "+ z);
    }
}
