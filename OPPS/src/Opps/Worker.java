package Opps;

public class Worker extends Emp {
	 private int hoursWorked;
	 private int hourlyrent;
	public Worker(String firstname, String lastname, int deptid, double basic_sal,int hourlyrent,int hoursWorked) {
		super(firstname, lastname, deptid, basic_sal);
		this.hourlyrent=hourlyrent;
		this.hoursWorked=hoursWorked;
	}
	@Override
	public String toString()
	{
		return super.toString();
		}
	@Override
	public double computesal() {
		// TODO Auto-generated method stub
		return (super.getBasic_sal()+hourlyrent*hoursWorked);
	}
	public int getHourlyrent() {
		return hourlyrent;
	}
	
	

}
