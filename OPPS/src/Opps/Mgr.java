package Opps;

public class Mgr extends Emp {

	private double perbonus;
	public Mgr(String firstname, String lastname, int deptid, double basic_sal,double perbonus) {
		super(firstname, lastname, deptid, basic_sal);
		// TODO Auto-generated constructor stub
		this.perbonus=perbonus;
	}
@Override
public String toString()
{
	return super.toString();
	
}
public double getPerbonus()
{
	return this.perbonus;
	
}
@Override
public double computesal() 
{
	return (super.getBasic_sal()+perbonus);
}




	}


