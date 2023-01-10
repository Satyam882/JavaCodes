package day3lab3;

public class MethodOverloading {
	public void display()
	{
		System.out.println("no parameter");
	}
	public void display(int a)
	{
		System.out.println(" with integer "+a);
	}
	public void display(int a, int b)
	{
		System.out.println(" with two integer "+a+" "+b);
	}
	public void display(int... a)
	{
		System.out.println("with "+(a.length+1)+" integer");
		for(int i=0;i<a.length;i++)
			System.out.print(" " +a[i]);
	}
	public void display(int r,String nm,float c)
	{
		System.out.println("int="+r+" string="+nm+" float="+c);
	}
	public void display(String nm,float c,int r)
	{
		System.out.println("string="+nm+" float="+c+" int="+r);
	}
	public void display(float c,int r,String nm)
	{
		System.out.println("\nfloat="+c+" int="+r+" string="+nm);
	}
	
	

}
