import java.util.*;
class Loan
{
    boolean checkNumber(int accNumber)
    {
        if(accNumber>=1000 && accNumber<2000)
            return true;
        else
            return false;
    }
    boolean checkAmount(double expectedAmount, double amount, int expectedEMI, int emi)
    {
        if(expectedAmount<=amount && expectedEMI<=emi)
            return true;
        else
            return false;
    }
    void eligibility(int type, double salary,double balance, double expectedAmount, int expectedEMI)
    {
        boolean eligible=false;
        double eligibleAmount=0;
        int eligibleEMI=0;
        if(balance>1000)
        {
            if(type==1)
            {
                if(salary>25000)
                {
                    eligibleAmount = 500000;
                    eligibleEMI = 36;
                    if(checkAmount(expectedAmount,eligibleAmount,expectedEMI,eligibleEMI))
                        eligible=true;
                }
            }
            else if(type==2)
            {
                if(salary>50000)
                {
                    eligibleAmount = 6000000;
                    eligibleEMI = 60;
                    if(checkAmount(expectedAmount,eligibleAmount,expectedEMI,eligibleEMI))
                        eligible=true;
                }
            }
            else if(type==3)
            {
                if(salary>75000)
                {
                    eligibleAmount = 7500000;
                    eligibleEMI = 84;
                    if(checkAmount(expectedAmount,eligibleAmount,expectedEMI,eligibleEMI))
                        eligible=true;
                }
            }
        }
        if(eligible)
            System.out.println("Eligible\nEligible Loan amount: "+eligibleAmount+"\nELigible EMI: "+eligibleEMI);
        else
            System.out.println("Not Eligible for loan please try again.");
    }
}
class LoanMain
{
    public static void main(String[] args)
    {
        Loan l=new Loan();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int accNumber=sc.nextInt();
        System.out.print("Enter your salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter your balance: ");
        double balance=sc.nextDouble();
        System.out.print("Enter your expected amount: ");
        double expectedAmount=sc.nextDouble();
        System.out.print("Enter your expected EMI: ");
        int expectedEMI=sc.nextInt();
        if(l.checkNumber(accNumber))
        {
            System.out.print("Enter your loan type: ");
            String typeStr = sc.next();
            int type=0;
            if(typeStr.equalsIgnoreCase("car"))
                type=1;
            else if(typeStr.equalsIgnoreCase("home"))
                type=2;
            else if(typeStr.equalsIgnoreCase("business"))
                type=3;
            else
                System.out.println("Invalid loan type");
            if(type!=0)
                l.eligibility(type,salary,balance,expectedAmount,expectedEMI);
        }
        else
            System.out.println("Invalid account number.");
    }
}