package com.labtwo;

public class TestPansion {
	public void checkage(int age) throws PansionException{
		if (age < 65) {
		throw new PansionException ("Your cannot get pansion");
	
	}else 
	{
		System.out.println("Recive Your pansion");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPansion obj= new TestPansion();
		try 
				{
obj.checkage(61);
	}
catch (PansionException e)
		{
      e.printStackTrace();
	System.out.println("Exception Caught");
		}
		}
}



