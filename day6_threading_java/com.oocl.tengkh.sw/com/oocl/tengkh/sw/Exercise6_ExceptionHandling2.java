package com.oocl.tengkh.sw;

import java.util.Scanner;

/*Exercise 3: Exception Handling
Create three new types of exceptions. Write a class with a method that throws all three. 
In main(), call the method but only use a single catch clause that will catch all three types of exceptions. 
*/


public class Exercise6_ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExceptions exceptions = new ThrowExceptions();
		try {
		exceptions.One();
		}
		catch(Exception e) {
			System.out.println("Exception has been handled.");
		}
		
	}

}

class ThrowExceptions{
	
	public void One() {
	String foo = null;
	int length = foo.length();
	}
	
	
}