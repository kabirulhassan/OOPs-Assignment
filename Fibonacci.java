public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);
        int a=0,b=1,c=1,count=2;
        if(n==1)
            System.out.println(a);
        else
        {
            System.out.print(a+" "+b);
            for(;count<n;count++)
            {
                System.out.print(" "+c);
                c=a+b;
                a=b;
                b=c;
            }
        }
        System.out.println();
    }
}
