package com.labtwo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int result = 100/0;
	}
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e);
			e.toString();
			System.out.println("Arithmetic Exception Caught");
			e.printStackTrace();
			
		}

	}}
