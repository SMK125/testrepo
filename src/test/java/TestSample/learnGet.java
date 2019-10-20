package TestSample;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class learnGet {
	public static void main(String args[])
	{
		String s="Shonam";
		String reversed=reverseString(s);
		System.out.println("Reversed string is " + reversed);
			
	}
	public static String reverseString(String s)
	
	{
		if(s.isEmpty()) 
		{
			System.out.println("String is now empty");
			return s;
		}
		System.out.println("String at last is : " + s.substring(1));
		return reverseString(s.substring(1) + s.charAt(0));
	}

}
