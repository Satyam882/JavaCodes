package Encapsulation;


class test
{
	int i;
	void setvalue(int i)
	{
		this.i=i;
		//if do not use this kyword then i=i which give 0;
	}
	void show()
	{
		System.out.println(i);
	}
}

public class Thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.setvalue(10);
		t.show();//i=10
		}

}
