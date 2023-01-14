package Fruit;

public class FruitTester {

	public static void main(String[] args) {
		
		Fruit1 f=new Banana();
		f.taste();
		((Banana)f).color();
		Fruit1 d=new Mango();
		d.taste();
		Mango m=new Mango();
		m.pulp();
		m.taste();
		Fruit1 a=new Alphanso();
		((Alphanso) a).jam();
		Fruit1 o=new Mendirean();
		((Mendirean) o).color();
		
		
		

	}

}
