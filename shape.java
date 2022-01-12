import java.util.*;
class Shape
{
    void area(double r)
    {
        // calculate the area of circle given radius r
        double area = (22.0/7) * r * r;
        // display the area of circle
        System.out.println("Area of circle: " + area);
    }

    void area(double b, double h)
    {
        // calculate the area of triangle given base 'b' and height 'h'
        double area = (b * h)/2.0;
        // display the area of triangle
        System.out.println("Area of triangle: " + area);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Shape obj = new Shape();
        // call the overloaded method area
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        obj.area(r);
        System.out.println("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        obj.area(b, h);
    }
}

