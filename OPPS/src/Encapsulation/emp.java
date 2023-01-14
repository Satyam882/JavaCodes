package Encapsulation;


public class emp
{
	private int empid;
	//data hiding
	public void setempid(int empid1)
	{
		empid=empid1;
	}
	public int getempid()
	{
		return empid;
	}

//encapsulation
public static void main(String[] agrs)
{
		emp e=new emp();
		e.getempid();
		e.setempid(101);
		System.out.println(" "+e.getempid());
}
}