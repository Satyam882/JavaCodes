package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked {
	public static void main(String args[])
	{
		try {
			FileInputStream f=new FileInputStream("d:/abc.txt");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}

}
//try
//{
	//risky code
//}
	//catch(exceptionclassname)
//{
	
//}