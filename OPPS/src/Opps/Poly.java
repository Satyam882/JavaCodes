package Opps;
//types polymorphism
//compile time (method overloading)by compiler
//run time (method overriding) by jvm
public class Poly {
	void show(int b,String s)
	{
		System.out.println("1");
	}
	void show(int a)
	{
		System.out.println("2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly p=new Poly();
p.show(10 ,"satyam");
	}

}
