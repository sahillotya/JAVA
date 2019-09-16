import java.util.Scanner;
class StraightLines
{
	double points[][];
	int n;
	StraightLines(int n)
	{
		this.n=n;
		points=new double[this.n][2];
	}
	void givePoints()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<this.n;i++)
		{
			System.out.println("enter the point "+(i+1)+" in format x and y:");
			points[i][0]=s.nextDouble();
			points[i][1]=s.nextDouble();
		}
	}
	void Equation()
	{
		double term1=0,term2=0,term3=0,term4=0;
		int i;
		for(i=0;i<n;i++)
		{
			term1=term1+(points[i][0]*points[i][1]);
			term2=term2+points[i][0];
			term3=term3+points[i][1];
			term4=term4+points[i][0]*points[i][0];
		}
		double m=((n*term1)-(term2*term3))/((n*term4)-(term3*term3));
		double c=(term3-m*term2)/n;
		System.out.println("The equation who satisfies the given set of points is: \t y="+m+"x+("+c+")");		
	}
	
}
class StraightLineArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of points");
		int n1=sc.nextInt();
		if(n1>1)
		{
			StraightLines s1=new StraightLines(n1);
			s1.givePoints();
			s1.Equation();
		}
		else
			System.out.println("invalid input");
		
	}
}