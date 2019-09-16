import java.util.Scanner;
class Aboutarray2
{
	 int a[];
	 Aboutarray2(int n)
	 {
		 a=new int[n];
	 }
	void readArray(int n)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the elements one by one");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
	}
	void displayArray()
	{
		System.out.println("Elements in the array are:");
		for(int x:a)
		{
			System.out.print(""+x+"\t");
		}
		System.out.println("");
	}
	void searchArray(int x)
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				System.out.println("Element is found and present at "+i+" location");
				return;
			}
		}
		System.out.println("Element not found");
		return;	
	}
	void sortArray()
	{
		int y,j;
		for(int i=1;i<a.length;i++)
		{
			y=a[i];
			for(j=i-1;j>=0 && a[j]>y;j--)
				a[j+1]=a[j];
			a[j+1]=y;
		}
	}
}
class Arrayprgm2new
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=s.nextInt();
		Aboutarray2 b1=new Aboutarray2(n);
		b1.readArray(n);
		b1.displayArray();
		System.out.println("Enter the element to be found:");
		int x=s.nextInt();
		b1.searchArray(x);
		b1.sortArray();
		System.out.println("SORTED ARRAY");
		b1.displayArray();
	
	}
	
	
}