import java.util.*;
class PCA1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int t=n;
        while(t>0){
            sum = sum + t%10;
            t = t/10;
        }
        if(n%sum==0){
            System.out.println(n+" is divisible by sum of its digits");
        }
        else{
            System.out.println(n+" is not divisible by sum of its digits");
        }
    }
}
