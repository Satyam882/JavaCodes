package Opps;

import java.util.Scanner;
public class TesterEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		Emp[]emp=new Emp [size];
		int count=0;
		int ch;
		System.out.println("1.hire manager\n2.hire worker\n3.show details\n4.update basic_sal\n5.exit");
		do
		{
			
			System.out.println("enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				if(count<emp.length) {
					System.out.println("enter manager details firstName, lastName , deptId , basic,perbonus");
					emp[count]=new Mgr(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());
					count++;
				}
				else
					System.out.println("sory array is full");
				break;
			case 2:
				if(count<emp.length) {
					System.out.println("enter worker details firstName, lastName , deptId , basic,hourlyrent, hoursWorked");
					emp[count]=new Worker(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
					count++;
					
				}
				else
					System.out.println("index out of bound");
				break;
			case 3:
				int i=0;
				for(Emp emp1:emp)
				{
					if(i<count)
						System.out.println(emp1.toString()+"net salary="+emp1.computesal());
					else break;
					
				}
				break;
			case 4:
				System.out.println("enter empid");
				int id=sc.nextInt();
				boolean flag=false;
				for(int j=0;j<count;j++)
				{
					if(emp[j].getId()==id)
					{
						System.out.println("enter your salary to update");
						emp[j].setBasic_sal(sc.nextDouble());
						flag=true;
						break;
				}
				}
					if(flag==false)
					{
						System.out.println("invalid id");
					}
				
				break;
				
			case 5:
				System.out.println("enter valid choice");
				break;
				default :
			}
			
			
		
				
		}
		while(ch!=5);
		

	}

}
