interface Triangle
{
    void type_of_triangle();
}
class EquilateralTriangle implements Triangle
{
    public void type_of_triangle()
    {
        System.out.println("3 sides are equal");
    }
}
class IsoscelesTriangle implements Triangle
{
    public void type_of_triangle()
    {
        System.out.println("2 sides are equal");
    }
}
class ScaleneTriangle implements Triangle
{
    public void type_of_triangle()
    {
        System.out.println("3 sides are different");
    }
}
class TriangleMain
{
    public static void main(String[] args)
    {
        Triangle t;
        t = new EquilateralTriangle();
        t.type_of_triangle();
        t = new IsoscelesTriangle();
        t.type_of_triangle();
        t = new ScaleneTriangle();
        t.type_of_triangle();
    }
}