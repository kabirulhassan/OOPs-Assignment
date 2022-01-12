import java.util.*;
class Order
{
    int orderId;
    String orderedFoods, status;
    double totalPrice;
    Order(int orderId, String orderedFoods, double totalPrice, String status)
    {
        this.orderId=orderId;
        this.orderedFoods=orderedFoods;
        this.status=status;
    }
    void display()
    {
        System.out.println("Order Id: "+orderId);
        System.out.println("Ordered Foods: "+orderedFoods);
        System.out.println("Total Price: "+totalPrice);
        System.out.println("Status: "+status);
    }
    double calculateTotalPrice(int unitPrice)
    {
        this.totalPrice = unitPrice*0.05+unitPrice;
        return this.totalPrice;
    }
}
class OrderMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order id: ");
        int orderId=sc.nextInt();
        System.out.print("Enter the unit price: ");
        int unitPrice=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the ordered foods: ");
        String orderedFoods=sc.nextLine();
        Order o=new Order(orderId,orderedFoods,0,"Ordered");
        o.calculateTotalPrice(unitPrice);
        o.display();
    }
}