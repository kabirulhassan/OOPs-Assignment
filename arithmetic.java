import java.util.Scanner;

class Arithmetic
{
	double add(double a,double b)
	{
		return a+b;
	}
	double subtract(double a,double b)
	{
		return a-b;
	}
	double multiply(double a,double b)
	{
		return a*b;
	}
	double divide(double a,double b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Arithmetic ob = new Arithmetic();
		double a,b,result = 0;
		for(char ch=' ';ch!='n';)
		{
			System.out.println("Enter operator1, operand and operator2: ");
			a = sc.nextDouble();
			ch = sc.next().charAt(0);
			b = sc.nextDouble();
			switch(ch)
			{
				case '+':
					result = ob.add(a,b);
					break;
				case '-':
					result = ob.subtract(a,b);
					break;
				case '*':
					result = ob.multiply(a,b);
					break;
				case '/':
					result = ob.divide(a,b);
					break;
				default:
					System.out.println("Wrong choice");
					break;
			}
			System.out.println("result: "+result);
			System.out.println("Enter any character to continue or 'n' to stop: ");
			ch = sc.next().charAt(0);
		}
	}
}
	
