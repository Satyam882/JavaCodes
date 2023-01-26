package lab1;
import java.util.Scanner;
public class Calculater {

	public static void main(String[] args) {
		// calculate sum,subs,multiplication,division,modulus
		int c,a,b;
		System.out.println("enter your choice");
		System.out.println("\n1.Add\n2.subs\n3.multi\n4.division\n5.modulas");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		do
		{
		
			
		switch(ch)
{
case 1:
	System.out.println("Display my result");
	 a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("c="+c);
	break;
case 2:
	System.out.println("Display my result");
	 a=sc.nextInt();
	b=sc.nextInt();
	c=a-b;
	System.out.println("c="+c);
	break;
case 3:
	System.out.println("Display my result");
	 a=sc.nextInt();
	b=sc.nextInt();
	c=a*b;
	System.out.println("c="+c);
	break;
case 4:
	System.out.println("Display my result");
	 a=sc.nextInt();
	b=sc.nextInt();
	c=a/b;
	System.out.println("c="+c);
	break;
case 5:
	System.out.println("Display my result");
	 a=sc.nextInt();
	b=sc.nextInt();
	c=a%b;
	System.out.println("c="+c);
	break;
	default :
		System.out.println("invalid choice");
break;
}
	

	}while(ch!=6);
	}

}