package Opps;
//abstraction is implementation hideing
//encapsolation is information hideing
//by using abstract class
// by using interface(100%)abstraction
//
public class JavaAbstraction {
	 abstract class vehicle
	{
		int  tyres;
		 abstract void start();
		
	}

	 class car extends vehicle
	 {
		 void start()
		 {
			 System.out.println("start with key");
		 }
	 }
	 class scooter extends vehicle
	 {
		 void start()
		 {
			 System.out.println("start with kick");
		 }
	 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car c=new car();
		//c.start();
		//scooter s=new scooter();
		//s.start();
	}
}


