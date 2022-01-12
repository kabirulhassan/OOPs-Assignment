class Grade
{
	public static void main(String args[])
	{
		double marks=Double.parseDouble(args[0]);
		char g='Z';
		if(marks<=100&&marks>=90)
			g='O';
		else if(marks<90&&marks>=80)
			g='E';
		else if(marks<80&&marks>=70)
			g='A';
		else if(marks<70&&marks>=60)
			g='B';
		else if(marks<60&&marks>=50)
			g='C';
		else if(marks<50&&marks>=0)
			g='F';
		else
			g='Z';
		System.out.println("Marks: "+marks+"\tGrade: "+g);
	}
}
	
