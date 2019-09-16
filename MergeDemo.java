import java.util.Scanner;
class Merge 
{
	int a[];
	int n;
	Merge(int n1)
	{
		this.n=n1;
		a=new int [this.n];
	}
	void readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	void displayArray()
	{
		System.out.println("THE ELEMENTS IN THE ARRAY are:");
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
	}
	void mergeArray(Merge b)
	{
		int c[]=new int[this.n+b.a.length];
		System.arraycopy(this.a,0,c,0,this.n);
		System.arraycopy(b.a,0,c,this.n,a.length);
		this.a=c;
	}
}
class MergeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS OF FIRST ARRAY:");
		int n=sc.nextInt();
		Merge m1=new Merge(n);
		m1.readArray();
		System.out.println("ENTER THE NUMBER OF ELEMENTS OF SECOND ARRAY:");
		n=sc.nextInt();
		Merge m2=new Merge(n);
		m2.readArray();
		System.out.println("\n\n********************************************************************\n");
		m1.displayArray();
		m2.displayArray();
		m1.mergeArray(m2);
		m1.displayArray();
	}
}