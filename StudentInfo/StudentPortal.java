package lab4;
import java.util.Scanner;
public class StudentPortal {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StudentInfo obj=new StudentInfo();
		System.out.println("Enter roll no and marks of three sub resp");
		float total=obj.acceptInfo(sc.nextInt(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		float per=total/3;
		obj.display();
		System.out.println("\ntotal is "+total+"\npercentage is "+per);
		

	}

}
