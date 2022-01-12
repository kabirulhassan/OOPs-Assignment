public class Discount {
    public static void main(String[] args) {
        double amount = Double.parseDouble(args[0]);
        double discount;
        if(amount>=50000)
            discount = 0.15;
        else if(amount>=25000)
            discount = 0.1;
        else if(amount>=10000)
            discount = 0.05;
        else if(amount>=5000)
            discount = 0.02;
        else
            discount = 0;
        discount*=amount;
        double billamount = amount;
        amount-=discount;
        System.out.println("\nBill Amount: "+billamount+"\tDiscount: "+discount+"\nPayable amount: "+amount);
    }
}
