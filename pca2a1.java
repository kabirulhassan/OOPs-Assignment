import java.util.*;
class Product
{
    static int product(int A[],int i)
    {
        if(i==3)
            return -1;
        int p=1;
        for(;i<3;i++)
            p*=A[i];
        return p;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int A[]=new int[3];
        int x=0;
        for(int i=0;i<3;i++)
        {
            A[i]=sc.nextInt();
            if(A[i]==7)
                x=i+1;
        }
        System.out.println("The product of the numbers is "+product(A,x));        
    }
}