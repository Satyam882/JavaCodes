package Opps;
//Emp problems
public abstract class Emp {
private int id;
private String firstname;
private String lastname;
private int deptid;
private double basic_sal;
private static int tempid;
static {
	tempid=1;
}
public Emp(String firstname,String lastname,int deptid,double basic_sal)
{
	this.id=tempid;
	this.firstname=firstname;
	this.lastname=lastname;
	this.deptid=deptid;
	this.basic_sal=basic_sal;
	tempid++;
	
}
@Override
public String toString() {
	return "id= " +id+" firstname= "+firstname+"lastname= "+lastname+"deptid="+deptid+"basic_sal= "+basic_sal;
}

//public  double netsal() {
//	return netsal;
//}
public double getBasic_sal() {
	return basic_sal;
}
public int getId()
{
	return id;
}

public void setBasic_sal(double basic_sal) {
	this.basic_sal = this.basic_sal+basic_sal;
}
public abstract double computesal();


}
