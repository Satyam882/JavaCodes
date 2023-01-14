package Encapsulation;

public class superKeyword {
	//this keyword ref vareable is ref current class varialble
	//super keyword ref variable is ref to extends class
	int a=10;
}

	class B extends superKeyword
	
	{
		int a=20;
		
	
	void show(int a)
	{
		System.out.println(a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		ob.show(30);

	}
	}

