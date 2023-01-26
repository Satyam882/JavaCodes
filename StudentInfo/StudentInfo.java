package lab4;
//1:Write a program to create student class with data members rollno, marks1,
//mark2,mark3.Accept data (acceptInfo()) and display  using display member
//function.Also display total,percentage and grade.

public class StudentInfo {
	private int rollno;
	private float marks[]=new float[3];
	public float acceptInfo(int rno,float... mks)
	{
		float total=0;
		rollno =rno;
		for(int i=0;i<3;i++)
			marks[i]=mks[i];
		for(int i=0;i<3;i++)
			total=total+mks[i];
		return total;
		
	}
public void display()
{
	System.out.println("roll no="+rollno+"\n");
	System.out.print("marks are");
	for(int i=0;i<3;i++)
		System.out.print(marks[i]+" ");
}

	}


