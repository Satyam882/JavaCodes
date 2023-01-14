package Encapsulation;
//final keyword use with variable method and class.
public class Finalkeyword {
	public static void main(String[] agrs)
	{
		final int i=10;
		//i=i+20; javac error
		
		System.out.println(i);
	}
	  class demo
	  //final keyword 
	{
		void m1()
		{
			System.out.println("i am demo");
		}
	}
	class test extends demo
	//then demo show error (javac error)
	{
		void m1()
		{
			System.out.println("i am test demo");
		}
	}

}
