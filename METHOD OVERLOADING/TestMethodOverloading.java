package day3lab3;

public class TestMethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.display();
		obj.display(2);
		obj.display(4, 8);
		obj.display(1,2,3,45,56,666,778);
		obj.display(7.6f, 8, "nm");
		obj.display(8, "nm", 7.6f);
		obj.display("nm", 7.6f, 8);
		
		

	}

}
