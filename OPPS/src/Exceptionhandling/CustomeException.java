package Exceptionhandling;
import java.lang.Exception;
public class CustomeException extends Exception  {
	CustomeException()
	{
		super("you are under age");
	}
	CustomeException(String message)
	{
		super(message);
	}
	class voting
	{
		
	
	public static void main(String[] args) {
		
		int age=17;
		try
		{
			if(age<18)
			{
				throw new CustomeException();
			}	
		}
		catch(CustomeException e)
		{
			System.out.println("u are eligible");
		}
		

	}

	}
		
	

}
