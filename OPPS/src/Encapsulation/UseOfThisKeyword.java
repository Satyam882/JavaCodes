package Encapsulation;

public class UseOfThisKeyword
{
	int i;
	UseOfThisKeyword()
	{
		//this.i=i;
		System.out.println("hello");
		
	}
	
	UseOfThisKeyword(int a)
		{
			//System.out.println(i);
			//display();
			//this.display();
		this();
		System.out.println("parameterize cons");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfThisKeyword u=new UseOfThisKeyword(10);
		//u.setvalue();
		//u.show();
	}

}
