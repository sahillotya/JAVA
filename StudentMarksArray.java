import java.util.Scanner;
class StudentMarks 
{
	private double marks[][];
	StudentMarks(int n)
	{
		marks=new double [n][3];
	}
	void readData()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the marks of subjects of Student"+(i+1));
			marks[i][0]=s.nextDouble();
			marks[i][1]=s.nextDouble();
			marks[i][2]=s.nextDouble();
		}
	}
	void totalMarks()
	{
		double total=0;
		for(int i=0;i<marks.length;i++)
		{
			total=marks[i][0]+marks[i][1]+marks[i][2];
			System.out.println("*******TOTAL MARKS OF Student "+(i+1)+" is "+total+"********\n");
		}
	}
	void highestinSubject()
	{
		int max,i,j;
		for(i=0;i<marks[0].length;i++)
		{
			max=0;
			for(j=1;j<marks.length;j++)
			{
				if(marks[max][i]<marks[j][i])
					max=j;
			}
			System.out.println("*********HIGHEST MARKS IN SUBJECT "+(i+1)+" is: "+marks[max][i]+"of STUDENT "+(max+1)+"************\n");
		}
	}
	void highestTotalMarks()
	{
		double total1=0,total2=0;
		int max,i,j=0;
		max=0;
		total1=marks[max][0]+marks[max][1]+marks[max][2];
		for(i=1;i<marks.length;i++)
		{
				total2=marks[i][0]+marks[i][1]+marks[i][2];
				if(total1<total2)
					max=i;
				total1=marks[max][0]+marks[max][1]+marks[max][2];
		}
		System.out.println("***********HIGHEST TOTAL MARKS OF ALL IS: "+total1+"of STUDENT"+(max+1)+"**********\n");
	}
}
class StudentMarksArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=s.nextInt();
		if(n>0)
		{
			StudentMarks s1=new StudentMarks(n);
			s1.readData();
			int op;
			do 
			{
				System.out.println("ENTER YOUR CHOICE \n1.TOTAL MARKS OF EACH STUDENT \n2.HIGHEST MARKS IN EACH SUBJECT \n3.HIGHEST TOTAL MARKS\nANY OTHER KEY WILL RESULT IN EXIT");
				op=s.nextInt();
				switch(op)
				{
					case 1:s1.totalMarks();
							break;
					case 2:s1.highestinSubject();
							break;
					case 3:s1.highestTotalMarks();
							break;
				}
			}while(op>0 && op<4);
		}
		else
			System.out.print("INVALID INPUT");
	}
}