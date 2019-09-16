import java.util.Scanner;
class Pair
{
	int a[];
	Pair(int n)
	{
		Scanner s=new Scanner(System.in);
		a=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	}
	 public void findPairs()
	{
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value whose pair you want to find out:");
		int sum=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(sum==a[i]+a[j])
				{
					System.out.println((i+1)+" pair is: "+a[i]+" and "+a[j]);
					flag=true;
				}
			}
		}
		if(flag==false)
			System.out.println("**************THERE IS NO SUCH PAIR FOUND WHOSE SUM IS : "+sum+"***************");
	}
}
class ArraySumPair
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=s.nextInt();
		Pair p=new Pair(n);
		p.findPairs();
	}
}