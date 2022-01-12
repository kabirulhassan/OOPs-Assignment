import java.util.*;
abstract class Figure
{
    double length,breadth;
    public Figure(double l, double b)
    {
    	length = l;
    	breadth = b;
    }
    abstract void area();
}
class Rectangle extends Figure
{
	public Rectangle(double l, double b)
    {
    	super(l,b);
    }
    @Override
    void area()
    {
        System.out.println("Area of the rectangle is : "+length*breadth);
    }
}
class Triangle extends Figure
{
    public Triangle(double l, double b)
    {
    	super(l,b);
    }
    @Override
    void area()
    {
        System.out.println("Area of the triangle is : "+breadth*length/2.0);
    }
}
class FigureMain
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        Figure obj;
        System.out.println("Enter the length and breadth of the rectangle");
        obj=new Rectangle(sc.nextDouble(),sc.nextDouble());
        obj.area();
        System.out.println("Enter the breadth and height of the triangle");
        obj=new Triangle(sc.nextDouble(),sc.nextDouble());
        obj.area();
    }
}
